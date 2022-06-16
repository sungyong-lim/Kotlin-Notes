package session3

fun main() {
    //Any Casting
    var a: Any = 1 //Any형 a는 1로 초기화될 때 Int형이 됨
    println("a: $a, Type:${a.javaClass}")

    a = 20L // Long형으로 스마트 캐스트
    println("a: $a, Type:${a.javaClass}")

    a = "String" // String형으로 스마트 캣츠
    println("a: $a, Type:${a.javaClass}")

    a = 'C' //Char형으로 스마트 캐스츠
    println("a: $a, Type:${a.javaClass}")

    //Argument Test
    checkArg("String") //Argument String
    checkArg(213)      // Argument Int
}

fun checkArg(x: Any) { //Parameter Any
    if(x is String) {
        println("x is String: $x")
    }
    if (x is Int) {
        println("x is Int: $x")
    }
}