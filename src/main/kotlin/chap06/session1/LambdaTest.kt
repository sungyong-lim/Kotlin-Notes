package chap06.session1

/** Lambda Expression**/
/*
    * 구성
        - { 매개변수[,...] -> 람다식 본문}
 */

fun main() {

    //람다식 - 기본 사용 
    val sum: (Int, Int) -> Int = {x, y -> x + y}
    val mul = {x:Int, y:Int -> x * y}
    val add: (Int) -> Int = {it + 1} //파라미터가 하나일 경우에는 it으로 대체 가능 
    
    // 람다식 - 여러개의 식이 있는 경우
    val isPositive: (Int) -> Boolean = {
        val isPositive = it > 0
        isPositive // 마지막 표현식이 반환됨
    }
    
    //라벨 사용 
    val isPositiveLable: (Int) -> Boolean = number@ {
        val isPositive = it > 0
        return@number isPositive //라벨을 사용해 반환됨
    }
    

}