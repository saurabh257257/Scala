object patternmatching extends App {
//Using a definition
def matchPattern(x:Int)= x match {
  case 1 =>"One"
  case 2 =>"Two"
  case _=>"others"  //underscore means any other character
}

def matchPattern1(x:Any)= x match {
    case 1 =>"One"
    case 2 =>"Two"
    case "Saurabh" =>"Saurabh"
    case _=>"others"  //underscore means any other character
  }

//  println(matchPattern(1),matchPattern(4),matchPattern1("Saurabh"))

// Using a case class

  val bmw=Car1("BMW",5000);
  val jaguar=Car1("Jaguar",10000)
  val tata=Car1("tata",10000)
  for (x <-List(bmw,jaguar,tata))
    {
      x match {
        case Car1("BMW",5000)=> println("wow the car is bmw")
        case Car1("Jaguar",10000)=> println("wow the car is jaguar")
        case Car1(name,cost)=> println("wow the car is and cost is ",name,cost)
      }
    }
}


case class Car1(name:String,cost:Int) {}
