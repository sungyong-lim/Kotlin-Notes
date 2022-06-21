package chap06.session1

/** Higher-Order Function(고차 함수) **/
/*
    * 개념
        - 함수의 매개변수로 함수를 받거나 함수 자체를 반환할 수 있는 함수
        - 함수안에 인자로 받아들이거나 혹은 RETURN 할때 해당 함수를 반환하는 것
* */

// 고차함수 - 기본 사용
// 람다식(body parameter)은 일종의 익명함수
fun higherOrder(name: String, body: (Int) -> Int): Int {
    println("name: $name")
    val x =  0
    return body(x)
}

// 일반 함수
fun inc(x:Int):Int {
    return x
}

// 일반 매개변수가 없고 람다식이 유일한 인자를 갖는 고차함수
fun highNoArg(body: (Int) -> Int): Int {
    val x = 0
    return body(x)
}

fun main() {

    //다양한 표현법
    // 함수를 이용한 람다식
    val result1 = higherOrder("Lim", {x -> inc(x+3)})
    println(result1)

    // 소괄호 바깥으로 빼내고 생략
    val result2 = higherOrder("Lim") {x -> inc(x +3)}
    println(result2)
    //매개변수 없이 함수의 이름만 사용할 때
    val result3 = higherOrder("Lim", ::inc)
    println(result3)

    //람다식 자체를 넘겨 준 형태
    val result4 = higherOrder("Lim" ) { x -> x + 3 }
    println(result4)

    // 매개변수가 한 개인 경우 생략
    val result5 = higherOrder("Lim") { it + 3 }
    println(result5)

    // 만일 일반 매개변수가 없고 람다식이 유일한 인자라면 표현 가능
    val result6 = highNoArg { it + 3 }
    println(result6)
}