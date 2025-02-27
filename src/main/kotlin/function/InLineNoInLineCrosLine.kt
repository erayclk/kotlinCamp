package org.example.function

fun main(){
    //lambad fonksiyon kullanımı

    val result1:String = square(5)
    println(result1)

    //higher order func
    higherOrderFunctiton {
        println("lamdadayız")
    }

    /*Inline
    fonksiyonun içeriğini derleme zamanında çağrıldığı yere kopyalar.
     Lambda çağrılarında ek maliyeti azaltır, performansı artırır.
     JVM seviyesinde fonksiyon çağrısının getirdiği stack overhead’ini (çağrı yükünü) ortadan kaldırır.

     fonksiyon boydsi büyükse kullanılmaz
    */
    runAndPrint({message -> println(message)},
        { println(it) })


// Kullanım
    val result = calculate(5, 3) { x, y -> x + y } // Bytecode'da doğrudan x + y'ye dönüşür.

}
inline fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
inline fun runAndPrint(run:(String) -> Unit,noinline logger:(String) -> Unit) {
    log(logger)
    run("test")
    logger("End")
}

fun log(logger:(String)->Unit){
    logger("Start")
}

val square : (Int) ->String ={"$it * $it : ${it*it}"}

fun higherOrderFunctiton(lamda:()->Unit){
    println("higher started")
    lamda()
    println("Higher finshed")
}