package chap06.kotlinLibrary

import kotlin.random.Random
import kotlin.system.measureTimeMillis

fun main() {
    val input = "Kotlin"
    val keyword = "in"

    // 입력 문자열에 키워드가 있으면 인덱스를 반환하는 함수를 takeIf를 사용해서 구현
    // indexOf는 해당 keyword가 존재하면 해당 keyword의 인덱스 번호를 출력
    val result = input.indexOf(keyword).takeIf { it >= 0 } ?: error("keyword not found")
    println(result)

    //takeUnless를 사용하여 구현
    val result2 = input.indexOf(keyword).takeUnless { it < 0 } ?: error("keyword not found")
    println(result2)


    // 난수 생성
    val num = Random.nextInt(10)//0 ~ 10 사이에 난수 생성
    println(num)

}