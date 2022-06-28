package Traits

abstract  class Vehicle1{}
trait FourWheeler1{}
trait Car1{
  this: FourWheeler1 with Vehicle1=>{}   // this will make sure that if someone is extending car then it should also extend Vehicle and fourwheeler

}
object MandatoryTraits extends Vehicle1 with FourWheeler1 with Car1 with App{
  println("this is mandatory trait")


}
