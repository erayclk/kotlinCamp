package org.example.classes

open class Animal(open val bla: String) {

    val name: String = ""
    val age: Int = 0
    val type: String = ""

    open fun makeAsound(): String {
        return "sesss"
    }

}

class dog(override val bla: String = "er") : Animal(bla) {

    override fun makeAsound(): String {
        return "hav hav hav"
    }

}

class cat(override val bla: String = "er") : Animal(bla) {

    override fun makeAsound(): String {
        return "meaw"
    }

}

open class UstCLass(str1: String){
    open fun denmeme(){
        println("UstCLass denmeme")
    }
}
class altClass:UstCLass{
    open override fun denmeme(){
        println("altClass denmeme")
    }
    constructor(string:String):super(string){

    }
}

class area(val num1 : Int, val num2 : Int){
    val alan
    get() = num1 * num2
}

fun main() {
    val dog = dog()
    println(dog.makeAsound())
    val cat = cat()
    println(cat.makeAsound())
    println(area(9,9).alan)
}

/*

Visibility Modifiers
Visibility modifierlar Kotlin'de fonksiyonların, sınıfların veya değişkenlerin
 hangi seviyede dışarıdan ulaşılabilir olup olmayacağını belirlemek için kullanılır.
 4 adet modifier vardır. Bunlar;

public: Kotlin'de bütün fonksiyonlar, sınıflar ve değişkenkler varsayılan olan public durumundadır.
private: Üye değişkenlerin class dışarısından erişilmesini engeller, sadece sınıf içerisinden
erişilebilir durumda olur.
protected: Üye değişkenler sadece kalıtım(inheritance) edilen child sınıflar içerisinden
erişilebilir durumda olur aksi durumlarda o üye değişkenlere erişemeyiz.
internal: Sadece kullanılan modül içerisinden erişilebilir başka bir modül içerisinden erişim sağlayamayız.

Accessibility Modifier
final: final belirleyicisi, bir sınıfın veya üyenin başka bir sınıf tarafından kalıtım(miras) alınmasını engeller.
 Aynı zamanda yazılan fonksiyonların ve değişkenlerin alt sınfılardan override edilmesini engeller.
 Kotlin'de varsayılan olarak bütün yapılar final olarak belirtilmiştir.

open: open belirleyicisi, bir sınıfın başka bir sınıf tarafından kalıtım(miras) alınabilmesini sağlar.
Aynı zamanda yazılan fonksiyonların ve değişkenlerin de alt sınıflardan override edilebilmesini sağlar.
 */