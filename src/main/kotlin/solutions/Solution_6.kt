package solutions

// factorial

fun main() {

    val result1 = solution(3)
    println(result1) // 6

    val result2 = solution(4)
    println(result2) // 24

    val result3 = solution(5)
    println(result3) // 120
}

private fun solution(num: Int) : Int {

    // 내가 푼 방식 1
    /*
    var factorial = 1

    for(i in num downTo 1) {
        factorial *= i
        println("$i * $factorial = ${i * factorial}")
    }

    return factorial
     */

    var factorial = 1

    for(i in 1..num) {
        factorial *= i
    }

    return factorial



}