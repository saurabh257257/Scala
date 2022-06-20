import scala.util.control.Breaks

object Conditional_if_else extends  App {

  var x=10
  if(x>5)
    {
      println("value is greater than 5")
    }
  else
    {
      println("value is less than 5")
    }

  while(x<20)
    {
      println("value of x is ",x)
      x=x+1
    }

  do{
    println("value of x is in do",x)
    x=x+1
  }while(x<22)

  for(i <- 1 to 10)
    {
      println("for value of i ",i)
    }

  for (i <- 1 until 5)
    {
      println("for value of i until",i)
    }

  //nest for look
  for(i<- 1 to 10)
    for(j<-1 to 5)
      {
        print("nested loop",i,j)
      }

  //other way of writing nested loop.
  for(i<-1 to 10; j <-1 to 5)
  {
    println("Nested for loop in other way",i,j)
  }

  var a = List(1,2,3,4,5,6)  //list are non mutable and list in scala is array in python

  for (i <- a if i%2==0; if i != 4 )
  {
    println("print list element",i)
  }

  //yield is almost same as return

  val evenNumberList= for(i<-a if i%2==0) yield i
  println(evenNumberList)


  //break
  val breakobject=new Breaks;
  breakobject.breakable
  {
    for (i<-a if i%2==0)
      {
        println("println the value of i ",i)

        if (i==4)
          {
            println("I am breaking at 4")
            breakobject.break;
          }
      }
  }

}
