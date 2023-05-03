package es.um.uschema.codeql.m2t

import java.util.List
import java.util.ArrayList
import es.um.uschema.USchema.USchema
import es.um.uschema.codeql.utils.GenerationUtils
import es.um.uschema.USchema.EntityType

class USchema2CodeProfile
{
  USchema schema

  def List<Pair<String, String>> m2t(USchema schema)
  {
    val result = new ArrayList<Pair<String, String>>()

    this.schema = schema

    result.addAll(generateBaseQueries())

    for (entity : schema.entities)
      result.addAll(generateEntityQueries(entity))
    return result
  }

  private def generateBaseQueries()
  {
    #[ "allcollections" ->
      '''
      «generateHeader("allcollections-access", "metric", "Access to all collections", "Access to all collections")»
      import javascript
      import utils

      from MethodCallExpr method
      where
        checkIsMDBCollectionsMethod(method.getMethodName())
        and
        (
          checkExprIsDBMethod(method.getReceiver())
          or
          checkExprIsDBObject(method.getReceiver())
        )
      select method, "AllCollections: Access", 1
      '''
    ]
  }
  // Improvement: Get Access to entities not in schema
  // Improvement: Get Mongoose schemas of entities not in the schema

  private def generateEntityQueries(EntityType entity)
  {
    val id = "entity-" + entity.name
    #[ id + "-access" ->
      '''
      «generateHeader(id + "-access", "metric", entity.name + ": Access", entity.name + ": Access")»
      «generateEntityAccess(entity.name)»
      '''
      ,
      id + "-mongoose" ->
      '''
      «generateHeader(id + "-mongoose", "metric", "Mongoose" + entity.name, entity.name + ": Mongoose")»
      «generateEntityMongoose(entity.name)»
      '''
    ]
  }

  private def generateHeader(String id, String kind, String name, String description)
  '''
  /**
   * @id «GenerationUtils.purify(schema.name + "/" + id)»
   * @kind «kind»
   * @name «name»
   * @tags summary
   * @description «description»
   */
  '''

  private def generateEntityAccess(String entityName)
  '''
    import javascript
    import utils

    from MethodCallExpr expr
    where
      checkIsMDBDataMethod(expr.getMethodName())
      and
      (
        checkPropertyAccess(expr.getReceiver(), "«entityName»")
        or
        checkExprIsCollectionMethod(expr.getReceiver(), "«entityName»")
        or
        checkExprIsCollectionObject(expr.getReceiver(), "«entityName»")
      )
    select expr, expr.getMethodName() + ": «entityName»", 1
  '''

  private def generateEntityMongoose(String entityName)
  '''
    import javascript
    import utils

    from MethodCallExpr expr
    where
      checkIsMongooseExport(expr, "«entityName»")
    select expr, expr.getMethodName() + ": «entityName»", 1
  '''
}
