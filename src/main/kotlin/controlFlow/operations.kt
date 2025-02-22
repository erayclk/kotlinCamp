package org.example.controlFlow

fun main() {
    var number1 = 10
    println(number1) //10
    println(number1++) //10
    println(number1) //11
    println(++number1) //12


    val number2: Int? = 10
    var number3: Int? = 10
    //sayılar nullable ise compareto kullanılır < >  hata verir
    // Nullable değerleri güvenli bir şekilde karşılaştırma
    println((number2?.compareTo(number3 ?: 0) ?: 0 < 0))   // false
    println((number2?.compareTo(number3 ?: 0) ?: 0 > 0))   // false
    println((number2?.compareTo(number3 ?: 0) ?: 0 == 0))  // true

}