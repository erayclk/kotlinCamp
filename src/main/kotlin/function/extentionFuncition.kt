package org.example.function


infix fun Int.carp(sayi: Int): Int {
    return this * sayi
}

fun List<Int>.toplam(): Int {
    return this.sum()
}

infix fun String.Birlestir(str1 : String ) = this +str1

fun main() {
    //üzerine değişikliy yapmak istemediğimiz classlara ekstara özelliklek eklemek için kullanılır
    val sonuc = 4 carp 3  // Normalde: 4.carp(3)
    println(sonuc)  // Çıktı: 12

    val sayilar = listOf(1, 2, 3, 4, 5)
    println(sayilar.toplam())  // Çıktı: 15

    val adSoyad = "erat".Birlestir("çelik")
    println(adSoyad)
}
