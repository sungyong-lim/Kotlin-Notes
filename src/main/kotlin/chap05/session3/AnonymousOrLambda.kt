package chap05.session3

/**라벨 사용 예제**/
/**람다식, 익명함수 비교**/

//람다식

val lambdaGetMessage = lambda@ {num: Int ->
    if(num !in 1..100) {
        return@lambda "Error"
    }
    //람다식 내부에서는 return 문을 사용하지 않는다
    // why? 람다식에 마지막 식은 return 형태로 빠져나가기 때문
    "Success"
}

//익명함수
val anonymousGetMessage = fun(num: Int): String {
    if(num !in 1..100) {
        return "Error"
    }
    return "Success"
}

fun main() {

    val result = lambdaGetMessage(1)
    println(result)

    val result2 = anonymousGetMessage(101)
    println(result2)
}

