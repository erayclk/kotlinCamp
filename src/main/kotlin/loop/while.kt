package org.example.loop

fun main(){
    var number = 0
    while(number < 10){
        println(number++)

    }
    //aslında for if demek
    val tr = arrayOf("tr","use","al")
    tr.forEach {
        println(it)
    }
}