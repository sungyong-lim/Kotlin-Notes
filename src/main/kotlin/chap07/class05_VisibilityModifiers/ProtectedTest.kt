package chap07.class05_VisibilityModifiers

open class Base { //최상위 선언 클래스에는 protected를 사용할 수 없음
    protected var i =  1 //상속 계열에서만 프로퍼티 접근 가능

    protected fun protectedFunc() {
        i += 1  //접근허용
        println(i)
    }

    fun access() {
        protectedFunc() //접근허용
    }
}

class Derived : Base() {
    var j = 1 + i

    fun derivedFunc(): Int {
        protectedFunc() //Base 클래스의 메서드 접근가능
        return i //Base 클래스의 프로퍼티 접근 가능
    }

}



fun main() {
    val base = Base() // 생성 가능
    // base.i = 1  접근 불가
    // base.protectedFunc() 접근불가
    base.access() //접근 가능

    val drived = Derived()
    drived.j = 3
    println(drived.derivedFunc())



}

