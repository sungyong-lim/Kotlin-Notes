package session3

fun main() {
    var num = 256

    if(num is Int) { // num이 Int형 일때 만족
        println(num)
    } else if(num !is Int) { //num이 Int형이 아닐때 만족 === !(num is Int)와 동일
        println("Not num Int")
    }
}