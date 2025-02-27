package org.example.function

fun main() {

    val num1 = 5
    val num2 = 6

    val fun3 = {num1:Int,num2:Int->num1+num2}

    printAndCult(3, 4, { numberOne, numberTwo -> numberOne + numberTwo })
    printAndCult(3, 4, { numberOne, numberTwo -> numberOne - numberTwo })
    printAndCult(3, 4, { numberOne, numberTwo -> numberOne / numberTwo })
    printAndCult(3, 4, ::func)
    printAndCult(3, 9)
    printAndCult()
    printAndCult(fonksiyon = ::func2)
    printAndCult(num1, num2,fun3)
    println("/*/*-9")

    ptrnt(5,98,{num1,num2->"$num1 + $num2 :"})


}
fun ptrnt(num1: Int, num2: Int,func34:String.(num1:Int,num2:Int)->String) {

    val result=func34("",num1,num2)
    println("$result $num1 +$num2 ")
}

inline fun printAndCult(
    numberOne: Int = 5, numberTwo: Int = 5, fonksiyon: (numberOne: Int, numberTwo: Int) -> Int = ::func
) {
    val result = fonksiyon(numberOne, numberTwo)
    println("result = $result")
}/*
fun printAndCult(numberOne : Int ,numberTwo : Int , func:(Int,Int)->Int) {
    val result = func(numberOne,numberTwo)
    println("result = $result")
}
 */

infix fun String.birlestirmek(numberOne: Int) = this +numberOne.toString()
fun func(numberOne: Int, numberTwo: Int): Int = numberOne * numberTwo
fun func2(numberOne: Int, numberTwo: Int): Int = numberOne - numberTwo