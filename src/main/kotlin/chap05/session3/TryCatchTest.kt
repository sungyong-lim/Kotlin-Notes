package chap05.session3

/** 예외처리 **/

/*
    - try {---} catch{---} : try 블록의 본문을 수행하는 도중 예외가 발생하면 catch 블록의 본문을 실행
    - try {---} catch{---} finally{---} : 예외가 발생해도 finally 블록 본문은 항상 실행

    - 기본 형태
        try {
            예외 발생 가능성 있는 문장
        } catch (e: 예외처리 클래스명) {
            예외를 처리하기 위한 문장
        } finally {
            반드시 실행되어야 하는 문장
        }
*/

/** 특정 예외 처리 **/
// - ArithmeticException : 산술 연산에 대한 예외를 따로 특정해서 잡을때
// - e.printStackTrace() : 스택의 추적
fun main() {
    val a = 6
    val b = 0
    val c: Int
    val d: Int
    val f: Int

    // Exception : 기본적은 예외를 모두 잡을 때
    try {
        c = a / b
    } catch (e: Exception) {
        println("Throw Exception")
    } finally {
        println("finally")
    }


    // ArithmeticException : 산술 연산에 대한 예외를 따로 잡을 때
    try {
        d = a / b
    } catch (e: ArithmeticException) {
        println("Exception is handled. ${e.message}")
    }

    // printStackTrace : 스택 추적
    try {
        f = a / b
    } catch (e: Exception) {
        e.printStackTrace()
    }
}