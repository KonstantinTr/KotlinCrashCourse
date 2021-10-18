fun valuesAndVariables() {

  val whole: Int = 1  // value can't be reassigned (referred object might mutate though)

  var real = 0.0
  real = 1.0

}

fun literalsAndPrimitiveTypes() {

  val long = 1000L // or 1_000L
  val float = 3f  // or 3F
  val hex: Long = 0xCAFE_CAFE

  val unsigned = 2u  // or 2U
  val hex2: ULong = 0b00110101u

  val answer = 2 * (20 + 1)

}

fun nullability() {

  // won't compile
  // val byte: Byte = null

  val maybeBool: Boolean? = null

  if (maybeBool != null) {
    val bool: Boolean = maybeBool // smart cast to non-nullable
      .xor(true)
      .and(true)
      .or(false)
  }

  val bool: Boolean = maybeBool
    ?.xor(true) // either calls to a method or returns null
    ?.and(true)
    ?.or(false)
    ?: false // (optional) default value

  maybeBool!! // throws runtime exception if null

}
