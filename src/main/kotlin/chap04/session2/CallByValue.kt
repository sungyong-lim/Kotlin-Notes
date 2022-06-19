package chap04.session2

fun callByValue(b: Boolean): Boolean {
    println("CallByValue Func")
    return b
}

val lambda: () -> Boolean = {
    println("Lambda Func")
    true
}


fun main() {
    val result = callByValue(lambda())

    println(result)
}