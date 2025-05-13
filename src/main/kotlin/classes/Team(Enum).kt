package org.example.classes
/*
gruplana bilir veri için kullanılır
arka planda enumsabitleri static class olarak saklanırlar ve üzerindejş enum classınıda miras alırlar

visbility modifilerler kullanıla bilir
primary constructor tanımlanabilir
init block kullanılabilir
enum classlar başka classları miras alamazlar başka enum classlarıda miras alamazlar
ama interfaceler implemente edilebiir
nesne üretemez

içersine fun tanımlanamaz ama abstracr fun tanımlanabilir bu fonk override etmek gerekir.
open fonk tanımlanabilir bu durumda enum sabitlerini overite etmeye gerek yok

 */
enum class Operation {
    ADD {
        override fun apply(a: Int, b: Int) = a + b
    },
    SUBTRACT {
        override fun apply(a: Int, b: Int) = a - b
    };
    abstract fun apply(a: Int, b: Int): Int
}
enum class Team(val dayIndex:Int) {
    MONDAY(0) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    }, TUESDAY(1) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    }, WEDNESDAY(2) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    }, THURSDAY(3) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    }, FRIDAY(4) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    }, SATURDAY(5) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    }, SUNDAY(6) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    };

    abstract fun boo()
}

fun main(){
    println(Team.valueOf("MONDAY").dayIndex)
    println(Team.SUNDAY.ordinal)//sırasını verir
    println(Team.entries)
}