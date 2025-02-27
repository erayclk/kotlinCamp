package org.example.programmingBasisc

fun main() {
    //Array aynı türden sırali sabir boyutlu bir koleksiyondur
    val sNubmer = arrayOf(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val sNames = arrayOf("Eray", "Ahmet", "Mehmet")
    sNames[0] = "erasdad"

    for (index in sNames.indices) {
        println(sNames[index])
    }

    val mixedArray = arrayOf<Any>(13, "eray", 'V', true)
    val intArray = arrayOf<Int>(13, 10, 9, 8)
    val squares = Array(5){index ->index * index}

    //size : Arrrayin eleman sayısı verir
    //indices : Arrayin index aralığını verir sNumber.indices-== 0..2

    println(sNames.indices)

    val arrayOfNulls = arrayOfNulls<String>(4)
    println(arrayOfNulls.joinToString())
    //null, null, null, null

    val emptyArray = emptyArray<String>()
    //emptyArray[5]="RT" hata verir

    var citiesArray = arrayOf("İstanbul", "Hatay", "Kars")
    citiesArray += "Sivas"
    println(citiesArray.joinToString())


    val cName = Array<Double>(5) { 3.14 * it }
//    cName.forEach {
//        println(it)
//    }


    val chatArray = CharArray(5)
    chatArray[0] = '3'
    chatArray[1] = '3'
    chatArray[2] = '3'
    chatArray[3] = '3'
    chatArray[4] = '3'
    //chatArray[5]='3' hata verir


    chatArray.forEach { println(it) }

    // Çok Boyutlu Diziler Oluşturma (Multi Dimensional Array)

    val twoDArray = Array(2) { Array(2) { 0 } }
    println("TwoD Array: ${twoDArray.contentDeepToString()}")  // [[0,0], [0,0]]

    val threeDArray = Array(2) { Array(2) { Array(2) { 0 } } }
    println("ThreeD Array: ${threeDArray.contentDeepToString()}")
    // [[[0, 0], [0, 0]], [[0, 0], [0, 0]


    //arraysler == ile kontro edlilmez

    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(1, 2, 3)

    //array1 == array2 => false

    val array3 = array1
    val array4 = array1
    //array3 == array4 true

    //tek boyutlu arrayde eşit mi bakamk için
    println(array1.contentEquals(array2))

    //çok boyutlu arrayde eşit mi bakamk için
    val array5 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
    val array6 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))

    println(array5.contentDeepEquals(array6))

    //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/ array özellikleri
}