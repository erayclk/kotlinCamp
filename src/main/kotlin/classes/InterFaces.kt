package org.example.classes

//interface ler constructarı olmaz
//interface lerde abstract fonksiyonlar olur
//interface lerde değişkenler olur
//interface lerde değişkenlerin değerleri set edilebilir
//interface lerde değişkenlerin değerleri set edilmezse default değerleri vardır
//interface lerde object kullanılabilir
//interfacelerde state tutmazlar
/*
Özetle, abstract sınıflar daha çok "şablon" gibidir ve ortak implementasyonlar ve durum sağlayabilirken,
arayüzler daha çok "sözleşme" gibidir ve sınıfların uyması gereken davranış kurallarını tanımlar.
Çoklu kalıtım ihtiyacınız varsa arayüzler tek seçenektir.
 */




interface TextWatcher {
    fun onTextChange(){
        //override zorunluğu kalktı
        //çünkü arka planda static bir fonksiyon oluşturdu
        println("onTextChange")
    }
    fun beforeTextChange()
    fun afterTextChange()
}

fun main(){
    val Inter1 =  object : TextWatcher{
        override fun onTextChange() {
            TODO("Not yet implemented")
        }

        override fun beforeTextChange() {
            TODO("Not yet implemented")
        }

        override fun afterTextChange() {
            TODO("Not yet implemented")
        }
        //object kullanrak Interfecenin nesnesi alınır

    }
}