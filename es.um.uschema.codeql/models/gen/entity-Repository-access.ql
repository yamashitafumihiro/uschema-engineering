/**
 * @id softwaredev/entity-repository-access
 * @kind metric
 * @name Repository: Access
 * @tags summary
 * @description Repository: Access
 */
import javascript
import utils

from MethodCallExpr expr
where
  checkIsMDBDataMethod(expr.getMethodName())
  and
  (
    checkPropertyAccess(expr.getReceiver(), "Repository")
    or
    checkExprIsCollectionMethod(expr.getReceiver(), "Repository")
    or
    checkExprIsCollectionObject(expr.getReceiver(), "Repository")
  )
select expr, expr.getMethodName() + ": Repository", 1
