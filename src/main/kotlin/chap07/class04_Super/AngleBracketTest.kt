package chap07.class04_Super

/** 앵글브라켓 사용해서 이름 중복 해결 **/

// 상속이 가능한 A class 정의
open class A {
    open fun f() = println("A class f()") // 상속이 가능한 f() 메서드 정의
    fun a() = println("A class a()") // a() 메서드 정의 - 상속 불가능
}

// 인터페이스는 구현한다는 의미
interface B {
    fun f() = println("B Interface f()") //인터페이스는 기본적으로 open임
    fun b() = println("B Interface b()")
}

class C : A(), B { // 1. 콤마(,)를 사용해 클래스와 인터페이스를 지정
    // 컴파일되려면 f()r가 오버라이딩 되어야함
    override fun f() = println("C class f()")

    fun test() {
        f() // 2. 현재 클래스의 f()
        a() // 클래스 A의 a()
        b() // 3. 인터페이스 B의 b()
        super<A>.f() // A 클래스의 f()
        super<B>.f() // B 인터페이스의 f()
    }

}


fun main() {
    val c = C()

    c.test()
}