package org.example.classes

class InnerClass {

    val name = "Eray"

    inner class InnerClass2 {
        fun innerClass2(){
            //static bir olarak tanımlanır
            println("$name") //dış classın değişkenlerine erişilebilir
        }
    }
}
class Class2 {

    val name = "Eray"

     class Class21 {
        fun innerClass2(){

            //println("$name") dış classın değişkenlerine erişilemez
        }
    }
}