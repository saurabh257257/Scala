package Traits

object DemoValueClass extends App {

  val m1=new mercedesE(5)
  m1.hello();
}

trait CarE extends Any{        //universal trait
  def print()={ println("Hello World")}
}
class mercedesE(val x:Int) extends  AnyVal with CarE {
 def hello()={ println("Value class")}
}

