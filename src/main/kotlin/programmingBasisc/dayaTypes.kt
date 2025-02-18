//

fun main() {/*salt kod için var kullanmak daha performaslı
   multithread içiren bir kodlar için val daha performaslı val readonly bir değişkendir muteable değildi
   */

    /*
    Type Inference (Tip Çıkarımı) Nedir ?

    - Eşitliğin karşı tarafındaki değere bakarak, değişkenin tipinin ne olacağını IDE'nin karar vermesi.
    - Bir değişkene değer atadığımızda o verinin hangi türde olacağını tam olarak belirtmediysek IDE'nin o verinin
    hangi türde olacağını bilmesidir.
    */

    val amongIntValue = 900334 // Int
    val higherInt = 1_000_0000_000 // Long

    // Burada biraz daha anlamlı olabilecek bir örnek üzerinden bakalım
    val number: Short = 40
    val number2: Short = 50

//    val totalNumber = number + number2
//    println(totalNumber)

    //primitives tipler class lara göre daha hızlı çalışır
    // kotlinde her şey bir nesnedir
    val age: Int = 23
    val isMale: Boolean = true
    //çalışma zamanında primitives haline döndürülüler

    //nullable ve null
    val name :String?= "Eray"
    //name.lowercase() bu hata verir  ya ? yada !! kullanmak gerekir
    //.? buna bir değer atanmışsa devamını çalıştır atanmamışsa çalıştırma if name != null ise gibi /
    //!! zorla çalıştır herhalukarda çalıştır //çok kritik yerlerde bu kullanılır mesela banka uygulamsaı bakiye bilgisi

    var num1:Int? = null
    //artık değişken primitev değil class sınıfdan alır
    num1 =num1?.plus(5)
    println("num1 :$num1")


    val temp2 = null // bu bir özel bir tip olan Nothinge atar


    //Boxed: Değişkenin obje referansı olarak tutulmasıdır.
    //UnBoxed: Değişkenin primitive olarak tutulmasıdır.

    //    == operatörü değişkenlerin değerine(value) göre bir karşılaştırma yaparken;
    //    === operatörü iki nesnenin aynı bellek konumunu referans edip etmediğini kontrol eder.

    // Byte aralığı içerisinde

    val boxedNumber: Int? = 127
    val anotherBoxedNumber: Int? = 127
    println(boxedNumber === anotherBoxedNumber) // true

    val number21: Int = 129 // Byte aralığı içerisinde değil.
    val boxedNumber2: Int? = number21
    val anotherBoxedNumber2: Int? = number21
    println(boxedNumber2 === anotherBoxedNumber2) // false


    //

}

class box {

    //val is readonly not immutable
    // val set edebilitiz ama immutaleyi hiç bit şekilde değiştire
    var width = 10
    var height = 10
    var length = 110

    val avaliableSpace: Int
        get() {
            return width * height*length
        }

    //var değişkeni val yapma
    var name = "Eray"
        private  set

}