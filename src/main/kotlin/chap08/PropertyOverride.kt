package chap08

open class First {
    open val x: Int = 0 // 오버라이딩 가능
    get() {
        println("First X")
        return field
    }
//    set(value) {} -> 불가능

    var y: Int = 0 // open 키워드가 없으면 final 프로퍼티
}

class Second : First() {
    // 부모 클래스 x 프로퍼티는 val 변수이기 때문에 setter 불가능
    // 자식 클래스 x 프로퍼티는 var 변수이기 때문ㅇ setter 사용해서 값 재할당 가능
    // 단, 부모 클래스 프로퍼티가 var로 선언된 경우 자식 클래스에서는 val로 변경 불강
    override var x: Int = 0  // 부모와 구현이 다름
    get() {
        println("Second X")
        return field + 3
    }

    // 부모 클래스와는 다르게 setter 가능
    set(value) {
        println("Second X Setter")
        field = value
    }
}

fun main() {
    val first = First()
//    first.x = 15 -> 불가능

    val second = Second()
    second.x = 15
    println(second.x)
    println(second.y)

}