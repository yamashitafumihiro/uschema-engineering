module es_um_uschema_USchema_example
open USchema

one sig P1 extends Person {} {
  name = "Joe"
  email = "joe@email.com"
}
run {
  some p: Person | p.name != "Joe"
}
