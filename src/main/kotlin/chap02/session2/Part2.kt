package session2

fun main() {
    //변수 사용
    var num: Int = 100
    var str1: String = "string"
    var double1: Double = 1.5
    println("$num, $str1, $double1")

    var num2: Double = 0.1

    for(x in 0..999) {
        num2 += 0.1
    }

    println(num2)

}