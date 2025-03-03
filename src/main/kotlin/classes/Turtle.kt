package org.example.classes

public class Turtle (val name : String="Unnamet",mFeetCount :Int=0,age:Int=10) {

    /*
    Kotlin'de değişkenler arka planda aslında fonksiyon gibi davranırlar. Hafızadaki değeri yani backing field, her zaman private'tır.
    Onlara eriştiğimiz getter ve setter fonksiyonları public olabilir.
    Kotlin'de encapsulation yapmıyormuş gibi gözükse de aslında Java'nın aksine encapsulation'ı değiştirmemize izin bile verilmez.
     */
    /*
    Aslında arka planda zaten fieldlar private olarak tutuluyor ona erişecek
    fonksiyonlar yani get ve set'le biz iş yapıyoruz.Private yapınca sadece
    arka planda set yazılmamış oluyor.

    internal modül içinnde erişime izin verir modul dışında erişilemez yapar


     */

    private var feetCount: Int = 4 // private yaptığımızda buna aslında buna erişen get set fonk private yapıyoruz
    internal val feetColor: String = "Brown"
    val heatCount: Int = 1
    val heetColor: String = "Brown"
    val age: Int = 4

    val sex: String = "female"

    init{

        //name = mName
        feetCount = mFeetCount
        println("init")
    }
    //secondary constructer
    constructor(mName : String="Unnamet",mFeetCount :Int=0,sex :String):this(mName,mFeetCount){

    }

    fun makeASound():String{
        //değişkenkelre val ya da var yazmak gerekiyor
        println(name)
        println(feetCount)
        return "asdasdasda"
    }

    fun walk(){

    }
    fun eatMeal(){

    }
}

fun main(args: Array<String>) {
    val turtle1:Turtle = Turtle("Eray",age=11)

    println(turtle1.age)
}