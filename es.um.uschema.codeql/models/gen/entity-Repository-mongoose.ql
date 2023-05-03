/**
 * @id softwaredev/entity-repository-mongoose
 * @kind metric
 * @name MongooseRepository
 * @tags summary
 * @description Repository: Mongoose
 */
import javascript
import utils

from MethodCallExpr expr
where
  checkIsMongooseExport(expr, "Repository")
select expr, expr.getMethodName() + ": Repository", 1
