object ConstructorDemo {
  def main (args:Array[String]): Unit =
    {
      println("Hello world")
      val demo= new demoClass;
      val demo1=new demoClass1(10,20)
      val demo2=new demoClass1
      val demo3=new demoClass1(1000)
    }
}


class demoClass
{
  val a=2;
  val b=3;
  def add()=a+b;

  println(s"x=${a} and y=${b}")
}


class demoClass1(c:Int,d:Int)   //primary constructor or parameterized constructor
{
  val a=c;
  val b=d;
  def add()=a+b;
  
  def this()={
    this(100,200);
    println("I have come here in first constructor")
  }

  def this(a:Int)={
    this(a,200);
    println("I have come here in second auxillary constructor")
  }
  println(s"x=${a} and y=${b}")
}