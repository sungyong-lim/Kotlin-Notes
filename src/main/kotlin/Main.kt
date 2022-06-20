fun noParam(out: () -> String) = println(out())

fun adds(sum: (Int, Int) -> Int, x:Int, y:Int): Int {
    return sum(x, y)
}

fun multi(mul: (Int, Int) -> Int ,x:Int, y:Int):Int {
    return mul(x, y)
}
fun main() {

    val x: Int = 15
    val y = 20
    val result:Int = adds({a, b -> a + b}, 15, 20)

    val result2: Int = multi({x, y -> x * y}, x, y)


}