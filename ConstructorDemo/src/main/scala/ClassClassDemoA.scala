object ClassClassDemoA {
  def main(args:Array[String]): Unit=
    {
      val bmw=Car("BMW","550");
      bmw.printDetails()

      bmw match {case Car(a,b)=>println(a,b)};

      val mercedes= bmw.copy(name="mercedes")
      mercedes.printDetails()
      println(bmw==mercedes)

      println(bmw)
    }

}

case class Car(name:String,model:String)  //name and model are by default val. Therefore mutator methods are not generated and can't changed
{
val carName=name;
  val carModel=model;

  def printDetails()=
    {
      println("Car Name is "+carName+ "and its model is "+carModel)
    }
}
