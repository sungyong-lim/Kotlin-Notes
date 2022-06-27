package chap08

/** Object 선언과 Companion Object **/
/*
    - object 선언 방식은 접근 시점에 객체가 생성
    - 그렇기 때문에 생성자 호출을 하지 않으므로 object 선언에는 주/부 생성자를 사용할 수 없음
* */

// objecy 키워드를 사용한 방식
object OCustomer {
    var name = "Lim"
    fun greeting() = println("Greeting ...")
    val HOBBY = Hobby("Son")
    init {
        println("init....")
    }
}

class Hobby(var name: String)

fun main() {
    OCustomer.greeting() // 객체의 접근 시점
    OCustomer.name = "Messi"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)
}