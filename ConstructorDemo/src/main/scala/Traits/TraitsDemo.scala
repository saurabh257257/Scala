package Traits

abstract  class Vehicle{
  def category()
}

trait FourWheeler{
  def tyres()={ println("It has 4 tyres for 4 wheeler")}
}

trait car
{
  def engine()={ println("Engine is 1000cc")}
  def break()
  def tyres()={ println("It has 4 tyres from car")}
}

class mercedes extends  Vehicle with car with FourWheeler {   //will execute from right to left
  def break()={println(" this is break")}

     def category(): Unit = {
     println("its a vehicle method")
  }
  override def tyres(): Unit = super.tyres()

}
object TraitsDemo extends App {
  val a =new mercedes()
  a.break()
  a.tyres()
  a.category()
}
