package chap05.session1


fun main() {
    var a = 17
    val b = 10

    var max = if(a > b) {
        println("Select a")
        a
    } else {
        println("Select b")
        b
    }

    println("max: $max")
}