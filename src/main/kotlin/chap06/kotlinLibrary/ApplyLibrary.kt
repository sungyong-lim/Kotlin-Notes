package chap06.kotlinLibrary

fun main() {

    data class Person(var name: String, var skills: String)
    var person = Person("Lim", "Android")

    person.apply { this.name = "Swift" } //this는 person 객체를 가르킴
    println("person: $person")

    val returnObj = person.apply{
        this.name = "SY" //this는 생략 가능
        skills = "Kotlin" // this를 생략하고 사용함
    }

    println("returnObj: $returnObj")
    println("person: $person")

}