package objects

object Samp {
  def main(args: Array[String]): Unit = {
    val seq = Seq(1, 2, 3)
    println(seq(0))

    seq.foreach {println}

    var map = Map("key" -> "val")
    println(map("key"))
    map += ("key2" -> "value")
  }

  def func(num:Int): Int = {
    12 + num
  }
}
