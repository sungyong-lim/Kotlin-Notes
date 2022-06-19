package chap03.session1

fun normalVarargs(vararg a: Int){
    for(num in a) {
        print("$num ")
    }
}

// 평균구하기
fun avgFunc(inital: Float = 0f, vararg numbers: Float): Double {
    var result = 0f
    for(num in numbers) {
        result += num
    }

    println("result: $result, numbers.size: ${numbers.size}")

    val avg = result / numbers.size
    return avg.toDouble()

}
fun main() {
    normalVarargs(1)
    println()
    normalVarargs(1,2,3,4)

//    평균 함수 호출
    val result = avgFunc(5f, 100f,90f,80f)
    println("avg result: $result")

}


