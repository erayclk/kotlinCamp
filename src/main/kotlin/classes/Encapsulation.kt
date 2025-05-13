package org.example.classes

open class Encapsulation {
    /*Encapsulation değişkenleri üye elemanları private tut değişkenleri hangi seviyede dışarı açmak
    ona göre metotlar belirle.
    -Karışıkliği engellemek için kullanılır.

    static polimorfizm fonksiyonların aşırı yüklenmesine denir
    dinamik polimorfizm ise classları childlarında ata classın daki ortak fonsksiyonların overloading ile yapılması ile olur



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

    open fun sayHi(){
        println("$name $surName")
    }

}

class chlid1():Encapsulation(){
    override fun sayHi(){
        println("hello from child 1")
    }

}
class chlid2():Encapsulation(){
    override fun sayHi(){
        println("hello from child 2")
    }

}


fun main(args: Array<String>) {
    val encapsulation = Encapsulation()

    val bla = listOf(chlid1(), chlid2(), Encapsulation())
    for (i in bla){
        i.sayHi()
    }
}