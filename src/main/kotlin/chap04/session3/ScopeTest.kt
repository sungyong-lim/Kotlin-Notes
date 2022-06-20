package chap04.session3

/** 전역변수 **/
/*
    - 최상위에 있는 변수로 프로그램이 실행되는 동안 삭제되지 않고 메모리에 유지
    - 여러 요소가 동시에 접근하는 경우에 잘못된 동작을 유발할 수 있음
    - 자주 사용되지 않는 전역 변수는 메모리 자원 낭비
* */

/** 지역변수 **/
/*
    - 특정 코드 블록 내에서만 사용
    - 블록 시작 시 임시로 사용되며 주로 스택 메모리를 사용
* */
var global = 10

fun main() {
    fun localFunc1() {
        println("localFunc1")
    }

    localFunc1()

    global = 15

    val local1 = 15

    println("global: $global") // 15
    userFunc()
    println("final - global: $global, local1: $local1") // 20 15
}

fun userFunc() {
    global = 20
    val local1 = 20
    println("userFunc - global: $global, local1: $local1") // 20 20
}