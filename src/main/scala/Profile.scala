class Profile(_name: String, _age: Int) extends User(_name: String, _age: Int){

  // 親クラスのメソッドをオーバーライド
  override def agree = println("Hi, I'm " + name + ". I'm going to be " + real_age + " this year.")
}

