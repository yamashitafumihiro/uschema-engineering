package es.um.uschema.xtext.skiql.generator.reducer

import es.um.uschema.USchema.USchema
import org.eclipse.xtext.EcoreUtil2

class USchemaCopier {
	
	def USchema copy(USchema uSchemaModel) {
		val resultingUSchemaModel = EcoreUtil2.copy(uSchemaModel)
		resultingUSchemaModel.entities.clear
		resultingUSchemaModel.relationships.clear
		
		resultingUSchemaModel
	}
	
}