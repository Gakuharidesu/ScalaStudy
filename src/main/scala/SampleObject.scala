class SampleObject private(a: Int) {
  protected var n = a
}

// コンパニオンオブジェクト
object SampleObject {
  def apply(a: Int) {
    new SampleObject(a)
  }
}
