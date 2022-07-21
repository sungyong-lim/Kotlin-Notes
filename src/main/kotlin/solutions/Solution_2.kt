package solutions

// 문자열의 숫자와 짝수와 홀수를 알려주는 solution

fun main() {
    val result1 = solution("abcd")
    println(result1) // [4, true ]

    val result2 = solution("ABCDE")
    println(result2) //[5, false]
}

private fun solution(str: String) : ArrayList<String> {

    // 내가 푼 방식
    /*
    val length = str.length
    val list = arrayListOf<String>()

    if(length % 2 == 0) {
        list.add((str.length).toString())
        list.add("true")
    } else {
        list.add((str.length).toString())
        list.add("false")
    }


    // 1. 다른 사람이 푼 방식
    val length = str.length
    var isEven = true
    if(length % 2 != 0) {
        isEven = false
    }

    val list = arrayListOf<String>(length.toString(), isEven.toString())

     */

    // 2. 다른 사람이 푼 방식
    val length = str.length
    val isEven = length % 2 == 0

    return arrayListOf(length.toString(), isEven.toString())

}