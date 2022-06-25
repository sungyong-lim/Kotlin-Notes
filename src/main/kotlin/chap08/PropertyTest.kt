package chap08

class Person(_id: Int, _name: String, _age: Int) { //임시 매개변수(관용적 표현으로 _를 앞에 붙임)
    // 프로퍼티 정의 및 임시 매개변수로 초기화
    var id: Int = _id
    val name: String = _name
    val age: Int = _age
}

// 생성과 동시에 프로퍼티 정의
class Person2(var id: Int, val name: String, val age: Int)

fun main() {
    val person = Person2(1, "Lim",26)

    person.id = 2 // setter 접근 -> setId()
    println(person.name) // getter 접근 -> .getName()
}