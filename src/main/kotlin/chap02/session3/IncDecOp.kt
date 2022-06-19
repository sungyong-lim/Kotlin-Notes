package session3

fun main() {
    var a: Int = 10
    var b: Int = 10

    var result1:Int = ++a
    var result2:Int = b++

    println("result1: $result1") //11
    println("result2: $result2") //10
    println("a: $a") //11
    println("b: $b") //11

    //논리 연산자
    var num1 = 5
    var num2 = 2
    var num3  = 3

    var check: Boolean = (num1 > num2) && (num1 > num3)

    println("AND logical operator: $check")

    var check2 = (num1 > num2) || (num2 > num3)

    println("OR logical operator: $check2")

    var check3 = !(num1 > num2)

    println("not logical operator: $check3")

}