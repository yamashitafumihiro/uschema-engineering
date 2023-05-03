/**
 * @id softwaredev/entity-developer-access
 * @kind metric
 * @name Developer: Access
 * @tags summary
 * @description Developer: Access
 */
import javascript
import utils

from MethodCallExpr expr
where
  checkIsMDBDataMethod(expr.getMethodName())
  and
  (
    checkPropertyAccess(expr.getReceiver(), "Developer")
    or
    checkExprIsCollectionMethod(expr.getReceiver(), "Developer")
    or
    checkExprIsCollectionObject(expr.getReceiver(), "Developer")
  )
select expr, expr.getMethodName() + ": Developer", 1
