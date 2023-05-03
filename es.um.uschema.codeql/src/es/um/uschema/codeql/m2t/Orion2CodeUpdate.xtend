package es.um.uschema.codeql.m2t

import es.um.uschema.xtext.orion.orion.OrionOperations
import java.util.List
import es.um.uschema.xtext.orion.orion.BasicOperation
import es.um.uschema.xtext.orion.orion.EntityDeleteOp
import java.util.ArrayList
import es.um.uschema.xtext.orion.orion.EntityRenameOp
import es.um.uschema.codeql.utils.config.AlertEnum
import es.um.uschema.xtext.orion.orion.EntityAddOp
import es.um.uschema.xtext.orion.orion.FeatureDeleteOp
import es.um.uschema.xtext.orion.orion.FeatureSelector
import es.um.uschema.codeql.utils.GenerationUtils
import com.google.common.base.Strings
import es.um.uschema.xtext.orion.orion.FeatureRenameOp
import es.um.uschema.xtext.orion.orion.AttributeAddOp
import es.um.uschema.xtext.orion.orion.AggregateAddOp
import es.um.uschema.xtext.orion.orion.ReferenceAddOp
import es.um.uschema.xtext.orion.orion.FeatureCopyOp
import es.um.uschema.xtext.orion.orion.FeatureMoveOp
import es.um.uschema.xtext.orion.orion.AttributeCastOp
import es.um.uschema.xtext.orion.orion.ReferenceMorphOp
import es.um.uschema.xtext.orion.orion.AggregateMorphOp
import es.um.uschema.xtext.orion.orion.EntityExtractOp
import es.um.uschema.xtext.orion.orion.EntitySplitOp
import es.um.uschema.xtext.orion.orion.EntityMergeOp
import es.um.uschema.xtext.orion.orion.ReferenceCastOp
import es.um.uschema.xtext.orion.orion.ReferenceMultiplicityOp
import es.um.uschema.xtext.orion.orion.AggregateMultiplicityOp

class Orion2CodeUpdate
{
  AlertEnum alertLevel
  int opIndex
  String schemaId

  new(AlertEnum alertLevel)
  {
    this.alertLevel = alertLevel
    this.opIndex = 0
    this.schemaId = ""
  }

  private def getNextIndex()
  {
    val result = Strings.padStart(opIndex.toString, 3, '0')
    opIndex++

    return result
  }

  def List<Pair<String, String>> m2t(OrionOperations orion)
  {
    val result = new ArrayList<Pair<String, String>>()
    schemaId = orion.imports.importedNamespace.id.name + "-" + orion.imports.importedNamespace.id.version

    if (!orion.operations.empty)
      for (op : orion.operations)
      {
        if (alertLevel !== AlertEnum.ERROR)
        {
          val opResult = generateWarningQueries(op)
          if (opResult !== null)
            result.addAll(opResult)
        }
        if (alertLevel !== AlertEnum.WARNING)
        {
          val opResult = generateErrorQueries(op)
          if (opResult !== null)
            result.addAll(opResult)
        }
      }
    else
    {// Rethink the names. Maybe put them in a folder?
      for (eBlock : orion.evolBlocks)
        for (op: orion.operations)
        {
          if (alertLevel !== AlertEnum.ERROR)
          {
            val opResult = generateWarningQueries(op)
            if (opResult !== null)
              result.addAll(opResult)
          }
          if (alertLevel !== AlertEnum.WARNING)
          {
            val opResult = generateErrorQueries(op)
            if (opResult !== null)
              result.addAll(opResult)
          }
        }
    }

    return result
  }

  private def dispatch generateWarningQueries(BasicOperation op) { null }

  // Add Entity
  // Extract Entity
  // Copy Feature
  // Delvar/Adapt/Union Variation
  private def dispatch generateErrorQueries(BasicOperation op)   { null }

  private def dispatch generateWarningQueries(EntityAddOp op)
  {
    val id = getNextIndex() + "-op-add-entity-" + op.spec.name + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Add Entity: " + op.spec.name, "Warning: New entity when retrieving all collections", "warning")»
      «generateAccessToAllCollectionsQuery("WARNING: Access to all Collections now grants a new entity: " + op.spec.name)»
      '''
    ]
  }

  private def dispatch generateWarningQueries(EntityDeleteOp op)
  {
    val id = getNextIndex() + "-op-delete-entity-" + op.spec.ref + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Delete Entity: " + op.spec.ref, "Warning: Assignment referencing the name of a deleted entity", "warning")»
      «generateAssignmentQuery(op.spec.ref, op.spec.ref + ": This entity has been deleted.")»
      '''
    ]
  }

  private def dispatch generateWarningQueries(EntityRenameOp op)
  {
    val id = getNextIndex() + "-op-rename-entity-" + op.spec.ref + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Rename Entity: " + op.spec.ref, "Warning: Assignment referencing the name of a renamed entity", "warning")»
      «generateAssignmentQuery(op.spec.ref, op.spec.ref + ": This entity has been renamed to \\\"" + op.spec.name + "\\\".")»
      '''
    ]
  }

  private def dispatch generateWarningQueries(EntityExtractOp op)
  {
    val id = getNextIndex() + "-op-extract-entity-" + op.spec.name + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Extract Entity: " + op.spec.name, "Warning: New extracted entity when retrieving all collections", "warning")»
      «generateAccessToAllCollectionsQuery("WARNING: Access to all Collections now grants a new entity obtained by extraction: " + op.spec.name)»
      '''
    ]
  }
  private def dispatch generateWarningQueries(EntitySplitOp op)
  {
    val id = getNextIndex() + "-op-split-entity-" + op.spec.ref + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Split Entity: " + op.spec.ref, "Warning: Assignment referencing the name of an entity that was split", "warning")»
      «generateAssignmentQuery(op.spec.ref, op.spec.ref + ": This entity has been split into \\\"" + op.spec.name1 + "\\\" and \\\"" + op.spec.name2 + "\\\".")»
      '''
    ]
  }

  private def dispatch generateWarningQueries(EntityMergeOp op)
  {
    val result = new ArrayList<Pair<String, String>>()

    val id1 = getNextIndex() + "-op-merge-entity-" + op.spec.ref1 + "-and-" + op.spec.ref2 + "-error"
    result += id1 ->
      '''
      «generateHeader(id1, "problem", "Merge Entity: " + op.spec.ref1, "Warning: Attempting referencing the name of a entity that was merged", "warning")»
      «generateAssignmentQuery(op.spec.ref1, op.spec.ref1 + ": This entity was merged with \\\"" + op.spec.ref2 + "\\\" into \\\"" + op.spec.name + "\\\".")»
      '''

    val id2 = getNextIndex() + "-op-merge-entity-" + op.spec.ref1 + "-and-" + op.spec.ref2 + "-error"
    result += id2 ->
      '''
      «generateHeader(id2, "problem", "Merge Entity: " + op.spec.ref2, "Warning: Attempting referencing the name of a entity that was merged", "warning")»
      «generateAssignmentQuery(op.spec.ref2, op.spec.ref2 + ": This entity was merged with \\\"" + op.spec.ref1 + "\\\" into \\\"" + op.spec.name + "\\\".")»
      '''

    return result
  }

  private def dispatch generateWarningQueries(FeatureCopyOp op)
  {
    val id = getNextIndex() + "-op-copy-feature-" + (op.spec.targetSelector.ref === null ? "all" : op.spec.targetSelector.ref) + "-" + op.spec.targetSelector.target + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Copy Feature: " + op.spec.sourceSelector.target, "Warning: A feature was copied to an entity", "warning")»
      «generateMongooseQueryFeatureNotExists(op.spec.targetSelector, op.spec.targetSelector.target, (op.spec.targetSelector.ref === null ? "all" : op.spec.targetSelector.ref) + "." + op.spec.targetSelector.target + ": This feature has been copied here.")»
      '''
    ]
  }

  private def dispatch generateWarningQueries(FeatureMoveOp op)
  {
    val id = getNextIndex() + "-op-move-feature-" + (op.spec.targetSelector.ref === null ? "all" : op.spec.targetSelector.ref) + "-" + op.spec.targetSelector.target + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Move Feature: " + op.spec.sourceSelector.target, "Warning: A feature was moved to an entity", "warning")»
      «generateMongooseQueryFeatureNotExists(op.spec.targetSelector, op.spec.targetSelector.target, (op.spec.targetSelector.ref === null ? "all" : op.spec.targetSelector.ref) + "." + op.spec.targetSelector.target + ": This feature has been moved here.")»
      '''
    ]
  }

  private def dispatch generateWarningQueries(AttributeAddOp op)
  {
    val id = getNextIndex() + "-op-add-attribute-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + op.spec.selector.target + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Add Attribute: " + op.spec.selector.target, "Warning: An attribute was added to an entity", "warning")»
      «generateMongooseQueryFeatureNotExists(op.spec.selector, op.spec.selector.target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + op.spec.selector.target + ": This attribute has been added.")»
      '''
    ]
  }

  private def dispatch generateWarningQueries(ReferenceAddOp op)
  {
    val id = getNextIndex() + "-op-add-reference-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + op.spec.selector.target + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Add Reference: " + op.spec.selector.target, "Warning: A reference was added to an entity", "warning")»
      «generateMongooseQueryFeatureNotExists(op.spec.selector, op.spec.selector.target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + op.spec.selector.target + ": This reference has been added.")»
      '''
    ]
  }

  private def dispatch generateWarningQueries(AggregateAddOp op)
  {
    val id = getNextIndex() + "-op-add-aggregate-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + op.spec.selector.target + "-warning"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Add Aggregate: " + op.spec.selector.target, "Warning: An aggregate was added to an entity", "warning")»
      «generateMongooseQueryFeatureNotExists(op.spec.selector, op.spec.selector.target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + op.spec.selector.target + ": This aggregate has been added.")»
      '''
    ]
  }

  private def dispatch generateErrorQueries(EntityDeleteOp op)
  {
    val id = getNextIndex() + "-op-delete-entity-" + op.spec.ref + "-error"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Delete Entity: " + op.spec.ref, "Error: Attempting to access a deleted entity", "error")»
      «generatePropAccessOrCollMethodOrMongooseQuery(op.spec.ref, op.spec.ref + ": This entity has been deleted.")»
      '''
    ]
  }

  private def dispatch generateErrorQueries(EntityRenameOp op)
  {
    val id = getNextIndex() + "-op-rename-entity-" + op.spec.ref + "-error"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Rename Entity: " + op.spec.ref, "Error: Attempting to access a renamed entity", "error")»
      «generatePropAccessOrCollMethodOrMongooseQuery(op.spec.ref, op.spec.ref + ": This entity has been renamed to \\\"" + op.spec.name + "\\\".")»
      '''
    ]
  }

  private def dispatch generateErrorQueries(EntitySplitOp op)
  {
    val id = getNextIndex() + "-op-split-entity-" + op.spec.ref + "-error"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Split Entity: " + op.spec.ref, "Error: Attempting to access an entity that was split", "error")»
      «generatePropAccessOrCollMethodOrMongooseQuery(op.spec.ref, op.spec.ref + ": This entity has been split into \\\"" + op.spec.name1 + "\\\" and \\\"" + op.spec.name2 + "\\\".")»
      '''
    ]
  }

  // Something to discuss about is that these two CodeQL queries could be one and NAME in [name1, name2]. But then it does provide a less accurate message.
  private def dispatch generateErrorQueries(EntityMergeOp op)
  {
    val result = new ArrayList<Pair<String, String>>()

    val id1 = getNextIndex() + "-op-merge-entity-" + op.spec.ref1 + "-and-" + op.spec.ref2 + "-error"
    result += id1 ->
      '''
      «generateHeader(id1, "problem", "Merge Entity: " + op.spec.ref1, "Error: Attempting to access an entity that was merged", "error")»
      «generatePropAccessOrCollMethodOrMongooseQuery(op.spec.ref1, op.spec.ref1 + ": This entity was merged with \\\"" + op.spec.ref2 + "\\\" into \\\"" + op.spec.name + "\\\".")»
      '''

    val id2 = getNextIndex() + "-op-merge-entity-" + op.spec.ref1 + "-and-" + op.spec.ref2 + "-error"
    result += id2 ->
      '''
      «generateHeader(id2, "problem", "Merge Entity: " + op.spec.ref2, "Error: Attempting to access an entity that was merged", "error")»
      «generatePropAccessOrCollMethodOrMongooseQuery(op.spec.ref2, op.spec.ref2 + ": This entity was merged with \\\"" + op.spec.ref1 + "\\\" into \\\"" + op.spec.name + "\\\".")»
      '''

    return result
  }

  private def dispatch generateErrorQueries(FeatureDeleteOp op)
  {
    val result = new ArrayList<Pair<String, String>>()

    for (String target : op.spec.selector.targets)
    {
      val id = getNextIndex() + "-op-delete-feature-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + target + "-error"
      result += id ->
        '''
        «generateHeader(id, "problem", "Delete Feature: " + target, "Error: Attempting to access a deleted feature in a specific entity", "error")»
        «generateFieldAccessMethodQuery(op.spec.selector, target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + target + ": This feature has been deleted.")»
        '''
    }

    return result
  }

  private def dispatch generateErrorQueries(FeatureRenameOp op)
  {
    val id = getNextIndex() + "-op-rename-feature-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + op.spec.name + "-error"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Rename Feature: " + op.spec.name, "Error: Attempting to access a renamed feature in a specific entity", "error")»
      «generateFieldAccessMethodQuery(op.spec.selector, op.spec.selector.target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + op.spec.selector.target + ": This feature has been renamed to \\\"" + op.spec.name + "\\\".")»
      '''
    ]
  }

  private def dispatch generateErrorQueries(FeatureMoveOp op)
  {
    val id = getNextIndex() + "-op-move-feature-" + (op.spec.sourceSelector.ref === null ? "all" : op.spec.sourceSelector.ref) + "-to-" + op.spec.targetSelector.ref + "-error"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Move Feature: " + op.spec.sourceSelector.ref, "Error: Attempting to access a moved feature", "error")»
      «generateFieldAccessMethodQuery(op.spec.sourceSelector, op.spec.sourceSelector.target, (op.spec.sourceSelector.ref === null ? "all" : op.spec.sourceSelector.ref) + "." + op.spec.sourceSelector.target + ": This feature has been moved to \\\"" + op.spec.targetSelector.ref + "." + op.spec.targetSelector.target + "\\\".")»
      '''
    ]
  }

  private def dispatch generateErrorQueries(AttributeCastOp op)
  {
    val result = new ArrayList<Pair<String, String>>()

    for (String target : op.spec.selector.targets)
    {
      val id = getNextIndex() + "-op-cast-attribute-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + target + "-error"
      result += id ->
        '''
        «generateHeader(id, "problem", "Cast Attribute: " + target, "Error: Attempting to access an attribute whose type changed to " + op.spec.type.typename + " in a specific entity", "error")»
        «generateFieldAccessMethodQuery(op.spec.selector, target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + target + ": This attribute's type has changed to: " + op.spec.type.typename)»
        '''
    }

    return result
  }

  private def dispatch generateErrorQueries(ReferenceCastOp op)
  {
    val result = new ArrayList<Pair<String, String>>()

    for (String target : op.spec.selector.targets)
    {
      val id = getNextIndex() + "-op-cast-reference-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + target + "-error"
      result += id ->
        '''
        «generateHeader(id, "problem", "Cast Reference: " + target, "Error: Attempting to access a reference whose type changed to " + op.spec.type.typename + " in a specific entity", "error")»
        «generateFieldAccessMethodQuery(op.spec.selector, target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + target + ": This reference's type has changed to: " + op.spec.type.typename)»
        '''
    }

    return result
  }

  private def dispatch generateErrorQueries(ReferenceMultiplicityOp op)
  {
    val result = new ArrayList<Pair<String, String>>()

    for (String target : op.spec.selector.targets)
    {
      val id = getNextIndex() + "-op-mult-reference-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + target + "-error"
      result += id ->
        '''
        «generateHeader(id, "problem", "Mult Reference: " + target, "Error: Attempting to access a reference whose multiplicity changed to " + op.spec.multiplicity + " in a specific entity", "error")»
        «generateFieldAccessMethodQuery(op.spec.selector, target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + target + ": This reference's multiplicity has changed to: " + op.spec.multiplicity)»
        '''
    }

    return result
  }

  private def dispatch generateErrorQueries(ReferenceMorphOp op)
  {
    val id = getNextIndex() + "-op-morph-reference-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + op.spec.name + "-error"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Morph Reference: " + op.spec.name, "Error: Attempting to access a reference that was morphed to an aggregate", "error")»
      «generateFieldAccessMethodQuery(op.spec.selector, op.spec.selector.target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + op.spec.selector.target + ": This reference has been morphed to an aggregate: \\\"" + op.spec.name + "\\\".")»
      '''
    ]
  }

  private def dispatch generateErrorQueries(AggregateMultiplicityOp op)
  {
    val result = new ArrayList<Pair<String, String>>()

    for (String target : op.spec.selector.targets)
    {
      val id = getNextIndex() + "-op-mult-aggregate-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + target + "-error"
      result += id ->
        '''
        «generateHeader(id, "problem", "Mult Aggregate: " + target, "Error: Attempting to access an aggregate whose multiplicity changed to " + op.spec.multiplicity + " in a specific entity", "error")»
        «generateFieldAccessMethodQuery(op.spec.selector, target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + target + ": This aggregate's multiplicity has changed to: " + op.spec.multiplicity)»
        '''
    }

    return result
  }

  private def dispatch generateErrorQueries(AggregateMorphOp op)
  {
    val id = getNextIndex() + "-op-morph-aggregate-" + (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "-" + op.spec.name + "-error"
    #[ id ->
      '''
      «generateHeader(id, "problem", "Morph Aggregate: " + op.spec.name, "Error: Attempting to access an aggregate that was morphed to a reference", "error")»
      «generateFieldAccessMethodQuery(op.spec.selector, op.spec.selector.target, (op.spec.selector.ref === null ? "all" : op.spec.selector.ref) + "." + op.spec.selector.target + ": This aggregate has been morphed to a reference: \\\"" + op.spec.name + "\\\".")»
      '''
    ]
  }

  private def generateAccessToAllCollectionsQuery(String message)
  '''
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
    select method, "«message»"
  '''

  private def generateAssignmentQuery(String entityName, String message)
  '''
    import javascript
    import utils

    from Assignment assignment
    where checkExprEvaluatesToString(assignment.getRhs(), "«entityName»")
    select assignment, "«message»"
  '''

  private def generatePropAccessOrCollMethodOrMongooseQuery(String entityName, String message)
  '''
    import javascript
    import utils

    from Expr expr
    where
      checkPropertyAccess(expr, "«entityName»")
      or
      checkExprIsCollectionMethod(expr, "«entityName»")
      or
      checkIsMongooseExport(expr, "«entityName»")
    select expr, "«message»"
  '''

  private def generateFieldAccessMethodQuery(FeatureSelector selector, String featureName, String message)
  '''
    import javascript
    import utils

    from MethodCallExpr method
    where
      (
        checkIsMDBDataMethod(method.getMethodName())
        «IF !selector.forAll»
        and
        (
          checkPropertyAccess(method.getReceiver(), "«selector.ref»")
          or
          checkExprIsCollectionMethod(method.getReceiver(), "«selector.ref»")
          or
          checkExprIsCollectionObject(method.getReceiver(), "«selector.ref»")
        )
        «ENDIF»
        and
        (
          checkFeatureIsInObject(method.getAnArgument(), "«featureName»")
          or
          checkFeatureIsInVarRef(method.getAnArgument(), "«featureName»")
          or
          checkFeatureIsInArray(method.getAnArgument(), "«featureName»")
          or
          checkExprEvaluatesToString(method.getAnArgument(), "«featureName»")
        )
      )
      or
      (
        checkIsMongooseExport(method, "«selector.ref»")
        and
        (
          checkFeatureIsInMongooseSchema(method.getArgument(1), "«featureName»")
          or
          checkFeatureIsInMongooseSchemaVarRef(method.getArgument(1), "«featureName»")
        )
      )
    select method, "«message»"
  '''

  private def generateMongooseQueryFeatureNotExists(FeatureSelector selector, String featureName, String message)
  '''
    import javascript
    import utils
    
    from MethodCallExpr method
    where
      «IF !selector.forAll»
        checkIsMongooseExport(method, "«selector.ref»")
      «ELSE»
        checkIsAnyMongooseExport(method)
      «ENDIF»
      and
      (
        not checkFeatureIsInMongooseSchema(method.getArgument(1), "«featureName»")
        and
        not checkFeatureIsInMongooseSchemaVarRef(method.getArgument(1), "«featureName»")
      )
    select method, "«message»"
  '''

  private def generateHeader(String id, String kind, String name, String description, String severity)
  '''
  /**
   * @id «GenerationUtils.purify(schemaId + "/" + id)»
   * @kind «kind»
   * @name «name»
   * @description «description»
   * @problem.severity «severity»
   */
  '''
}
