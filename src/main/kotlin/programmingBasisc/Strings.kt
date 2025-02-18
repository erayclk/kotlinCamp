package org.example.programmingBasisc

fun main() {
    //Yaklaşık olarak her karakter 2 byte yer kaplar.
    //primitive tiplerdir stack(gösterdiği pointer) ve heapde(veri) saklanıt

    val awesomeKeKod = "KeKod is Awesome"
    val firstCharOfAwesomeKekod = awesomeKeKod[awesomeKeKod.indices.first]
    val firstCharOfAwesomeKekod2 = awesomeKeKod[1] // e
    val lastCharOfAwesomeKekod = awesomeKeKod[awesomeKeKod.indices.last]
    val lastCharOfAwesomeKekod2 = awesomeKeKod[15] // 16 değil 16 dersek index out of range exception hatasını verir.

//hem var da hem val da immutablelerdir ama heapdeki veri var ile değiştirilebilir
//    val name = "Eray"
//    name = "EMRE" Hata verir

    var name = "Eray"
    name = "Erayasdasdalksdaasdasd" // hata vermez ama işaret ettiği alan değşti garbage collector ilk name siler

    val numbersValue: String = "value" + (4 + 2 + 1) // value7
    //val numbersValue2: String =  (4 + 2 + 1) +"value" // hata verir işlem stringden sonra olmalı


    /*

    otlin'deki String veri tipi primitive (ilkel) veri tipi değildir. Kotlin'de String, bir referans tipidir ve Java'daki String sınıfına karşılık gelir.

    Primitive ve Referans Tipleri
    Primitive Tipler: Bellekte doğrudan bir değer olarak saklanır (Int, Double, Boolean vb.).
    Referans Tipler: Bellekte bir nesne olarak saklanır ve referansları tutulur (String, List, Set, Map vb.).
    Kotlin'de String Neden Primitive Değil?
String, java.lang.String sınıfına dayanır.
String nesneleri değişmezdir (immutable), yani oluşturulduktan sonra değiştirilemez.
String bir nesne olduğu için metodlar (length, substring, replace vb.) içerir.
Primitive tipler JVM seviyesinde daha verimli çalışırken, String bir nesne olduğu için Heap bellekte saklanır ve Garbage Collector tarafından yönetilir.
Primitive Tipler Kotlin'de Otomatik Kutulanabilir (Boxing)
Kotlin, bazı primitive tipleri otomatik olarak referans tipine çevirebilir (boxing/unboxing). Ancak String zaten baştan itibaren bir nesne olduğu için bu durumdan etkilenmez.

Eğer performans açısından primitive benzeri bir kullanım istersen, CharArray kullanabilirsin:

     */

    /**
     * Kotlin'de String.format() methodu, Javadaki format methodunu kullanır.
     * Bu method, belirli bir String içinde yer tutucuları belirtilen değerlerle değiştirerek yeni
     * bir String oluşturmamıza olanak tanır.
     *
     *
     * %s : String
     * %d Integer için
     * %f Float/Double
     * %n Yeni bir satıra geçmek iöin
     */

    val charArray = charArrayOf('H', 'e', 'l', 'l', 'o')
    val stringFromArray = String(charArray) // String nesnesine dönüşür

    val yas =23
    val mesaj = String.format("Yaşım : %d",yas)
    println(mesaj)

    val boy =1.70789
    val boyMesaj = String.format("Boyum: %.2f metre  ",boy)
    println(boyMesaj)

    val ad ="Eray"
    val kisiBilgisi = String.format("Adım : %s , Yaşım %d , boyum : %.2f",ad,yas,boy)
    println(kisiBilgisi)

}