package org.example.function

infix fun MutableList<String>.addElement(item: String) {
    this.add(item)
}
class Matematik {
    infix fun topla(sayi: Int): Int {
        return sayi + 10
    }

    fun normalTopla(sayi: Int): Int {
        return sayi + 10
    }
}

fun main() {

    /*
    Tek parametre alması gerekir.
    Bir sınıfın veya genişletme fonksiyonunun üyesi olması gerekir.
    infix anahtar kelimesi ile tanımlanması gerekir.
     */

    val liste = mutableListOf("Elma", "Armut")
    liste addElement "Muz"  // Normalde: liste.addElement("Muz")

    println(liste)  // Çıktı: [Elma, Armut, Muz]

    val matematik = Matematik()

    val infixSonuc = matematik topla 5 // infix kullanımı
    val normalSonuc = matematik.normalTopla(5) // normal fonksiyon
}
