package chap07.class04_Super

/** 이너 클래스에서 바깥 클래스 접근 **/

// 상속 가능한 Base 클래스 정의
open class Base {
    // test 메서드에서 4번이 접근
    open val x: Int = 1 // 상속 가능한 프로퍼티 정의
    // test 메서드에서 3번이 접근
    open fun f() = println("Base Class f()") // 상속 가능한 f() 메서드 정의
}

// Base 클래스를 상속하는 Child 클래스 정의
class Child : Base() {

    override val x: Int = super.x + 1 // 상위 클래스의 프로퍼티를 접근
    // test 메서드에서 2번이 접근
    override fun f() = println("Child Class f()")// 상위 클래스의 메서드를 상속해서 재정의

    // Inside inner 클래스 생성
    inner class Inside {
        fun f() = println("Inside Class f()") // test 메서드에서 1번이 접근
        fun test() {
            f() //1. 현재 이너 클래스이 f() 메서드 접근
            Child().f() //2. 바로 바깥 클래스 f() 메서드 접근
            super@Child.f() // 3. Child의 상위 클래스인 Base 클래스의 f() 접근
            println("[Inside] super@Child.x : ${super@Child.x}") //4. Base 클래스의 x 프로퍼티 접근

        }

    }

}

fun main() {
    val c1 = Child()

    c1.Inside().test() // 이너 클래스 Inside의 메서드 test() 메서드 실행
}