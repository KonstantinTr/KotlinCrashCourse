@file:JvmName("JavaDemo")

package my.demo.java

import AutocloseableDemo
import JavaGetterDemo

fun main(vararg args: String) {

  args.forEach { arg ->
    println("Hello, $arg!")
  }

  val getterDemo = JavaGetterDemo()
  getterDemo.value
  getterDemo.value = 1

  AutocloseableDemo().use {
    println("doing something with $it")
  } // calls to .close for you

}