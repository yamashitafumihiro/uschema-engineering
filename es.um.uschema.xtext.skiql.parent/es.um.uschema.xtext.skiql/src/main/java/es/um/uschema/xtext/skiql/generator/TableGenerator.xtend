package es.um.uschema.xtext.skiql.generator

import es.um.uschema.USchema.StructuralVariation
import es.um.uschema.USchema.USchema
import es.um.uschema.USchema.SchemaType

class TableGenerator {
	
	static final String SHOW = "SHOW|";
	
	def generateTable(USchema model, String divName) 
	{
		'''
        	«FOR entity : model.entities»
        	«IF !entity.name.startsWith(SHOW)»
        	«FOR variation : entity.variations»
        	«generateVariationRow(entity, variation)»
        	«ENDFOR»
        	«ENDIF»
        	«ENDFOR»
        	«FOR entity : model.relationships»
        	«IF !entity.name.startsWith(SHOW)»
        	«FOR variation : entity.variations»
        	«generateVariationRow(entity, variation)»
        	«ENDFOR»
        	«ENDIF»
        	«ENDFOR»
		'''
	}
	
	protected def CharSequence generateVariationRow(SchemaType entity, StructuralVariation variation)
		'''
			<tr>
				<td>«entity.name.replace(SHOW,"")»</td>
				<td>«variation.variationId»</td>
				<td>«variation.count»</td>
				<td>«DataStringGenerator.generateVariationString(variation).replace(SHOW,"").replace(";","<br/>")»
			</tr>
    	'''
	
}