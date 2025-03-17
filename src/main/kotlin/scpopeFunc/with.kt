package org.example.scpopeFunc

fun main(){
    val numbers = mutableListOf<String>("One", "Two", "Three", "Four", "Five", "Six")

    with(numbers){
        val firstItem = first()
        val lastItem = last()
        println("First item: $firstItem, last item: $lastItem")
    }
}