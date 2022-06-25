package chap08.p4

data class Person(var name: String, var age: Int)

lateinit var person1 : Person //객체 생성의 지연 초기화

fun main() {
    person1 = Person("Lim", 26)

    println("${person1.name} is ${person1.age}")

}