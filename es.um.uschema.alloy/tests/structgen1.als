

sig Gen {
	data: set MyStruct
}

sig MyStruct {

	a: one String,
    b: one Int
}

fact  initPoolOfString {
	String in "a" + "b" + "c" + "d" + "e" + "f"+ "g" + "h" + "i"
}

//fact { #MyStruct >= 10 }


fact { all m : MyStruct | m.b > 0}
fact { all m : MyStruct { one g : Gen  | m in g.data}}

fact { all g : Gen | #(g.data) >= 6}

pred example {}

run  example for  1 Gen, 20 MyStruct
