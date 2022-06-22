package ExceptionHandling

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import java.lang.ArithmeticException
object DemoTryCatch extends  App  {
  println("Hello World")
  try {

    val f = new FileReader("C:\\Users\\alejandro\\Desktop\\Scala\\ConstructorDemo\\src\\main\\scala\\ExceptionHandling\\import.txt")
    val z=12/0
    val m = new FileReader("new.csv")
  }
  catch
    {
      case e: FileNotFoundException => println("filenotfound")
      case xyz : Exception => println("it will catch all kinds of exception."+xyz)  //bascially xyz is a variable of type exception
      case _=> println("other exception")
    }


  finally  //it will always be excecuted irrepective of exception
  {
    println("this is final block and it will always be excecuted irrespective of exception.")
  }
}
