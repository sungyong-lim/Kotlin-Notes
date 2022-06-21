package chap05.session3

fun main() {
    retFunc()
    retFunc2()
    retFunc3()
    retFunc4()
}

inline  fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}


/**inline 함수와 lambda 사용 시 발생하는 비지역 반환 예시**/
/*  함수 실행 시 1번이 실행되고 inlineLambda 함수가 실행되는데 return문을 만나서 inlineLambda 함수만
     빠져나와야 하는데 비지역 반환을 통해서 retFunc가 빠져나오게 된다. 그래서 3번과 4번은 실행이 되지 않는다
*/
fun retFunc() {
    println("Start of Func") // 1 
    inlineLambda(12, 3) { a, b ->
        val result = a + b
        if(result > 10) return //2 

        println("result: $result") //3
    }

    println("End of Func") //4
} //5 빠져 나감

/** 라벨 사용 **/
/**inline 함수와 lambda 사용 시 발생하는 비지역 반환 해결 예시**/

fun retFunc2() {
    println("Start of Func")
    inlineLambda(1, 5) lit@{x, y ->
        val result = x + y
        if(result > 10) return@lit
        println("result: $result")
    }

    println("End of Func")
}

/** 암묵적 라벨 사용 **/
/**inline 함수와 lambda 사용 시 발생하는 비지역 반환 해결 예시**/
fun retFunc3() {
    println("Start of Func")
    inlineLambda(12,5) {a, b ->
        val result = a + b
        if(result > 10) return@inlineLambda
        println("result: $result")
    }
    println("End of Func")

}

/** 일반 익명함수를 사용**/
// 일반 익명함수를 사용하면 lambda 함수와는 다르게 라벨을 사용하지 않아도 비지역반환이 발생하지 않음
// 단, 일반 익명함수를 많이 사용하면 함수가 무엇을 위해 사용되는지 알아보기 어려움 -> 가독성 떨어짐
fun retFunc4() {
    println("Start of Func")
    inlineLambda(12, 5, fun(a,b) {
        val result = a + b
        if(result > 10) return 
        println("result: $result")
    })
    println("End of Func")

}