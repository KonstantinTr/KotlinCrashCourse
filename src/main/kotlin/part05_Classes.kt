data class Vector(
  val x: Int,
  val y: Int
) : java.io.Serializable

class ClassDemo {

  private var _value: String = "initial"

  var value: String
    get() = announceAnswer()
    set(newValue) {
      _value = newValue
    }

  private fun announceAnswer(): String {
    return "_value is set to: ${this._value}"
  }

  companion object {
    fun akaStaticMethod() = println("Calling static method")
    fun fromNothing(): ClassDemo { // aka StaticFactoryMethod
      return ClassDemo()
    }
  }

}

class ConstructorDemo(
  arg: Int = 8,
  val field1: Int = 0,
  private val privateField1: Int = 1,
) {

  val field2 = arg + 2

  init {
    print("field2 val is $field2")
  }

  private val privateField2 = mutableListOf<String>()

  init {
    privateField2.add("instantieted")
    println("doing something important during instantiation")
  }

  constructor(arg: Int) : this(arg, 20, 100) {
    privateField2.add("secondary constructor was invoked")
  }

}

object Singeltone {
  val staticField = "The only"
  fun staticMethod() = 2 + 2
}

fun main() {

  val point = Vector(1, 2)
  point.x

  point.component1()
  val (x, y) = point
  val sum: Int = point.let { (x, y) -> x + y }

  val demo = ClassDemo().apply {
    value = "changed"
  }

  ClassDemo.akaStaticMethod()
  Singeltone.staticMethod()

}
