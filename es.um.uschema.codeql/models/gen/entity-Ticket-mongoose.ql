/**
 * @id softwaredev/entity-ticket-mongoose
 * @kind metric
 * @name MongooseTicket
 * @tags summary
 * @description Ticket: Mongoose
 */
import javascript
import utils

from MethodCallExpr expr
where
  checkIsMongooseExport(expr, "Ticket")
select expr, expr.getMethodName() + ": Ticket", 1
