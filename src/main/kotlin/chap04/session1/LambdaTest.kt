package chap04.session1

fun main() {
    var result: Int

//    val multi = { a:Int, b:Int -> a * b } // 일반 변수에 람다식 할당 방법1
    val multi: (a:Int, b:Int) -> Int = { a, b ->
        println("a: $a, b: $b") //단순히 결과만 출력
        a * b  //마지막 식이 반환됨
    } //일반 변수에 람다식 할당 방법2
    //람다식이 할당된 변수(multi)는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)

    //===================================================
    //매개변수가 없거나 반환 자료형이 없는 람다식 => 반환 자료형에 Unit 사용
//    val greet: () -> Unit = { println("no Parameter") }
    val greet = { println("no Parameter") } //선언부 자료형 생략 가능 -> 추론 가능
    println(greet())

    //===================================================
    // 매개변수가 하나인 람다식
    val square: (Int)->Int = {x -> x * x}
    val result3: Int = square(15)
    println(result3)

    //===================================================
    //람다식 안에 람다식이 있는 경우
//    val nestedLambda: () -> () -> Unit = { { println("nested-Lambda") } }
    val nestedLambda = { { println("nested-Lambda") } } //추론 가능 -> 선언부 자료형 생략


}