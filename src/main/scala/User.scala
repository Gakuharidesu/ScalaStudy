class User(_name: String, _age: Int) {
  val name = _name
  val age = _age

  def agree = println("Hi, I'm " + name)

  def how_old = println("I'm" + fudge_the_count)

  protected def real_age = age // protectedメソッド

  private def fudge_the_count = age - 5 // privateメソッド


}
