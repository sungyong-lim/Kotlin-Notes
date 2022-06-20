package chap05.session2

/** for **/
/*
    기본 형태 - 상행
        - for(요소 변수 in 컬렉션 혹은 범위) { 반복할 본문 }

    하행 반복 - downTo
        - for(x in 5 downTo 1 ) //5,4,3,2,1

    필요한 단계 증가 - step
        - for(x in 1..5 step 2) // 1, 3, 5

    필요한 단계 하행 - downTo, step 혼합 사용
        - for(x in 5 downTo 1 step 2) //5, 3, 1
* */

fun main() {

    var sum = 0
    var sum2 = 0
    var sum3 = 0

    //기본 형태
    for(x in 1..10) print("$x ")
    println()

    //하행 반복
    for(x in 10 downTo 1) print("$x ")
    println()

    //필요한 단계 증가
    for(x in 1..10 step 2) print("$x ")
    println()

    //필요한 단계 하행
    for(x in 10 downTo 1 step 2) print("$x ")
    println()

    // 범위 안에 수 덧셈
    for(x in 1..10) {
        sum += x
    }
    println(sum)

    // 짝수 덧셈
    for(x in 0..10 step 2) {
        sum2 += x
    }
    println(sum2)

    //홀수 덧셈
    for(x in 1..10 step 2) {
        sum3 += x
    }
    println(sum3)
}