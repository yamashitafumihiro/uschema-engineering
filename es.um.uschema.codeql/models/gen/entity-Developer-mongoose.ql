/**
 * @id softwaredev/entity-developer-mongoose
 * @kind metric
 * @name MongooseDeveloper
 * @tags summary
 * @description Developer: Mongoose
 */
import javascript
import utils

from MethodCallExpr expr
where
  checkIsMongooseExport(expr, "Developer")
select expr, expr.getMethodName() + ": Developer", 1
