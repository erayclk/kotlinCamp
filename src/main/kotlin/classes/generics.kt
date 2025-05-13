package org.example.classes

//generics tipini bilmedğimiz herhangi bir değişkeni beklendiğimz durumlarda kullandığımız yapılar
//çeşitli kısıtlar için declaration site variancelar kullanacaz
//any ile type safe liği sağlayamıyoruz
//invariat parametreye ne veriyorsak atadığmız değişkenini tipi de aynı olmak zorunda
fun main() {
    val num = HomeFragment()
    num.printParam(3, 4)
    val g1 = DashboradFragment()
    g1.printParam(3.0, 4.4)

    val box1: box<Int> = box<Int>(1)

    println("*")
    println(swap("eray", "çelik"))

    val dog = Dog("it")
    pritname(dog)

    val dogProducer : Producer1<Dog2> = DogProducer1()
    val animalProducer: Producer1<Animal2> = dogProducer

    val animalConsumer:Consumer1<Animal2> = AnimalConsumer()
    val dogConsumer : Consumer1<Dog2> = animalConsumer
    dogConsumer.consume(Dog2())

}

class box<T>(t: T) {
    var value = t
    fun <L> foo(l: L) {

    }
}

abstract class BaseFragment {
    fun <T> printParam(param1: T, param2: T) {
        println(param1.toString() + param2.toString())
    }
}

class HomeFragment : BaseFragment() {
    fun call() {
        printParam<Int>(5, 6)
    }
}

class DashboradFragment : BaseFragment() {
    fun call() {
        printParam<Double>(1.0, 2.5)
    }
}


interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>) {
    val objects: Source<Any> = strs
}

fun <T> swap(a: T, b: T): Pair<T, T> {
    return Pair(b, a)
}

open class Animal1(val name: String)
class Dog(name: String) : Animal1(name)
class Cat(name: String) : Animal1(name)

fun <T : Animal1> pritname(animal: T) {
    println()
}

open class Animal2
class Dog2 : Animal2()
class Cat2 : Animal2()

//Kovaryant Üretici Sınıf kenisi ya da alt sınıfın referansını tutabilir
interface Producer1<out T> {
    fun produce1(): T
}

class DogProducer1 : Producer1<Dog2> {
    override fun produce1(): Dog2 = Dog2()
}

class CatProducer1 : Producer1<Cat2> {
    override fun produce1(): Cat2 = Cat2()
}

interface Consumer1<in T>{
    fun consume(item: T)
}

class AnimalConsumer: Consumer1<Animal2>{
    override fun consume(item: Animal2) {
        println("Tüketilen hayvaan ${item::class.simpleName}")
    }
}
