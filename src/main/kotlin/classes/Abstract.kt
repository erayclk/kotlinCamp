package org.example.classes

//abstract anahtar kelimesiyle işaretlenir. Direkt olarak örneklenemez (nesne oluşturulamaz)
//Şablon oluşturmak için kullanılır
// ortak kod paylaşımı için kullanılır.
abstract class Human(val surName:String) {
    abstract val name:String
    val gender:String ="erkek" //state tutuğunu gösterir
    open val age :Int =24 //overide edilebilir
    fun b(){

    }
    open fun a(){
        println("u ru in abstarct")
    }
    abstract fun c()


}
abstract class middleEast() : Human("Çelik"){


}

class Turk(override val name:String) :Human("Çelik"){
    //override val name:String ="Eray"

    override fun c() {
        println("$name TURKKKK")
    }
    override fun a() {
        println("now u re in Class turk")
    }
}

fun main(args: Array<String>) {

    val human = Turk("Eray")
    human.a()
}