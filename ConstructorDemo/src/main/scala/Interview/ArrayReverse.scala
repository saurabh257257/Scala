package Interview


object ArrayReverse {




  def main(args: Array[String]) {
    // prints Hello World


    var input = args.mkString(",").toCharArray  //Array ('I',' ','d','r','i','v','e',' ','w','i','t','h',' ','B','o','l','t');
    input.foreach(print)
    var temp = 'x'
    var begin = 0
    var end = input.length - 1
    //reverse_function(begin,end,input)


    var first = 0
    for (i <- 0 to input.length - 1 by +1) {

      if (input(i) ==',' || i == input.length - 1) {
        println(i)
        if (first == 0) {
          first = i
        }
        if (first != 0) {
                  begin=first + 1
                  end=i - 1
                  while (begin < end) {
                    temp = input(begin)
                    input(begin) = input(end)
                    input(end) = temp
                    begin = begin + 1
                    end = end - 1

                  }
          first = i
        }

      }
    }
    println("Output")
    input.foreach(print)
  }

}

