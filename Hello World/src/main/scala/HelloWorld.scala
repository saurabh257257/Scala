object HelloWorld {

  def main(args:Array[String]): Unit ={
    println("Hello World"+sum(10,20)+"next="+sum1(20,40))
  }

  def sum(a:Int,b:Int): Int = {
    //  return a+b;
    a + b;
  }
  def sum1(a:Int,b:Int): Int =a+b;

  def new1(a:Int) =a+4;
}
