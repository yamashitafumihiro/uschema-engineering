/**
 * @id softwaredev/entity-developerinfo-access
 * @kind metric
 * @name DeveloperInfo: Access
 * @tags summary
 * @description DeveloperInfo: Access
 */
import javascript
import utils

from MethodCallExpr expr
where
  checkIsMDBDataMethod(expr.getMethodName())
  and
  (
    checkPropertyAccess(expr.getReceiver(), "DeveloperInfo")
    or
    checkExprIsCollectionMethod(expr.getReceiver(), "DeveloperInfo")
    or
    checkExprIsCollectionObject(expr.getReceiver(), "DeveloperInfo")
  )
select expr, expr.getMethodName() + ": DeveloperInfo", 1
