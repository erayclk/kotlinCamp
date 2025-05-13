package org.example.scpopeFunc

data class User(val name: String, val age: Int)

fun main() {
    //işlemler değişkeni etkiler
    //data class larda kullanılır
    val numbers = mutableListOf("one", "two", "three")

    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    val user1 = User("Adam", 32).also { println("The user name is $it") }
}