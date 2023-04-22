package es.um.uschema.xtext.skiql.generator.reducer

import es.um.uschema.USchema.Aggregate
import es.um.uschema.USchema.EntityType
import es.um.uschema.USchema.Reference
import es.um.uschema.USchema.USchema

import java.util.AbstractMap
import java.util.LinkedList
import java.util.List
import java.util.Map

import es.um.uschema.xtext.skiql.SkiQLModel
import es.um.uschema.xtext.skiql.SchemaQuery
import es.um.uschema.xtext.skiql.EntitySpec
import es.um.uschema.xtext.skiql.RelationshipTypeSpec
import es.um.uschema.xtext.skiql.SchemaSpec
import es.um.uschema.xtext.skiql.RelationshipQuery
import es.um.uschema.xtext.skiql.AggregationSpec
import es.um.uschema.xtext.skiql.ReferenceSpec
import es.um.uschema.xtext.skiql.RelationshipExpression
import es.um.uschema.xtext.skiql.RelationSpec
import es.um.uschema.xtext.skiql.EntityExpression
import es.um.uschema.xtext.skiql.RelationshipSpec

import es.um.uschema.xtext.skiql.query.USchemaQuery
import es.um.uschema.xtext.skiql.RelationshipType
import es.um.uschema.xtext.skiql.PrimitiveType

class USchemaReducer {

	static final String SHOW = "SHOW|";
	
	var SkiQLModel skiqlModel
	var USchema uSchemaModel
	var USchema resultingUSchemaModel
	
	val USchemaCopier uSchemaCopier
	val USchemaQuery uSchemaQuery
	val Map<EntityType, Map<EntityType, List<List<EntityType>>>> dijkstraMap
	
	new(SkiQLModel skiqlModel, USchema uSchemaModel) {
		this.skiqlModel = skiqlModel
		this.uSchemaModel = uSchemaModel
		this.uSchemaCopier = new USchemaCopier()
		this.uSchemaQuery = new USchemaQuery()		
		this.dijkstraMap = newHashMap		
		dijkstraMap()
		
		this.resultingUSchemaModel = uSchemaCopier.copy(this.uSchemaModel)
	}

	private def void dijkstraMap() {
		uSchemaModel.entities.forEach[e | 
			val innerMap = newHashMap
			dijkstraMap.put(e, innerMap)

			e.variations.forEach[ v | 
				v.logicalFeatures.filter[lf | lf instanceof Reference].map[lf | Reference.cast(lf) ].forEach[r | 
					val path = newLinkedList
					path.add(e)
					val paths = new LinkedList<List<EntityType>>()
					paths.add(path)
					innerMap.put(r.refsTo, paths)
				]
				v.structuralFeatures.filter[sf | sf instanceof Aggregate].map[sf | Aggregate.cast(sf) ].flatMap[a | a.aggregates].forEach[ag | 
					val path = newLinkedList
					path.add(e)
					val paths = new LinkedList<List<EntityType>>()
					paths.add(path)
					innerMap.put(ag.container as EntityType, paths)
				]
			]
		]
		
		dijkstraMap.keySet.forEach[ from | dijkstraFromToLevel(from) ]
	}
	
	private def void dijkstraFromToLevel(EntityType from) {
		val List<AbstractMap.SimpleEntry<EntityType, List<List<EntityType>>>> entriesToAddToToMap = newLinkedList
		
		val fromMap = dijkstraMap.get(from)
		fromMap.keySet.forEach[ to |
			val toMap = dijkstraMap.get(to)
			toMap.keySet.forEach[ to2 |
				if (fromMap.get(to2) === null) {
					val paths = newLinkedList
					concatPaths(fromMap, to, toMap, to2, paths)
					entriesToAddToToMap.add(new AbstractMap.SimpleEntry<EntityType, List<List<EntityType>>>(to2, paths))
				} else if (fromMap.get(to).size + toMap.get(to2).size < fromMap.get(to2).size) {
					val paths = newLinkedList
					concatPaths(fromMap, to, toMap, to2, paths)
					entriesToAddToToMap.add(new AbstractMap.SimpleEntry<EntityType, List<List<EntityType>>>(to2, paths))
				} else if (fromMap.get(to).size + toMap.get(to2).size == fromMap.get(to2).size) {
					val paths = newLinkedList
					concatPaths(fromMap, to, toMap, to2, paths)
					paths.addAll(fromMap.get(to2))
					entriesToAddToToMap.add(new AbstractMap.SimpleEntry<EntityType, List<List<EntityType>>>(to2, paths))
				}
			]
		] 
		
		entriesToAddToToMap.forEach[to2 | fromMap.put(to2.key, to2.value) ]
		
		if (!entriesToAddToToMap.isEmpty)
			dijkstraMap.keySet.forEach[ to | dijkstraFromToLevel(to) ]
	}
	
	protected def void concatPaths(Map<EntityType, List<List<EntityType>>> fromMap, EntityType to, Map<EntityType, List<List<EntityType>>> toMap, EntityType to2, LinkedList<List<EntityType>> paths) {
		fromMap.get(to).forEach[t | 
			toMap.get(to2).forEach[t2 |
				val path = newLinkedList
				path.addAll(t)
				path.addAll(t2)
				paths.add(path)
			]
		]
	}
	
	def USchema reduceModel() {
		reduceModel(skiqlModel.query)
		
		resultingUSchemaModel.relationships.filter[r | r.variations.size == 0].forEach[r | r.name = SHOW + r.name]

		resultingUSchemaModel
	}
	
	private def dispatch USchema reduceModel(SchemaQuery schemaTypeQuery) {
		val schemaSpec = schemaTypeQuery.schemaSpec
		if (schemaSpec instanceof EntitySpec)
			reduceBySchemaTypeName(schemaSpec)
		else if (schemaSpec instanceof RelationshipTypeSpec)
			reduceBySchemaTypeName(schemaSpec)
		else if (schemaSpec instanceof SchemaSpec)
			reduceBySchemaTypeName(schemaSpec)
			
		reduceByVariationFilter(schemaSpec)
		resultingUSchemaModel
	}
	
	private def reduceBySchemaTypeName(SchemaSpec schemaSpec) {
		val entityTypes = uSchemaQuery.entityTypeByRegex(uSchemaModel, schemaSpec.name)
		resultingUSchemaModel.entities.addAll(entityTypes)
		
		val relationshipTypes = uSchemaQuery.relationshipTypeSpecByRegex(uSchemaModel, schemaSpec.name)
		resultingUSchemaModel.relationships.addAll(relationshipTypes)		
	}
	
	private def reduceBySchemaTypeName(EntitySpec entitySpec) {
		val entityTypes = uSchemaQuery.entityTypeByRegex(uSchemaModel, entitySpec.name)
		resultingUSchemaModel.entities.addAll(entityTypes)		
	}
	
	private def reduceBySchemaTypeName(RelationshipTypeSpec relationshipTypeSpec) {
		val relationshipTypes = uSchemaQuery.relationshipTypeSpecByRegex(uSchemaModel, relationshipTypeSpec.name)
		resultingUSchemaModel.relationships.addAll(relationshipTypes)		
	}
	
	private def reduceByVariationFilter(SchemaSpec schemaSpec) {
		schemaSpec.variationFilter?.propertySpecs?.forEach[ps | 
			val type = ps.type
			val entityTypes = uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, schemaSpec.name)
			if (type instanceof PrimitiveType) {
				entityTypes.forEach[e | 
					val variationsList  = uSchemaQuery.variationsWithProperty(e, ps.name, type.type?.getName.toLowerCase)
					e.variations.clear
					e.variations.addAll(variationsList)
				]
			} else if (type instanceof RelationshipType) {
				if (type.targetEntityName === null || type.targetEntityName.isEmpty) {
					entityTypes.forEach[e | 
						val variationsList  = uSchemaQuery.variationsWithRelationship(e, ps.name, type.relationType.literal)
						e.variations.clear
						e.variations.addAll(variationsList)
					]
				} else {
					entityTypes.forEach[e | 
						val variationsList  = uSchemaQuery.variationsWithRelationship(e, ps.name, type.relationType.literal, type.targetEntityName)
						e.variations.clear
						e.variations.addAll(variationsList)
					]
				}
			} else {
				entityTypes.forEach[e | 
					val variationsList  = uSchemaQuery.variationsWithProperty(e, ps.name)
					e.variations.clear
					e.variations.addAll(variationsList)
				]
			}
		]
	}
	
	private def dispatch USchema reduceModel(RelationshipQuery relQuery) {
		reduceByFromTo(relQuery)
	}
	
	private def USchema reduceByFromTo(RelationshipQuery relQuery) {
		val fromEntitySpec = relQuery.from 
		reduceTos(relQuery, fromEntitySpec)
		
		reduceByVariationFilter(fromEntitySpec)
		resultingUSchemaModel
	}
	
	private def void reduceTos(RelationshipQuery relQuery, EntitySpec fromEntitySpec) {
		relQuery.to.forEach[to | 
			val expression = to.targetExpression
			if (expression instanceof RelationshipExpression) {
				val secondFrom = expression.relationshipQuery.from
				
				if (to.indirect) {
					if (to.relationSpec instanceof ReferenceSpec)
						indirectRefereces(fromEntitySpec.name, secondFrom.name)
					else if (to.relationSpec instanceof AggregationSpec) 
						indirectAggregations(fromEntitySpec.name, secondFrom.name)						
					else if (to.relationSpec instanceof RelationSpec || to.relationSpec === null) 
						indirectAny(fromEntitySpec.name, secondFrom.name)		
				} else {
					if (to.relationSpec instanceof ReferenceSpec) {
						if (to.relationSpec.name !== null)
							directReferences(fromEntitySpec, secondFrom.name, to.relationSpec.name)
						else 
							directReferences(fromEntitySpec, secondFrom.name)
						filterByVariationFilter(to)
					} else if (to.relationSpec instanceof AggregationSpec)
						directAggregations(fromEntitySpec, secondFrom.name)
					else if (to.relationSpec instanceof RelationSpec || to.relationSpec === null) {
						directAny(fromEntitySpec, secondFrom.name)
					}
				}
				
				reduceByFromTo(expression.relationshipQuery)
			}
			else if (expression instanceof EntityExpression) {
				if (to.indirect) {
					if (to.relationSpec instanceof ReferenceSpec) {
						indirectRefereces(fromEntitySpec.name, expression.entitySpec.name)
					} else if (to.relationSpec instanceof AggregationSpec) {
						indirectAggregations(fromEntitySpec.name, expression.entitySpec.name)						
					} else if (to.relationSpec instanceof RelationSpec || to.relationSpec === null) {
						indirectAny(fromEntitySpec.name, expression.entitySpec.name)		
					}
					
					reduceByVariationFilter(expression.entitySpec)
				} else {
					if (to.relationSpec instanceof ReferenceSpec) {
						if (to.relationSpec.name !== null)
							directReferences(fromEntitySpec, expression.entitySpec.name, to.relationSpec.name)
						else 
							directReferences(fromEntitySpec, expression.entitySpec.name)
						filterByVariationFilter(to)
					} else if (to.relationSpec instanceof AggregationSpec)
						directAggregations(fromEntitySpec, expression.entitySpec.name)
					else if (to.relationSpec instanceof RelationSpec || to.relationSpec === null) {
						directAny(fromEntitySpec, expression.entitySpec.name)
					}
					
					reduceByVariationFilter(expression.entitySpec)
				}
			}
		]
	}
	
	protected def void filterByVariationFilter(RelationshipSpec to) {
		val referenceSpec = to.relationSpec as ReferenceSpec
		
		val relsTypes = uSchemaQuery.relationshipTypeSpecByRegex(resultingUSchemaModel, referenceSpec.name)
		relsTypes.forEach[r |
			referenceSpec?.variationFilter?.propertySpecs?.forEach[ps | 
				val type = ps.type as PrimitiveType
				val variationsList = uSchemaQuery.variationsWithProperty(r, ps.name, type !== null ? type.type?.getName.toLowerCase : null)
				r.variations.clear
				r.variations.addAll(variationsList)
			]
		]
	}
	
	private def void indirectRefereces(String fromRegex, String toRegex) {
		val fromEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, fromRegex)
		fromEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, fromRegex))
		val toEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, toRegex)
		toEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, toRegex))
		
		fromEntities.forEach[fromEntity | 
			toEntities.forEach[toEntity | 
				val paths = dijkstraMap.get(fromEntity).get(toEntity)
				paths.forEach[ path | 
					if (path.size == 1) {
						directReferences(fromEntity, toEntity)
						checkVariations(fromEntity, toEntity)
					} else if (path.size > 1) {
						for (var i = 0; i < path.size - 1; i++) {
							directReferences(path.get(i), path.get(i + 1))
							checkVariations(path.get(i), path.get(i + 1))
						}
						directReferences(path.get(path.size - 1), toEntity)
						checkVariations(path.get(path.size - 1), toEntity)
					}
				]
			]
		]
	}
	
	private def void checkVariations(EntityType from, EntityType to) {
		val variationsWithoutReferencesToDelete = from.variations.filter[v | 
			v.logicalFeatures.filter[lf | lf instanceof Reference].map[lf | Reference.cast(lf)]
				.filter[r | r.refsTo.name.toLowerCase.equals(to.name.toLowerCase) ]
				.isEmpty
		].toList
		val variationsToDelete = from.variations.filter[v | 
			v.structuralFeatures.filter[sf | sf instanceof Aggregate].map[sf | Aggregate.cast(sf)]
				.flatMap[a | a.aggregates]
				.filter[sv | sv.container.name.toLowerCase.equals(to.name.toLowerCase) ]
				.isEmpty
		].filter[v | variationsWithoutReferencesToDelete.contains(v)]
		.toList
		variationsToDelete.forEach[v | v.variationId = -v.variationId] 
	}
	
	private def void indirectAggregations(String fromRegex, String toRegex) {
		val fromEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, fromRegex)
		fromEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, fromRegex))
		val toEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, toRegex)
		toEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, toRegex))
		
		fromEntities.forEach[fromEntity | 
			toEntities.forEach[toEntity | 
				val paths = dijkstraMap.get(fromEntity).get(toEntity)
				paths.forEach[ path | 
					if (path.size == 1) {
						directAggregations(fromEntity, toEntity)
						checkVariations(fromEntity, toEntity)
					} else if (path.size > 1) {
						for (var i = 0; i < path.size - 1; i++) {
							directAggregations(path.get(i), path.get(i + 1))
							checkVariations(path.get(i), path.get(i + 1))
						}
						directAggregations(path.get(path.size - 1), toEntity)
						checkVariations(path.get(path.size - 1), toEntity)
					}
				]
			]
		]
		
		notShowingAggreatedVariations(fromEntities, toEntities)
	}
	
	protected def void notShowingAggreatedVariations(List<EntityType> fromEntities, List<EntityType> toEntities) {
		fromEntities.forEach[fromEntity | 
			toEntities.forEach[toEntity | 
				val paths = dijkstraMap.get(fromEntity).get(toEntity)
				paths.forEach[ path | 
					for (var i = 0; i < path.size - 1; i++) {
						val j = i
						path.get(i).variations.forEach[v | 
							v.structuralFeatures.filter[sf | sf instanceof Aggregate].map[sf | Aggregate.cast(sf)]
								.forEach[a | 
									if (a.aggregates
										.filter[sv | sv.container.name.toLowerCase.equals(path.get(j+1).name.toLowerCase)]
										.filter[sv | sv.variationId < 0].size === a.aggregates.size)
										v.variationId = -v.variationId
								]
						]				
					}
				]
			]
		]
	}
	
	private def void indirectAny(String fromRegex, String toRegex) {
		val fromEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, fromRegex)
		fromEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, fromRegex))
		val toEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, toRegex)
		toEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, toRegex))
		
		fromEntities.forEach[fromEntity | 

			toEntities.forEach[toEntity | 
				val paths = dijkstraMap.get(fromEntity).get(toEntity)
				paths.forEach[ path | 
					if (path.size == 1) {
						directAny(fromEntity, toEntity)
						checkVariations(fromEntity, toEntity)
					} else if (path.size > 1) {
						for (var i = 0; i < path.size - 1; i++) {
							directAny(path.get(i), path.get(i + 1))
							checkVariations(path.get(i), path.get(i + 1))
						}
						directAny(path.get(path.size - 1), toEntity)
						checkVariations(path.get(path.size - 1), toEntity)
					}
				]
				
				fromEntity.variations.forEach[v |
				v.logicalFeatures.filter[lf | lf instanceof Reference].map[sf | Reference.cast(sf)].map[r | r.refsTo]
				.forEach[e | 
					var intermediatePaths = dijkstraMap.get(e).get(toEntity)
					intermediatePaths?.forEach[ path | 
						if (path.size == 1) {
							directAny(fromEntity, e)
							checkVariations(fromEntity, e)
							directAny(e, toEntity)
							checkVariations(e, toEntity)
						} else if (path.size > 1) {
							for (var i = 0; i < path.size - 1; i++) {
								directAny(path.get(i), path.get(i + 1))
								checkVariations(path.get(i), path.get(i + 1))
							}
							directAny(path.get(path.size - 1), toEntity)
							checkVariations(path.get(path.size - 1), toEntity)
						}
					]
				]
				
				v.structuralFeatures.filter[sf | sf instanceof Aggregate].map[sf | Aggregate.cast(sf)].flatMap[a | a.aggregates].map[ svA | svA.container]
				.filter[st | st instanceof EntityType].map[st | EntityType.cast(st)]
				.forEach[e | 
					var intermediatePaths = dijkstraMap.get(e).get(toEntity)
					intermediatePaths?.forEach[ path | 
						if (path.size == 1) {
							directAny(fromEntity, e)
							checkVariations(fromEntity, e)
							directAny(e, toEntity)
							checkVariations(e, toEntity)
						} else if (path.size > 1) {
							for (var i = 0; i < path.size - 1; i++) {
								directAny(path.get(i), path.get(i + 1))
								checkVariations(path.get(i), path.get(i + 1))
							}
							directAny(path.get(path.size - 1), toEntity)
							checkVariations(path.get(path.size - 1), toEntity)
						}
					]
				]
			]
			]
			
		]
		
		notShowingAggreatedVariations(fromEntities, toEntities)
	}
	
	private def void directAny(EntitySpec fromEntitySpec, String toEntityName) {
		val fromEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, fromEntitySpec.name)
		fromEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, fromEntitySpec.name))
		val toEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, toEntityName)
		toEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, toEntityName))
		
		directAny(fromEntities, toEntities)
	}
	
	private def void directAny(List<EntityType> fromEntities, List<EntityType> toEntities) {
		fromEntities.forEach[e | directAny(e, toEntities) ]
	}
	
	private def void directAny(EntityType from, List<EntityType> toEntities) {
		val refVariationList = uSchemaQuery.variationsRefsTo(from, toEntities)
		val aggrVariationList = uSchemaQuery.variationsAggregatesTo(from, toEntities)
		
		if (!refVariationList.isEmpty) {
			if (!resultingUSchemaModel.entities.contains(from))
				from.variations.clear
			from.variations.addAll(refVariationList)
			if (!resultingUSchemaModel.entities.contains(from))
				resultingUSchemaModel.entities.add(from)
			
			val toEntitiesNames = from.variations
				.flatMap[v | v.logicalFeatures]
				.filter[f | f instanceof Reference].map[f | Reference.cast(f)]
				.map[r | r.refsTo.name.toLowerCase ]
				.toList
			toEntities.filter[toE | toEntitiesNames.contains(toE.name.toLowerCase)].forEach[toE | resultingUSchemaModel.entities.add(toE)]
			
			val aggregateToEntitiesNames = from.variations
				.flatMap[v | v.structuralFeatures]
				.filter[f | f instanceof Aggregate].map[f | Aggregate.cast(f)]
				.flatMap[r | r.aggregates ]
				.map[sv | sv.container.name.toLowerCase ]
				.toList
			toEntities.filter[toE | aggregateToEntitiesNames.contains(toE.name.toLowerCase)].forEach[toE | resultingUSchemaModel.entities.add(toE)]
			
			from.variations
				.flatMap[v | v.logicalFeatures]
				.filter[f | f instanceof Reference].map[f | Reference.cast(f)]
				.filter[r | toEntities.map[e | e.name].contains(r.name)]
				.flatMap[r | r.isFeaturedBy ]
				.map[sv | sv.container as es.um.uschema.USchema.RelationshipType]
				.forEach[rt | resultingUSchemaModel.relationships.add(rt)]
			
		}
				
		if (!aggrVariationList.isEmpty) {
			if (!resultingUSchemaModel.entities.contains(from))
				from.variations.clear
			from.variations.addAll(aggrVariationList)
			if (!resultingUSchemaModel.entities.contains(from))
				resultingUSchemaModel.entities.add(from)
			val toEntitiesNames = from.variations
				.flatMap[v | v.structuralFeatures]
				.filter[f | f instanceof Aggregate].map[f | Aggregate.cast(f)]
				.flatMap[r | r.aggregates ]
				.map[sv | sv.container.name.toLowerCase ]
				.toList
			toEntities.filter[toE | toEntitiesNames.contains(toE.name.toLowerCase)].forEach[toE | resultingUSchemaModel.entities.add(toE)]
				
		}
	}
	
	private def void directAny(EntityType from, EntityType to) {
		val toEntityList = new LinkedList<EntityType>()
		toEntityList.add(to)
		directAny(from, toEntityList)
	}
	
	private def void directAggregations(EntitySpec fromEntitySpec, String toEntityName) {
		val fromEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, fromEntitySpec.name)
		fromEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, fromEntitySpec.name))
		val toEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, toEntityName)
		toEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, toEntityName))
		
		directAggregations(fromEntities, toEntities)
	}
	
	private def void directAggregations(List<EntityType> fromEntities, List<EntityType> toEntities) {
		fromEntities.forEach[e | 
			directAggregations(e, toEntities)
		]
	}
	
	private def void directAggregations(EntityType from, List<EntityType> toEntities) {
		val variationList = uSchemaQuery.variationsAggregatesTo(from, toEntities)
		if (!variationList.isEmpty) {
			if (!resultingUSchemaModel.entities.contains(from))
				from.variations.clear
			from.variations.addAll(variationList)
			if (!resultingUSchemaModel.entities.contains(from))
				resultingUSchemaModel.entities.add(from)
				
			val aggregateToEntitiesNames = from.variations
				.flatMap[v | v.structuralFeatures]
				.filter[f | f instanceof Aggregate].map[f | Aggregate.cast(f)]
				.flatMap[r | r.aggregates ]
				.map[sv | sv.container.name.toLowerCase ]
				.toList
			toEntities.filter[toE | aggregateToEntitiesNames.contains(toE.name.toLowerCase)].forEach[toE | resultingUSchemaModel.entities.add(toE)]
		
		}
		
		if (!variationList.isEmpty) {
			if (!resultingUSchemaModel.entities.contains(from))
				from.variations.clear
			from.variations.addAll(variationList)
			if (!resultingUSchemaModel.entities.contains(from))
				resultingUSchemaModel.entities.add(from)
			val toEntitiesNames = from.variations
				.flatMap[v | v.structuralFeatures]
				.filter[f | f instanceof Aggregate].map[f | Aggregate.cast(f)]
				.flatMap[r | r.aggregates ]
				.map[sv | sv.container.name.toLowerCase ]
				.toList
			toEntities.filter[toE | toEntitiesNames.contains(toE.name.toLowerCase)].forEach[toE | resultingUSchemaModel.entities.add(toE)]
				
		}
	}
	
	private def void directAggregations(EntityType from, EntityType to) {
		val toEntityList = new LinkedList<EntityType>()
		toEntityList.add(to)
		directAggregations(from, toEntityList)
	}
	
	
	private def void directReferences(EntitySpec fromEntitySpec, String toEntityName, String refName) {
		val fromEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, fromEntitySpec.name)
		fromEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, fromEntitySpec.name))
		val toEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, toEntityName)
		toEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, toEntityName))
		
		fromEntities.forEach[e | directReferences(e, toEntities, refName) ]
	}
	
	private def void directReferences(EntitySpec fromEntitySpec, String toEntityName) {
		val fromEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, fromEntitySpec.name)
		fromEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, fromEntitySpec.name))
		val toEntities = uSchemaQuery.entityTypeByRegex(uSchemaModel, toEntityName)
		toEntities.addAll(uSchemaQuery.entityTypeByRegex(resultingUSchemaModel, toEntityName))
		
		directReferences(fromEntities, toEntities)
	}
	
	private def void directReferences(List<EntityType> fromEntities, List<EntityType> toEntities) {
		fromEntities.forEach[e | directReferences(e, toEntities, null) ]
	}
	
	private def void directReferences(EntityType from, List<EntityType> toEntities, String refName) {
		val variationList = uSchemaQuery.variationsRefsTo(from, toEntities)
		if (!variationList.isEmpty) {
			if (!resultingUSchemaModel.entities.contains(from))
				from.variations.clear
			from.variations.addAll(variationList)
			if (!resultingUSchemaModel.entities.contains(from))
				resultingUSchemaModel.entities.add(from)
			val toEntitiesNames = from.variations
				.flatMap[v | v.logicalFeatures]
				.filter[f | f instanceof Reference].map[f | Reference.cast(f)]
				.filter[r | if (refName !== null) r.name.toLowerCase.matches(uSchemaQuery.regexTextToRegex(refName)) else true]
				.map[r | r.refsTo.name.toLowerCase ]
				.toList
			toEntities.filter[toE | toEntitiesNames.contains(toE.name.toLowerCase)].forEach[toE | resultingUSchemaModel.entities.add(toE)]
			
			from.variations
				.flatMap[v | v.logicalFeatures]
				.filter[f | f instanceof Reference].map[f | Reference.cast(f)]
				.filter[r | r.name !== null && r.name.equals(refName)]
				.filter[r | if (refName !== null) r.name.toLowerCase.matches(uSchemaQuery.regexTextToRegex(refName)) else true]
				.flatMap[r | r.isFeaturedBy ]
				.map[sv | sv.container as es.um.uschema.USchema.RelationshipType]
				.forEach[rt | resultingUSchemaModel.relationships.add(rt)]
		}
	}
	
	private def void directReferences(EntityType from, EntityType to) {
		val toEntityList = new LinkedList<EntityType>()
		toEntityList.add(to)
		directReferences(from, toEntityList, null)
	}
	
	
}