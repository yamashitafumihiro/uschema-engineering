/**
 * @id softwaredev/entity-developerinfo-mongoose
 * @kind metric
 * @name MongooseDeveloperInfo
 * @tags summary
 * @description DeveloperInfo: Mongoose
 */
import javascript
import utils

from MethodCallExpr expr
where
  checkIsMongooseExport(expr, "DeveloperInfo")
select expr, expr.getMethodName() + ": DeveloperInfo", 1
