package ArrayPackage

object Array1 extends App   {

  val num=new Array[Int](3)
  num(0)=5
  num(1)=10
  num(2)=20

  for (i<-num)
    {
    println(i)}

  //another way
  val num1=Array(10,20,30)
  for (i<-num1)
  {
    println(i)}

  println(num(0))  //array start with 0

  //another way
  for (i <- 0 to num1.length-1)
    {
      println(i)
    }

  //anther way
  num.foreach(println)

  //sum of num
  var sum=0
  num.foreach(x=>sum=sum+x)
  num.foreach(sum+=_)    //another way for foreach
  println("total sum is",sum)


   //map  --will always give you multiple output and it always returns you an array
  val z=num.map(x=>x+10)
  z.foreach(println)

  val a=num.map(_+10)
  a.foreach(println)

  //if you want for loop to return an array
  var result = for(i <-num) yield {i+10}
  println(result.getClass)
  result.foreach(println)
}
