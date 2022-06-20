object stringtest extends App
{
  println("new")
  val a=
    """
      |my
      |name
      |is
      $saurabh
      |""".stripMargin('$')
 val b=
   """
      my
      name
      is
      saurabh
   """
  println(a)
  println(b)
}