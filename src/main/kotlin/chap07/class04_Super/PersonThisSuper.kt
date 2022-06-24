package chap07.class04_Super

// 상속 가능한 Person class 정의
open class Person {
    //부생성자 생성
    constructor(firstName: String) {
        println("[Person] firstname: $firstName")
    }

    //부생성자 생성
    constructor(firstName: String, age:Int) {
        println("[Person] firstName: $firstName, $age") //3
    }

}

//Person 클래스를 Developer 클래스가 상속
class Developer: Person {
    constructor(firstName: String): this(firstName,10) { // 1
        println("[Developer] $firstName")
    }

    constructor(firstName: String, age: Int): super(firstName, age) { // 2
        println("[Developer] $firstName, $age")
    }
}

fun main() {
    val scan = Developer("Sean")
}