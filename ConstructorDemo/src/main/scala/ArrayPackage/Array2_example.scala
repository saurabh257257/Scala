package ArrayPackage

object Array2_example extends App {

  println("Hello World")
  var marks= Array(21,25,26,27,28,29,30,21)
  var avg=marks.reduceLeft((x,y)=>x+y)
  var sum=marks.reduceLeft(_+_)
  var max=marks.reduceLeft(_ max _)

  var avg_r=marks.reduceRight((x,y)=>x+y)
  var sum_r=marks.reduceRight(_+_)
  var max_r=marks.reduceRight(_ max _)
  println(avg,sum,max,avg_r,sum_r,max_r)
}
