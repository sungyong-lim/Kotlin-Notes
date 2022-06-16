package session3

fun main() {
    val a: Int = 128
    val b = a

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c == d)
    println(c === d)
    println(c === e)


    //자료형 검사 "is 키워드"

    var num = 555 //Int형 추론

    if(num is Int) { // num이 Int이면  실행
        println(num)
    } else if(num !is Int) { // num이 Int가 아니면 싷행
        println("Not a Int")
    }
}