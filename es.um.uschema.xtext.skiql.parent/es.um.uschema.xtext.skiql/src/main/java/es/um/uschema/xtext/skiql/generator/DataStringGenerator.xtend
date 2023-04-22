package es.um.uschema.xtext.skiql.generator

import es.um.uschema.USchema.Aggregate
import es.um.uschema.USchema.Attribute
import es.um.uschema.USchema.Key
import es.um.uschema.USchema.Null
import es.um.uschema.USchema.PList
import es.um.uschema.USchema.PMap
import es.um.uschema.USchema.PSet
import es.um.uschema.USchema.PTuple
import es.um.uschema.USchema.PrimitiveType
import es.um.uschema.USchema.Reference
import es.um.uschema.USchema.StructuralVariation

import java.util.Map
import es.um.uschema.USchema.SchemaType
import java.util.List
import java.util.LinkedList
import es.um.uschema.USchema.USchema

class DataStringGenerator {
	
	static val String SHARED_POS = '1'
	static val String SHARED = SHARED_POS + 'Sh'
	
	static val String NON_SHARED_POS = '2'
	static val String NON_SHARED = NON_SHARED_POS + 'Ns'
	
	static val String SPECIFIC_POS = '3'
	static val String SPECIFIC = SPECIFIC_POS + 'Sp'
	
	def static String generateVariationString(StructuralVariation variation) 
	{
		val result = generateAttributesString(variation, false) + generateReferencesString(variation, false) + generateAggregateString(variation, false) + generateKeyString(variation, false)
		'''«result.sort.join("; ")»'''
	}
	
	def static String generateVariationSimpleStringWithoutRepetitiveRelations(StructuralVariation variation, String joining, boolean bold, Map<String, String> featuresType, USchema model) 
	{
		val result = generateAttributesSimpleString(variation, bold, featuresType) + generateReferencesSimpleStringWithoutRepetitiveRelations(variation, bold, featuresType, model) + generateAggregateSimpleStringWithoutRepetitiveRelations(variation, bold, featuresType, model) + generateKeySimpleString(variation, bold, featuresType)
		
		'''«result.filter[l | l.contains(SHARED)].map [l | l.replaceAll(SHARED, "+") + joining].sort.join
		»«result.filter[l | l.contains(NON_SHARED)].map [l | l.replaceAll(NON_SHARED, "?") + joining].sort.join
		»«result.filter[l | l.contains(SPECIFIC)].map [l | l.replaceAll(SPECIFIC, "-") + joining].sort.join»'''
	}
	
	def static String generateVariationSimpleString(StructuralVariation variation, String joining, boolean bold, Map<String, String> featuresType) 
	{
		val result = generateAttributesSimpleString(variation, bold, featuresType) + generateReferencesSimpleString(variation, bold, featuresType) + generateAggregateSimpleString(variation, bold, featuresType) + generateKeySimpleString(variation, bold, featuresType)
		
		'''«result.filter[l | l.contains(SHARED)].map [l | l.replaceAll(SHARED, "+") + joining].sort.join
		»«result.filter[l | l.contains(NON_SHARED)].map [l | l.replaceAll(NON_SHARED, "?") + joining].sort.join
		»«result.filter[l | l.contains(SPECIFIC)].map [l | l.replaceAll(SPECIFIC, "-") + joining].sort.join»'''
	}
	
	def static int getMaxLenghtAttribute(StructuralVariation variation, Map<String, String> featuresType, USchema model)
	{
		val result = generateAttributesSimpleString(variation, false, null) + generateReferencesSimpleStringWithoutRepetitiveRelations(variation, false, null, model) + generateAggregateSimpleStringWithoutRepetitiveRelations(variation, false, featuresType, model) + generateKeySimpleString(variation, false, null)
		
		if (result.isEmpty) 
			return 0
		result.toList.map[r | r.length].max
	}
	
	
	
	def static generateKeyString(StructuralVariation variation, boolean bold) {
		variation.features.filter[f | f instanceof Key].map[f | Key.cast(f)].map[k | '''«generateFeatureString(k, bold, null)»''']
	}
	
	def static generateKeySimpleString(StructuralVariation variation, boolean bold, Map<String, String> featuresType) {
		variation.features.filter[f | f instanceof Key].map[f | Key.cast(f)].map[k | '''«generateFeatureString(k, bold, featuresType)»''']
	}
	
	def static generateAggregateString(StructuralVariation variation, boolean bold) {
		variation.features.filter[f | f instanceof Aggregate].map[f | Aggregate.cast(f)]
		.map[ag | '''«if (bold) "<b>"»«ag.name»«if (bold) "</b>"»: [«ag.lowerBound»..«ag.upperBound === -1 ? "*" : ag.upperBound»«IF !ag.aggregates.isEmpty» «FOR sv: ag.aggregates»<>--«generateAttributesString(sv, bold)»-->«sv.container.name»«ENDFOR»«ENDIF»]''']
	}
	
	def static generateReferencesString(StructuralVariation variation, boolean bold) {
		variation.features.filter[f | f instanceof Reference].map[f | Reference.cast(f)]
			.map[r | '''«if (bold) "<b>"»«r.name === null ? r.attributes.map[a|a.name].join(",") : r.name !== null ? r.name : r.attributes.map[a | a.name].join(",")»«if (bold) "</b>"»: —[«r.lowerBound»..«r.upperBound === -1 ? "*" : r.upperBound»«IF !r.isFeaturedBy.isEmpty» «FOR sv: r.isFeaturedBy»«generateAttributesString(sv, bold)»«ENDFOR»«ENDIF»]->«r.refsTo.name»''']
	}
	
	def static generateAggregateSimpleStringWithoutRepetitiveRelations(StructuralVariation variation, boolean bold, Map<String, String> featuresType, USchema model) {
		variation.features.filter[f | f instanceof Aggregate].map[f | Aggregate.cast(f)].filter[ag | ! (
			model.entities.map[e | e.name].toList.contains(ag?.aggregates?.get(0)?.container?.name)	
			&&
			model.entities.flatMap[e | e.variations].toList.contains(ag.aggregates.get(0))
			)
		]
		.map[ag | '''«generateFeatureString(ag, bold, featuresType)»''']
	}
	
	def static generateAggregateSimpleString(StructuralVariation variation, boolean bold, Map<String, String> featuresType) {
		variation.features.filter[f | f instanceof Aggregate].map[f | Aggregate.cast(f)].map[ag | '''«generateFeatureString(ag, bold, featuresType)»''']
	}
	
	def static generateReferencesSimpleStringWithoutRepetitiveRelations(StructuralVariation variation, boolean bold, Map<String, String> featuresType, USchema model) {
		variation.features.filter[f | f instanceof Reference].map[f | Reference.cast(f)].filter[r | var uSchema = (r.isFeaturedBy !== null && !r.isFeaturedBy.isEmpty ? r.isFeaturedBy.get(0).container.eContainer as USchema: null);
			 ! model.entities.map[e | e.name].contains(r.refsTo.name) || ( r.isFeaturedBy !== null && !r.isFeaturedBy.isEmpty && uSchema.name.equals("NO"))]
			.map[r | '''«generateFeatureString(r, bold, featuresType)»''']
	}
	
	def static generateReferencesSimpleString(StructuralVariation variation, boolean bold, Map<String, String> featuresType) {
		variation.features.filter[f | f instanceof Reference].map[f | Reference.cast(f)]
			.map[r | '''«generateFeatureString(r, bold, featuresType)»''']
	}
	
	def static generateAttributesString(StructuralVariation variation, boolean bold) {
		variation.features.filter[f | f instanceof Attribute].map[f | Attribute.cast(f)].map[a | '''«generateFeatureString(a, bold, null)»''']
	}
	
	def static generateAttributesSimpleString(StructuralVariation variation, boolean bold, Map<String, String> featuresType) {
		variation.features.filter[f | f instanceof Attribute].map[f | Attribute.cast(f)].filter[a | a.references.isEmpty].map[a | '''«generateFeatureString(a, bold, featuresType)»''']
	}
	
	def static dispatch String generateFeatureString(Key k, boolean bold, Map<String, String> featuresType)
		'''«if (bold) "<b>"»«featuresType !== null ? featuresType.get(k.name !== null ? k.name : generateFeatureString(k, false, null))»Key«if (bold) "</b>"»: Key[«k.attributes.map[a|a.name].join(",")»]'''
	
	def static dispatch String  generateFeatureString(Aggregate ag, boolean bold, Map<String, String> featuresType)
		'''«if (bold) "<b>"»«featuresType !== null ? featuresType.get(ag.name) + ag.name : ag.name»«if (bold) "</b>"»: <>-[«ag.lowerBound»..«ag.upperBound === -1 ? "*" : ag.upperBound»]->«if (!ag.aggregates.empty) ag.aggregates.map[asv | asv.container?.name + '['+ Math.abs(asv.variationId) + ']'].toSet.join(",")»'''
		
	def static dispatch String generateFeatureString(Reference r, boolean bold, Map<String, String> featuresType)
		'''«if (bold) "<b>"»«r.name === null ? r.attributes.map[a|(featuresType !== null ? featuresType.get(a.name) + a.name : a.name)].join(",") : (featuresType !== null ? 
//		"[" + 
		featuresType.get(r.name) 
//		+ "]" 
		+ r.name : r.name)»«if (bold) "</b>"»: —[«r.lowerBound»..«r.upperBound === -1 ? "*" : r.upperBound»]->«r.refsTo.name»'''

	def static dispatch String generateFeatureString(Attribute a, boolean bold, Map<String, String> featuresType)
		'''«if (bold) "<b>"»«featuresType !== null ? featuresType.get(a.name) + a.name : a.name»«if (bold) "</b>"»: «generateDatatypeString(a.type)»'''
		
	def static dispatch String generateDatatypeString(PrimitiveType primitiveType)
		'''«primitiveType.name»'''
		
	def static dispatch String generateDatatypeString(Null nullType)
		'''Null'''
	
	def static dispatch String generateDatatypeString(PList pListType)
		'''List [«generateDatatypeString(pListType.elementType)»]'''

	def static dispatch String generateDatatypeString(PSet pSetType)
		'''Set [«generateDatatypeString(pSetType.elementType)»]'''
		
	def static dispatch String generateDatatypeString(PMap pMapType)
		'''Map [<«generateDatatypeString(pMapType.keyType)»,«generateDatatypeString(pMapType.valueType)»>]'''
		
	def static dispatch String generateDatatypeString(PTuple pTupleType)
		'''Tuple [<«FOR dataType : pTupleType.elements SEPARATOR ","»«generateDatatypeString(dataType)»«ENDFOR»>]'''
		
	def static getFeatureTypeMap(List<SchemaType> schemaTypes) {
		val Map<SchemaType, Map<String, String>> featureTypeMap = newHashMap
		val Map<SchemaType, Map<String, List<String>>> entityFeatures = newHashMap
		
		schemaTypes.forEach[st | 
			val Map<String, List<String>> features = newHashMap
			entityFeatures.put(st, features)
			st.variations.forEach[v |
				v.features.forEach[f | 
					val featureString = generateFeatureString(f, false, null)
					var List<String> featureList = features.get(featureString)
					if (featureList === null) {
						featureList = new LinkedList
						features.put(featureString, featureList)
					}
					featureList.add(f.name !== null ? f.name : featureString)
				]
			]
			
			createVariationFeatureMap(features, st, featureTypeMap)
		]
		
		return featureTypeMap
	}
	
	def static createVariationFeatureMap(Map<String, List<String>> features, SchemaType st, Map<SchemaType, Map<String, String>> featureTypeMap) {
		val Map<String, String> entityFeatureTypeMap = newHashMap
		features.forEach[k, v | 
			if (st.variations.size > 0 && v.size === st.variations.size)
				entityFeatureTypeMap.put(v.get(0), SHARED)
			else if (v.size === 1) 
				entityFeatureTypeMap.put(v.get(0), SPECIFIC)
			else if (v.size >= 2) 
				entityFeatureTypeMap.put(v.get(0), NON_SHARED)
		]
		
		featureTypeMap.put(st, entityFeatureTypeMap)
	}
	
	def static parseOptionality(String optionality) {
		return optionality?.replaceAll(SHARED, "+").replaceAll(NON_SHARED, "?").replaceAll(SPECIFIC, "-")
	}
	
}