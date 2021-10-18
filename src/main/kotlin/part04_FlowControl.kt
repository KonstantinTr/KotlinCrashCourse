import kotlin.random.Random

fun branching() {

  val number = if (Random.nextInt() % 2 == 0) "even" else "odd"

  val isOdd = if (number == "even") {
    println("doing something even")
    false
  } else {
    println("doing something odd")
    true
  }

  val a: Number = 10
  val b = when (a) { // modernized C-style case clause
    0 -> "is zero"
    1, 2, 3 -> "is small"
    in 5..8 -> "is considerable"
    is Double -> "is of type double"
    else -> "nothing matched"
  }

  val c: String? = "abc"
  val d = when { // Scheme-style pattern matching
    c == null -> "nope"
    c.length > 100 -> "crazy value"
    "e" in c -> "impossible"
    fun(): Boolean { return true }() -> "literally any assertion that evaluates to Boolean"
    else -> {
      println("doing something important")
      "nothing matched"
    }
  }

}

fun looping() {

  while (false) {
    // do something
  }

  do {
    // do at least once
  } while (false)

  for (item in 0..2) {
    println(item)
  }

}

fun iteratingSequences() {

  val integers = listOf(1, 2, 3)

  integers.forEach(::println)

  integers.forEachIndexed { idx, item ->
    println("idx: $idx, val: $item")
  }

  // Old good functional stuff
  integers.map { 2 * it }
  integers.filter { it > 1 }
  integers.reduce { a, b -> a + b }
  integers.foldRight(0) { a, b -> a + b }

  integers
    .asSequence() // makes chaining lazy
    .mapIndexed { idx, item -> maxOf(idx, item) }
    .filter { it > 1 }
    .reduce { a, b -> a + b }

  val iterator = integers.iterator()
  while (iterator.hasNext()) {
    iterator.next()
  }

}

fun iteratingMaps() {

  val words = mapOf("a" to "b", "c" to "d")

  for ((k, v) in words.entries) {
    println("key: $k, value: $v")
  }

  words
    .entries // or .keys or .values
    .forEach { (k, v) ->
      println("key: $k, value: $v")
    }

  words
    .map { (k, v) -> v to k }
    .filter { it != Pair("a", "b") }
    .toMap()

  words
    .asSequence()
    .associate { (k, v) -> v to k }

}
