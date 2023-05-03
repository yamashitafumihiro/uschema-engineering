/**
 * @id softwaredev/allcollections-access
 * @kind metric
 * @name Access to all collections
 * @tags summary
 * @description Access to all collections
 */
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
