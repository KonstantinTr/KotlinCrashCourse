interface Interface {
  val field2: Int // property initializers ane not allowed
  fun method1() = println("doing something else") // default method implementations are allowed
}

abstract class AbstractClass {
  abstract val field1: String
  open fun method1() = println("doing something")
}

open class SolidClass : AbstractClass() {
  override val field1: String = "field1"
}

class OverriddenSolidClass : SolidClass(), Interface {
  override val field2: Int = 1
  override fun method1() = super<Interface>.method1()
}
