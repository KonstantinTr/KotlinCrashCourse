fun functions() {

  fun addOne(x: Int): Int {
    return x + 1
  }

  fun addTwo(x: Int) = x + 2


  fun addThree(first: Int, second: Int = 0, third: Int = 0): Int {
    return first + second + third
  }

  fun addAll(first: Int, vararg other: Int): Int {
    return first + other.sum()
  }

  addOne(1)
  addTwo(x = 1)
  addThree(1, third = 3)
  addAll(1, 2, 3)

  val args = intArrayOf(2,3)
  addAll(1, other = args)
  addAll(1, *args)

}

fun lambdas() {

  val anonymousFun = fun(a: Int): Int { return a + 1 }
  val lambda1: (Int) -> Int = { a -> a + 1 }
  val lambda2 = { a: Int -> a + 1 }

  val a = 1
  fun wrapperFun(arg: Int, foo: (Int) -> Int): Int {
    return foo(lambda2(lambda1(arg + a)))
  }

  wrapperFun(2, anonymousFun) // callable is a variable
  wrapperFun(2, Int::countLeadingZeroBits) // callable belongs to class/object
  wrapperFun(2, fun(x: Int): Int { return x + 4 })
  wrapperFun(2) { x -> x + 4 } // lambda can be taken out of parentheses
  wrapperFun(2) { it + 4 } // if arg is not named it receives a staticField "it"
  wrapperFun(2) {
    println("do some random stuff")
    anonymousFun(it) // lambda returns the value of the last expression
  }

}
