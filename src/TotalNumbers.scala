import scala.annotation.tailrec

object TotalNumbers extends App {

  override def main(args: Array[String]): Unit = {
    impCoding()
    funcCoding()
    numbersmap()
    val rvb = new ResultValueBundle[Int](true, 50)
    println(rvb.toString())
    println(factorial(10))
  }
  def impCoding(): Unit = {
    var list = List(1,2,3,4,5,6)
      
    var total = 0
    for(value <- list) {      total += value    }
    println(total)
  }
  def funcCoding(): Unit = {
    var list = List(1,2,3,4,5,6)
    println(
        list.foldLeft(0){ (c, e) => c + e }
    )
  }
  def numbersmap(): Unit = {
    val numbers = List(1,2,3,4,5,6)
    println(numbers.map { e => e * 2 })
  }
  def factorial(number: Int): BigInt = {
    @tailrec
    def factorialImpl(number: Int, factorial: BigInt): BigInt = {
      if(number == 1) {
        factorial
      } else {
        factorialImpl(number-1, factorial*number)
      }
    }
    factorialImpl(number, BigInt(1))
  }
}