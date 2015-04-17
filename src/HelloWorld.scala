

/**
 * @author bram.zerbe
 */
class HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    println("What is your name?")
    val reader = new SysInReader
    var name = reader.readLine()
    println("Hello, "+name+"!")
  }
}