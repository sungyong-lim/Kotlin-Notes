package chap08

/** Scope Function **/

// let -> non-null 일 때 동작하고 null 일 때 동작하지 않음
// with -> 컨텍스트 내부에서 함수를 호출
// run -> 객체 초기화와 return 값 계싼이 필요할 때 사용
// apply -> 값을 반환하지 않고, 객체 구성에 대해 주로 사용
// also -> 객체 대해 추가적인 작업

fun main() {

    // let
    val str: String? = "hi"

    val length = str?.let {
        println(it)
        it.length
    }
    println(length)

    var str2: String? = null

    val length2 = str2?.let {
        println(it)
        println("asdasd")
        it.length
    }
    println(length2)

    // with
    val number = mutableListOf("a", "b","c","d")
    println(number.first())
    println(number.last())

    val firstAndLast = with(number) {
        "firstIndex : ${first()}, lastIndex : ${last()}"
    }

    println(firstAndLast)

    // run
    var service = Url("www.google.com", 8080)
    val result1 = service.query(service.prepare() + " to Port ${service.port}")

    println(result1)

    val result2 = service.run {
        port = 8081
        query(prepare() + " to Port $port")
    }

    println(result2)


    // apply
    val tester1 = Persons("Tester1")
    println(tester1)
    tester1.age = 26
    tester1.city = "Seoul"
    println(tester1)

    val tester2 = Persons("Tester2").apply {
        age = 25
        city = "GwangJu"
    }

    println(tester2)

    // also
    // 기본 사용
    val numbers = mutableListOf(1,2,3,4)
    println("$numbers add Five")
    numbers.add(5)
    println(numbers)

    // also 사용
    val numbers2 = mutableListOf(1,2,3,4,5)
    numbers2.also {
        println("$numbers2 add Six")
    }.add(6)

    println(numbers2)

}

// run class
class Url(private val url: String,  var port: Int) {
    fun prepare(): String = "기본 요청 url $url"
    fun query(request: String) = "결과 query $request"
}

// apply data class

data class Persons(var name: String, var age: Int = 0, var city: String = "")