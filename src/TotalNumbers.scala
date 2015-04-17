object TotalNumbers extends App {

  override def main(args: Array[String]): Unit = {
    impCoding()
  }
  def impCoding(): Unit = {
    var list = List(1,2,3,4,5,6)
      
    var total = 0
    for(value <- list) {      total += value    }
    println(total)
  }
}