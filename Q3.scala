object Q3 {
  def main(args: Array[String]): Unit = {
    val toUpper:String => String = upper => upper.toUpperCase()
    
    val toLower: String => String = lower => lower.toLowerCase()

    val formatNames: String => (String => String) => String =
    name => formatFunc => formatFunc(name)


    var name=List("Benny","Niroshan","Saman","Kumara")
    println(formatNames(name.head)(toUpper))
    println(name(1).head+formatNames(name(1).charAt(1).toString)(toUpper)+name(1).drop(2))
    println(formatNames(name(2))(toLower))
    println(name.last.init+formatNames(name.last.last.toString)(toUpper))
  }
}
