package org.example.function

fun main(){
    // Fonksiyonlar kotlinde "First Class Citizen"dir
    // yani değişkenlere değer olarak atanabilir.
    // Fonksiyonlar çağırılırken ismi ve oarametleri kullanılır.
    // Fonksiyonların bir geri dönüş tipi varsa değişkene atanabilir.

    // Bir fonksiyonun aynı isimde kalarak parametre sayısı  ve tipi değiştiriletek defafult değerler verilerek fonksiyonu overload etmiş olyuoruz
   println( carpma(3,4))
   println( carpma(3))
    println(carpma(m=4))

    //vararg
    sayHello("Ali", "Ayşe", "Mehmet")
    printNumbers("Sayılar", 10, 20, 30, 40)

}

fun carpma(n: Int=0, m:Int=0) : Int = n*m

fun sayHello(vararg names: String) {
    for (name in names) {
        println("Merhaba, $name!")
    }
}
fun printNumbers(prefix: String, vararg numbers: Int) {
    println("$prefix: " + numbers.joinToString())
}