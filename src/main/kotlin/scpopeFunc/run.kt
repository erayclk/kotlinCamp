package org.example.scpopeFunc

fun main() {
    //son satirı return eder
    val str = "Hello"
    // this
    str.run {
        println("The string's length: $length")
        println(plus("World"))

        //println("The string's length: ${this.length}") // does the same
    }

    // it
    str.let {
        println("The string's length is ${it.length}")
    }

    val rVal = run {
        println("run")
    }
    println(rVal.toString())
}