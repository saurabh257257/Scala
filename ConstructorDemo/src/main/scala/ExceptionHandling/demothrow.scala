package ExceptionHandling

object demothrow extends App{

  val a=10;
  try{
    if (a<11)
    {
      throw new RuntimeException("it a throw excpetion")
    }
  }

  catch {
    case a:RuntimeException => println("run time excpetion has been caught")
  }
}
