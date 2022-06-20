package chap04.session3

//인라인(inline) 함수
/*
    - 함수가 호출되는 곳에 내용을 모두 복사
    - 함수가 호출될 때마다 해당 함수를 계속 왔다함 그래서 호출되는 숫자가 많을 수록 그만큼 분기 overhead가 많이 발생
    - 인라인 함수는 본문에 내용이 복사됨
    - 장점은 함수의 분기 없이 처리 -> 성능증가
    - 단점은 코드가 복사되므로 내용이 많은 함수에 사용하면 코드가 늘어남
    - crossinline => 비지역반환을 금지하는 키워드
* */

//인라인 함수는 람다식을 사용하는 것이 좋음
inline fun shortFunc(a:Int, crossinline out: (Int) -> Unit) {
    println("Kotlin")
    out(a)
    println("Notes") //비지역반환
}

//noinline 키워드
// - 일부 람다식 함수를 인라인 되지 않게 하기 위함
//inline fun noinlineFunc(x: Int, noinline out: (Int) -> Unit) {
//    println("kotlin")
//    out(x)
//}


fun main() {
    shortFunc(45) {
        println("a: $it")
//        return => crossinline(비지역반환 금지 키워드) 키워드 때문에 return문 사용 불가능
    }

//    noinlineFunc(15) {
//        println("x: $it")
//    }
}