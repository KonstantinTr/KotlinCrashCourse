fun strings() {

  val s1 = "string \" \t \n"

  val s2 = """
    multiline
    string
  """.trimIndent() // or .trimMargin()

  val x = 2
  val s3 = "x = $x"
  val s4 = "2 * x = ${2 * x}"

}

fun lists() {

  val list: List<Int> = arrayListOf(1, 2, 3) // or listOf() to let compiler pick implementation
  val first = list[0]
  val second = list.get(1) // or .getOrElse or .getOrNull
  val sliced = list.slice(1 until list.size step 2)

  val mutable = mutableListOf(1, 2) // note that val bans reassigning reference not object mutation
  mutable.add(3)
  mutable.reverse()

  val immutable: List<Int> = mutable
  // won't compile
  // immutable.reverse(3)

  val empty: List<Int> = emptyList()

}

fun maps() {

  val map = mapOf(
    1 to "one", // or Pair(1, "one")
    2 to "two",
    3 to "three"
  )

  val third: String? = map[3] // or map.get(3)
  val fourth: String = map.getValue(4) // or .getOrDefault or .getOrElse

  // won't compile unless map is declared mutable
  // map[4] = "four"

}
