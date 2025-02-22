package org.example.controlFlow

fun main(){
    print("öğrenci isen y'ye bas:")
    val str = readLine()!!

    val ogrenci = if (str =="y") "öğrenci"
    else "değil"

    println(ogrenci)
    val not = 45

    if (not >= 90 && not <= 100) {
        println("not: A")
    } else if (not >= 80 && not < 90) {
        println("not: B")
    } else if (not >= 70 && not < 80) {
        println("not: C")
    } else if (not >= 60 && not < 70) {
        println("not: D")
    } else {
        println("not: F")
    }

    print("ülke kodu:")
    val country  = readLine()

    when (country) {
        "tr","az" -> println("türkiye")
        "al" -> println("alman")
        else -> println("not: $country")
    }

}