object SingletonObject {
  val a = 7;
  val b = 8;

  def function1  ()={println("Singleton object ")}
}

object test extends App
{
  println("Call SingletonObject ",SingletonObject.a,SingletonObject.b)
  SingletonObject.function1
}
