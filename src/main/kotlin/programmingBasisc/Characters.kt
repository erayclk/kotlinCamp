package org.example.programmingBasisc

fun main(){
    //16 bit alan kaplar

    println('H'.toInt()) //72 yazar hexcode karşışığı
    println('H'.code) //72 yazar hexcode karşışığı

    val number = '1'
    println(number.digitToInt())

    // Escape karakterlerini tanımlamak için de kullanılır. Char tipi.
    // \n \t \\b
    // Unicode
    val blackHeart = '\u2665'
    val heavyBlackHeart = '\u2764'

    val ANSI_RED = "\u001B[31m"
    // ANSI Renk sıfırlama kodu (Metni varsayılan rengine döndürür.)
    val ANSI_RESET = "\u001B[0m"

    println("First commit with $ANSI_RED$blackHeart$ANSI_RESET")
}