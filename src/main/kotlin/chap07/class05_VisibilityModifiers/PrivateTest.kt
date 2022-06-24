package chap07.class05_VisibilityModifiers

private class PrivateTest {
    private var i = 1
    private fun privateFunc() { //private
        i += 1 //접근 허용
        println(i)
    }

    // 외부에서 접근할 수 있는 코드 
    fun access() { //Public -> 기본값
        privateFunc() // 접근 허용
    }
}

// Public 클래스
class OtherClass {
    // 공개 생성 불가
    // val pc = PrivateTest() // 가시정 지시자가 private 이기 때문에 외부에서 사용 불가능

    // 공개 생성 가능
    // 사용하기 위해서는 외부에 공개를 하지 않는 형태로 만들어줘야함
    //private val pc = PrivateTest() //사용 가능

    // 사용 사용 가능
    // 기타 클래스에서는 test라는 메서드로 한번 더 가려지기 때문에 객체 생성 가능 
    fun test() {
        val pc = PrivateTest() //객체 생성가능
        pc.access()
    }

}


fun main() {
    // top-level이기 때문에 class 객체 생성 가능
    val pc = PrivateTest() //객체 생성 가능

    //접근 불가
    //pc.i = 3 // 프로퍼티 i는 private 이기 때문에 해당 클래스 내에서만 접근

    //접근 불가
    //pc.privateFunc() // 메서드 privateFunc() 는 private 이기 때문에 해당 클래스 내에서만 접근

    //접근 가능
    // access() 를 통해서 내부의 privateFunc()를 호출
    pc.access() //접근 가능 -> 외부에서는 public 메서드를 통해서만 접근
}

fun topFunction() {
    val pc = PrivateTest() // 객체 생성 가능
}