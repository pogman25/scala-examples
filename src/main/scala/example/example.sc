
var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokio")
println(capital("France"))

val greetStr = new Array[String](3)
greetStr(0) = "Hello"
greetStr(1) = " "
greetStr(2) = "World!"

greetStr.foreach(println)
println(greetStr.mkString("\n"))

val oneTwo = List(1, 2)
val threeFour = List(3, 4)

val allTogether = oneTwo ::: threeFour

println(allTogether)

val newList = "Will" :: "be" :: "list" :: Nil

println(newList)

val pair = (99, "Luck")
println(pair._1)

println(
  """|Welcome home
    |my Dear friend
  """.stripMargin)

println(s"sum of 2 + 3: ${2+3}")
