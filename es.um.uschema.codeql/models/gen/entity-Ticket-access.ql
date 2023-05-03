/**
 * @id softwaredev/entity-ticket-access
 * @kind metric
 * @name Ticket: Access
 * @tags summary
 * @description Ticket: Access
 */
import javascript
import utils

from MethodCallExpr expr
where
  checkIsMDBDataMethod(expr.getMethodName())
  and
  (
    checkPropertyAccess(expr.getReceiver(), "Ticket")
    or
    checkExprIsCollectionMethod(expr.getReceiver(), "Ticket")
    or
    checkExprIsCollectionObject(expr.getReceiver(), "Ticket")
  )
select expr, expr.getMethodName() + ": Ticket", 1
