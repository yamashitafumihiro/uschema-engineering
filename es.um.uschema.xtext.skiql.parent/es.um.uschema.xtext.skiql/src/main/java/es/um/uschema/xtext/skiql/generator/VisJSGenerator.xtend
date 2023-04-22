package es.um.uschema.xtext.skiql.generator

import es.um.uschema.USchema.Aggregate
import es.um.uschema.USchema.Reference
import es.um.uschema.USchema.USchema

import es.um.uschema.USchema.SchemaType

class VisJSGenerator {
	
	static final String SHOW = "SHOW|";
		
	def generateVisJS(USchema model, String divName) 
	{
		val entityFeatures = DataStringGenerator.getFeatureTypeMap(model.entities.filter[e | SchemaType.isInstance(e)].map[e | SchemaType.cast(e)].toList)
		val relationshipFeatures = DataStringGenerator.getFeatureTypeMap(model.relationships.filter[r | SchemaType.isInstance(r)].map[r | SchemaType.cast(r)].toList)
		
		'''
			<script type="text/javascript">
				var nodes = [
					«FOR entity : model.entities»
					«IF !entity.name.startsWith(SHOW)»
					«var textLength = Math.max(entity.name.length, "<<ENTITY TYPE>>".length + 4) + 4»
					«var separator = ""»
					«for (var i = 0; i < textLength; i++) separator += "_"»
					{
						id: «System.identityHashCode(entity)»,
						font: { 
							multi: true,
							align: "center",
							ital: {
								color: '#0077aa',
								mod: 'italic',
								size: 24,
							},
						},
						label: "<<ENTITY TYPE>>\n«separator»\n\n<i>«entity.name.replace(SHOW, "")»</i>\n\n",
						color: {
							border: "#000000",
							background: «IF entity.isRoot»"#FDFFC6"«ELSE»"#ECECEC"«ENDIF»,
						},
						shapeProperties: {
							borderRadius: 20,
						},
					},
					«FOR variation : entity.variations»
					«IF variation.variationId >= 0»
					«var varTextLength = Math.max(entity.name.length, DataStringGenerator.getMaxLenghtAttribute(variation, entityFeatures.get(entity), model))»
					«var varSeparator = ""»
					«for (var i = 0; i < varTextLength; i++) varSeparator += "_"»
					«var titleSeparatorLenght = (varTextLength - entity.name.length * 3) / 2»
					«var titleSeparator = " "»
					«for (var i = 0; i < titleSeparatorLenght/2; i++) titleSeparator += "\u0020\u00A0"»
					
					{
						id: «System.identityHashCode(variation)»,
						font: { 
							multi: true,
							ital: {
								color: '#0077aa',
								mod: 'italic',
								size: 24,
							},
						},
						label: " <i> «titleSeparator» «entity.name.replace(SHOW, "")»[«Math.abs(variation.variationId)»] « »</i>\n«varSeparator»\n\n«DataStringGenerator.generateVariationSimpleStringWithoutRepetitiveRelations(variation, "\\n", false, entityFeatures.get(entity), model).replaceAll(SHOW, "").replace("|", "")»",
						title: "«entity.name.replace(SHOW, "")»[«Math.abs(variation.variationId)»]\n\n«DataStringGenerator.generateVariationSimpleString(variation, "\\n", false, entityFeatures.get(entity)).replaceAll(SHOW, "").replace("|", "").replace("<b>","").replace("</b>","")»",
						color: {
							border: "#000000",
							background: "#FFFFFF"
						},
						shapeProperties: {
							borderRadius: 20,
						},
					},
					«FOR r : variation.features.filter[f | f instanceof Reference].map[f | Reference.cast(f)].filter[r | model.entities.map[e | e.name].contains(r.refsTo.name)]»
					«IF r.isFeaturedBy !== null && !r.isFeaturedBy.isEmpty »
					«var uSchema = r.isFeaturedBy.get(0).container.eContainer as USchema»
					«IF !uSchema.name.equals("NO")»
					{
						id: «System.identityHashCode(r)»,
						label: "«DataStringGenerator.parseOptionality(entityFeatures.get(entity)?.get(r.name !== null && !r.name.isEmpty ? r.name.replace(SHOW, "") : r.attributes.map[a | a.name].join(",")))»[«r.lowerBound»..«r.upperBound == -1 ? '*' : r.upperBound»] «r.name»",
«««						label: "--[«r.lowerBound»..«r.upperBound == -1 ? '*' : r.upperBound»| «r.name !== null ? r.name.replace(SHOW, "") : r.attributes.map[a | a.name].join(",")»]-->«r.refsTo.name.replace(SHOW, "")»",
						shape: "text",
						font: {
							size: 18,
							background: '#FFFFFF',
						},
					},
					«ENDIF»
					«ENDIF»
					«ENDFOR»
					«ENDIF»
					«ENDFOR»
					«ENDIF»
					«ENDFOR»
					«FOR relationship : model.relationships»
					«IF !relationship.name.startsWith(SHOW)»
					«var textLength = Math.max(relationship.name.length, "<<RELATIONSHIP TYPE>>".length + 4) + 4»
					«var separator = ""»
					«for (var i = 0; i < textLength; i++) separator += "_"»
					{
						id: «System.identityHashCode(relationship)»,
						font: { 
							multi: true,
							align: "center",
						},
						label: "<<RELATIONSHIP TYPE>>\n«separator»\n\n<i>«relationship.name.replace(SHOW, "")»</i>\n\n",
						color: {
							border: "#000000",
							background: "#E3F5FB",
						},
						shapeProperties: {
							borderRadius: 20,
						},
					},
					«FOR variation : relationship.variations»
					«var varTextLength = Math.max(relationship.name.length + 6, DataStringGenerator.getMaxLenghtAttribute(variation, entityFeatures.get(relationship), model))»
					«var varSeparator = ""»
					«for (var i = 0; i < varTextLength; i++) varSeparator += "_"»
					«var  titleSeparatorLenght = ((Math.max(relationship.name.length, DataStringGenerator.getMaxLenghtAttribute(variation, entityFeatures.get(relationship), model))) - (relationship.name.length + 4) ) / 2»
					«var titleSeparator = " "»
					«for (var i = 0; i < titleSeparatorLenght; i++) titleSeparator += "\u0020\u00A0"»
					{
						id: «System.identityHashCode(variation)»,
						font: { multi: true },
						label: "<i> «titleSeparator» «relationship.name.replace(SHOW, "")»[«Math.abs(variation.variationId)»] «titleSeparator»</i>\n«varSeparator»\n\n«DataStringGenerator.generateVariationSimpleStringWithoutRepetitiveRelations(variation, "\\n", false, relationshipFeatures.get(relationship), model)»",
						title: "«relationship.name.replace(SHOW, "")»[«Math.abs(variation.variationId)»]\n\n«DataStringGenerator.generateVariationSimpleString(variation, "\\n", false, entityFeatures.get(relationship)).replaceAll(SHOW, "").replace("|", "")»",
						color: {
							border: "#000000",
							background: "#FFFFFF",
						},
						shapeProperties: {
							borderRadius: 20,
						},
					},
					«ENDFOR»
					«ENDIF»
					«ENDFOR»
				];
			
				var edges = [
					«FOR entity : model.entities»
					«FOR variation : entity.variations»
					{ 	
						from: «System.identityHashCode(entity)»,
						to: «System.identityHashCode(variation)»,
						
						color: {color:'#2c3e50'},
						dashes: [5, 5],
						width: 1,
						arrows: {
							to: {
								enabled: true,
								type: "triangle",
							}
						},
					},
					«FOR r : variation.features.filter[f | f instanceof Reference].map[f | Reference.cast(f)]»
					«IF r.isFeaturedBy !== null && !r.isFeaturedBy.isEmpty»
						«FOR featuredBy : r.isFeaturedBy»
						«var uSchema = r.isFeaturedBy.get(0).container.eContainer as USchema»
						«IF !uSchema.name.equals("NO")»
							{ from: «System.identityHashCode(variation)», to: «System.identityHashCode(r)», color: {color:'#0077aa'}, arrows: "none", width: 4,},
							{ from: «System.identityHashCode(r)», to: «System.identityHashCode(r.refsTo)», color: {color:'#0077aa'}, width: 4,},
							{ from: «System.identityHashCode(r)», to: «System.identityHashCode(featuredBy)», dashes: [10, 10], color: {color:'#2c3e50'}},
						«ENDIF»
						«ENDFOR»
					«ELSE»
					{ 
						from: «System.identityHashCode(variation)», 
						to: «System.identityHashCode(r.refsTo)», 
						label: "«DataStringGenerator.parseOptionality(entityFeatures.get(entity)?.get(r.name !== null && !r.name.isEmpty ? r.name.replace(SHOW, "") : 
							r.attributes.map[a | a.name ].join(",") 
						))»[«r.lowerBound»..«r.upperBound == -1 ? '*' : r.upperBound»] «r.name !== null && !r.name.isEmpty ? r.name.replace(SHOW, "") : r.attributes.map[a | a.name].join(",")»",
						color: {color:'#0077aa'},
						width: 4,
						font: {
							size: 18,
							background: '#FFFFFF',
						},
					},
«««					{ from: «System.identityHashCode(variation)», to: «System.identityHashCode(r.refsTo)», label: "--[«r.lowerBound»..«r.upperBound == -1 ? '*' : r.upperBound»| «r.name !== null ? r.name.replace(SHOW, "") : r.attributes.map[a | a.name].join(",")»]-->«r.refsTo.name.replace(SHOW, "")»", color: {color:'#0077aa'}},
					«ENDIF»
					«ENDFOR»
					«FOR ag : variation.features.filter[f | f instanceof Aggregate].map[f | Aggregate.cast(f)]»
						«FOR agTarget : ag.aggregates»
						«IF agTarget.container !== null»
						{ 
							from: «System.identityHashCode(variation)»,
							to: «System.identityHashCode(agTarget)»,
							label: "«DataStringGenerator.parseOptionality(entityFeatures.get(entity)?.get(ag.name))»[«ag.lowerBound»..«ag.upperBound == -1 ? '*' : ag.upperBound»] «ag.name»",
							arrows: {
								to: {
									enabled: true
								}, 
								from: {
									enabled: true,
									type: "diamond",
								},
							},
							color: {color:'#f1948a'},
							width: 4,
							font: {
								size: 18,
								background: '#FFFFFF',
							},
						},
«««						{ from: «System.identityHashCode(variation)», to: «System.identityHashCode(agTarget)», label: "<>--[«ag.lowerBound»..«ag.upperBound == -1 ? '*' : ag.upperBound»| «ag.name»]-->«agTarget.container.name.replace(SHOW, "")»[«Math.abs(agTarget.variationId)»]", color: {color:'#f1948a'}},
						«ENDIF»
						«ENDFOR»
					«ENDFOR»
					«ENDFOR»
					«ENDFOR»
					
					«FOR rel : model.relationships»
					«FOR variation : rel.variations»
					{ 
						from: «System.identityHashCode(rel)»,
						to: «System.identityHashCode(variation)»,
						color: {color:'#2c3e50'},
						dashes: [5, 5],
						width: 1,
					},
					«ENDFOR»
					«ENDFOR»
				];
			
				var container = document.getElementById("«divName»");
				var data = {
					nodes: nodes,
					edges: edges
				};
				var options = {
					autoResize: true,
					edges: {
						font: {
							size: 16,
							face: 'verdana',
							align: "horizontal",
						},
						arrows: {
				       		to: { 
				       			enabled: true,
				       			scaleFactor: 1,
				       			type: "vee",
				       		}
				    	},
				    	smooth: false,
				    	width: 2,
					},
					nodes: {
						color: "#FFFFFF",
						shape: "box",
						font: {
							size: 18,
							face: 'verdana',
							align: 'left',
							ital: {
								color: '#0077aa',
								size: 22,
							},
							boldital: {
								color: '#0077aa',
								size: 32,
							},
							bold: {
								color: "#000000",
								size: 22,
							},
						}
					},
					layout: {
						improvedLayout: true
					},
					physics: {
						solver: "repulsion",
						repulsion: {
							nodeDistance: 500
						}
					},
					interaction: { 
						hover: true
					},
					manipulation: {
						enabled: true
					},
				};
				var network = new vis.Network(container, data, options);
				network.stabilize();
				network.on("stabilizationIterationsDone", function () {
				    network.setOptions( { physics: false } );
				});
			</script>
		'''
	}
	
}