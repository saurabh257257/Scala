package ExceptionHandling
import scala.util.Try
import scala.util.Success
import scala.util.Failure

object DemoTrySuccessFailure extends App{

  println("Hello")
  val a=Try(10/0)
  a match
    {
    case Success(value)=>println("Success"+value)
    case Failure(exception)=>errorhandlingfunction(exception)  //"Exception"+exception)
  }

  def errorhandlingfunction(e:Throwable)={
    println(e)
    println("it has come in this function")
  }
}



