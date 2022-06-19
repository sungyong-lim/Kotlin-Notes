package chap04.session2

fun callByName(b: () -> Boolean):Boolean {
    println("callByName Func")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda Func")
    true
}

fun main() {
    val result = callByName(otherLambda)

    println(result)
}