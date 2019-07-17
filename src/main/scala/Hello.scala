object Hello extends App {
  var num:Int = 1
  var str:String = "abc"
  var short:Short = _ // _ で初期値が指定

  val NUM:Int = 1 // valが定数
  val STR:String = "ccd"

  if (true) 1 else 2
  while (num < 10) {
    println(num)
    num += 1
  }

  for (s <- Array("a", "b", "c")) {
    println(s)
  }

  var one = 1

  // switch文的な
  one match {
    case 1 => println("one")
    case 2 => println("two")
    case _ => println("other")
  }



  println("hello world")
}
