package chap08.p3

/** 지연 초기화 -> lateinit **/

class Person {
//    lateinit val name: String -> val은 불가
    lateinit var name: String // 1. 늦은 초기화를 위한 선언

    fun test() {
        // isInitialized 메서드 -> 프로퍼티의 초기화 여부를 판단하는 메서드
        if(!::name.isInitialized) { // 2. 프로퍼티의 초기화 여부 판단 -> 초기화가 되지 않았으면 실행
            println("Not Initialized")
        } else {
            println("Initialized")
        }
    }
}

fun main() {
    var person = Person()
    //println(person.name) //  kotlin.UninitializedPropertyAccessException 에러 발생 -> 초기화 전에는 접근할 수 없다
    person.test()

    person.name = "Lim" // 3. 이 시점에서 초기화됨 (자연초기화)
    person.test()

    println("person.name: ${person.name}")
}