

object ImplicitClass extends App {
  implicit class StringFnClass(s:String)
  {
    def firstChar()={ s.substring(0,10)}
  }
  println("new")
  println("newkkkkkkkkkkkkkkkkkkkkkkk".firstChar())  //first it will check firstchar function in string class and if not get then it will come to implicit class
}
