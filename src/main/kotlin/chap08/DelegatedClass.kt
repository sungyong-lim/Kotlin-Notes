package chap08

/** 위임(Delegation) **/

interface  Car {
    fun go() : String
}

class VanImpl(var power: String): Car {
    override fun go() = "는 짐을 적재하며 $power 마력을 가짐"
}

class SportImpl(var power: String): Car {
    override fun go() = "는 경주용에 사용되며 $power 마력을 가짐"
}

class CarModel(private val model: String, impl: Car): Car by impl {

    fun carInfo() {
        println("$model ${go()}") // 1. 참조 없이 각 인터페이스 구현 클래스의 go를 접근
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100"))
    val my350z = CarModel("350Z 2008", SportImpl("350"))

    myDamas.carInfo() // 2. carInfo에 대한 다형성을 나타냄
    my350z.carInfo() // 2. carInfo에 대한 다형성을 나타냄
}