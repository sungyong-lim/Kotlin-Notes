package chap03.session1

fun sum(a:Int = 2, b:Int = 5) = a + b

fun max(a:Int, b:Int) = if(a > b) a else b


fun outFunc(name:String) = println("Name: $name")


fun main() { //최상위(Top-level) 함수

    val result1 = sum(2, 3)
    val result3 = sum(b = 2)

    val a = 3
    val b = 5
    val result2 = max(a, b)

    println(result1)
    println(result3)
    println(result2)
    outFunc("Lim")

}
