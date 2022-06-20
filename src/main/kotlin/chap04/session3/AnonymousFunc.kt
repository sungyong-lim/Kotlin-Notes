package chap04.session3

fun main() {
    //익명 함수(Anonymous Function)
    val add: (Int, Int) -> Int = fun(x, y) = x + y // 익명함수를 사용한 add 선언
    val result = add(10, 2) // add 사용
    println(result)

    val add2: (Int, Int) -> Int = { x, y -> x + y } // 람다식을 사용한 add2 선언, 익명함수와 매우 유사
    val result2 = add2(10, 2) //add2  사용
    println(result2)

    /*
    * 일반 익명 함수에서는 return, break, continue 가 사용 가능하지만
    * 람다식에서는 사용하기 어렵다.(라벨 표기법과 같이 사용해야함)
    * */
    val add3 = fun(x: Int, y: Int) = x + y // 익명함수를 사용한 add3 선언

    val add4 = { x: Int, y: Int -> x + y } //람다식을 사용한 add4선언, 익명함수와 매우 유사
}
