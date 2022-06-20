package chap04.session3

/** 재귀(recursion) **/
/*
    - 자기 자신을 다시 참조
    - 재귀 함수는 자기 자신을 계속 호출하는 특징
    - 재귀 함수의 필수 조건
        - 무한 호출에 빠지지 않도록 탈출 조건을 만들어 둔다.
        - 스택 영역을 이용하므로 호출 횟수를 무리하게 많이 지정해 연산하지 않는다.
        - 코드를 복잡하지 않게 한다.
* */

/** 꼬리 재귀 함수(tail recursive function) **/
/*
    - 재귀는 스택을 이용하기 때문에 무한히 들어갈수 없는 단점을 해결하기 위해 사용
    - 스택에 계속 쌓이는 방식이 함수가 계속 씌워지는 꼬리를 무는 형태
    - tailrec 키워드를 사용해 선언
* */

// recursive func
fun factorial(x: Int): Long {
    return if(x == 1) x.toLong() else x * factorial(x - 1)
}

// tail recursive func
tailrec fun tailFactorial(x: Int, run: Int=1): Long {
    return if(x == 1) run.toLong() else tailFactorial(x - 1, run * x)
}

fun main() {

    val num = 4

    // 재귀 함수를 사용한 factorial
    val result: Long = factorial(num)
    println(result)

    //꼬리 재귀 함수를 사용한 factorial
    val result2: Long = tailFactorial(num)
    println(result2)
}