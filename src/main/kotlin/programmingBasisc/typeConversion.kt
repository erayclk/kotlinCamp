package org.example.programmingBasisc

fun main(){
    //Implicit= belirgil olmayan bir şeklide tip dönüşümü - kotlin bunu desteklemez
    //Expliivt = acik bir şeklide tip dönüşümü

    val number = 10.0 // bu get square fonksiyonunda hata vermez çünkü double doubel ama aşşağıdakiler hata verir.
    val number1 = 10
    val number2 = 100L
    //getSquare(number)


    val number3 = '2'
    val number4 = number3.toInt()
    val number5 = number3.code
    val number6 = number3.digitToInt()//int karşılığı için bunu kullan
    println(number4)
    println(number5)
    println(number6)

}

fun getSquare(number :Double): Double{
    return number * number
}