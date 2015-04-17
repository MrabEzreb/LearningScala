class ResultValueBundle[A](startResult: Boolean, startValue: A) {
  var result = startResult
  var value = startValue
  println("Created a ResultValue Bundle with value type of "+value.getClass().getSimpleName())
  override def toString(): String = {
    var string = value+": "+result
    string
  }
}