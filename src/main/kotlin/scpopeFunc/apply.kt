package org.example.scpopeFunc

data class Person1(var name: String, var age: Int = 0, var city: String = "")

fun main() {
    //return ü verdiğin parametredir son satırı değil
    //işlemler değişkeni etkiler
    val adam = Person1("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam)
}