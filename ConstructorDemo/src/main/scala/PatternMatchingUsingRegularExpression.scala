import scala.util.matching.Regex

object PatternMatchingUsingRegularExpression extends App  {

  println("new")

  val pattern = new Regex("Hello")
  val pattern1="are".r    //r is a method in regex and calls the same constructor
  val stringToFind= "Hello how are you?Hello again"
  println(pattern findFirstIn(stringToFind))
  println((pattern findAllIn (stringToFind)).mkString("    "))  // will return the iterator so cnverting it to  string

  val pattern3="[0-9]+".r  //string having number
  val patternnumber="my flat number is 10 and in sector 22, noida 201301"
  println((pattern3 findAllIn(patternnumber)).mkString("_"))

  val pattern4="(H|h)ello".r   //character having capital and small h

  //using regualar expressino get or else

  println("NEW".r findFirstIn stringToFind  getOrElse("No data found"))
}
