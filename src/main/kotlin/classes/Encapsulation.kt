package org.example.classes

class Encapsulation {
    /*Encapsulation değişkenleri üye elemanları private tut değişkenleri hangi seviyede dışarı açmak
    ona göre metotlar belirle.
    -Karışıkliği engellemek için kullanılır.
     */
    private var name: String = "Eray"
    private var surName: String = "Celik"

    /*
    fun getName(): String {
        return name
    }
    */


    /*
    fun setName(name: String) {
        this.name = name
    }

     */
}

fun main(args: Array<String>) {
    val encapsulation = Encapsulation()
}