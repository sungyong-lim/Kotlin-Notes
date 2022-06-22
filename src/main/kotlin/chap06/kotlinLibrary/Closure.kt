package chap06.kotlinLibrary

/** 클로저(Closure)**/
/*
    - 클로저란?
        - 실행 시점에서 람다식의 모든 참조가 포함된 닫힌(closed) 객체를 람다 코드와 함께 저장하는 것

    - 개념
        - 람다식으로 표현된 내부 함수에서 외부 범위에 선언된 변수에 접근할 수 있는 개념
        - 람다식 안에 있는 외부 변수는 값을 유지하기 위해 람다가 포획(Capture)한 변수
* */
fun main() {

    val calc = Calc()
    var result = 0 //외부의 변수
    calc.addNum(2, 3) {x, y -> result = x + y } //클로저
    println("result: $result") //값을 유지하며 5가 출력

    filteredName(3)
}

class Calc {
    fun addNum(a:Int, b:Int, add:(Int, Int) -> Unit) { // 반환값이 없는 람다식 add 매개변수
        add(a, b)
    }
}

// 길이가 일치하는 이름만 반환
fun filteredName(length: Int) {
    val names = arrayListOf("Kim", "Hong", "Lim")
    var filterResult = names.filter {
        it.length == length
    }
    println(filterResult)
}
