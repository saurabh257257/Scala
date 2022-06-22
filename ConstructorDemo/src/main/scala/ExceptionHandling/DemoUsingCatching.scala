package ExceptionHandling
import scala.util.control.Exception.catching
object DemoUsingCatching extends App {


  val catchException = catching(classOf[ArithmeticException],classOf[ArrayIndexOutOfBoundsException]).withApply(y => println("Airthmatic exception has occoured"))
  val a = catchException(10 / 0)

  if (a != ()) {
    println(a)
  }
}

