package chap04.session3

/** 중위 표현법(infix notation) **/

// - 클래스의 멤버 호출 시 사용하는 점(.)을 생략하고 함수 이름 뒤에 소괄호를 생략해 직관적인 이름을 사용할 수 있는 표현법
/* - 중위 함수의 조건
*   - 멤버 페서드 또는 확장 함수여야 한다.
*   - 하나의 매개변수를 가져야 한다.
*   - infix 키워드를 사용하여 정의해야한다.
* */

fun main() {

    val num = 3

    val str = num.strPlus("Kotlin") //일반 표헌법
    val str2 = num strPlus "Kotlin" //중위 표현법
    println(str)
    println(str2)

    val multi = num.multiPly(5) //일반 표헌법
    val multi2 = num multiPly 5 //중위 표현법
    println(multi)
    println(multi2)
}

infix fun Int.strPlus(x: String): String {
    return "$x version $this"

}

infix fun Int.multiPly(x: Int): Int {
    return this * x
}