object demoClassObject {
  def main(args:Array[String]):Unit={

  println("Hello demo class object")

    var bmw = new car
    println(bmw.cost(200));
  }
}

class car {
  var topClassExtraCost=0;
  private var roadTax=100;
  def cost(basicCost:Int)  :Int =basicCost+topClassExtraCost+roadTax;
}
