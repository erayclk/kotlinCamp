package org.example.loop

fun main()
{
    for(value in 1..10){
        println(value)
    }
    val country = arrayOf("a","b","c","d","e","f","g","h")
    for (country in country) {
        println(country)
    }

    for (index in country.indices){
        println(country[index])
    }

    //Destructuring declarations yapı deniyor
    for((index,value) in country.withIndex()){
        println("$index : $value")
    }

    repeat(10){
        println(it)
    }

    firstFor@ for (value in 1..15){
        for (index in 1..10){
            println(value)

        }
    }
}