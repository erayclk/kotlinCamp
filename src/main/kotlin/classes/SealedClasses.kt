package org.example.classes

/*
 kısıtlanmış bir sınıf hiearşisini developerin keyfiyetinden çıkarıp
 ide nin kotrlüne vermek
 visibility modifier kullanılabilir
 primary constructer kullanıla bilir
 init ,secondry constucter kullanılabiir
 classları miras alabilirler
 interfaceleri tanımlabilir eğer bodysiz bir fonksiyonu varsa override edilmek zorunda
 nesnesi dirkt olarak üretilemiyor
 consturcteri duafult olarak protected
 İçerisinde hali hazırda subclassları olan bir sealed classı dışarıda bir yetde başka bir classa miras olarak veremiyoruz
 Eğer constuctor i private a çekerseniz bu sayade sub classları bu class scopeu dişinda miras alınmasını engellemiş olursunuz
 Deafult olarak final durumundadır



  */
sealed class Error(val errorCode :Int):Bc {

    class NoInternet : Error(100) {
        override fun sum1(): Int {
            TODO("Not yet implemented")
        }
    }

    class ServerErro(errorCode: Int) : Error(errorCode) {
        override fun sum1(): Int {
            TODO("Not yet implemented")
        }
    }

    class FileIOError(errorCode: Int) : Error(errorCode) {
        override fun sum1(): Int {
            TODO("Not yet implemented")
        }
    }
}
sealed class  c2
class c12 : c2()

interface  Bc {
    fun sum1(): Int
}