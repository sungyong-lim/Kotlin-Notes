package chap08

/** Object Expression **/
/*
    - 하위 클래스를 만들지 않고도 새로운 구현인 fly()를 포함할 수 있음
  
    -  어떤 클래스에 메서드를 오버라이딩 하기 위해 하위 클래스를 정의하고 해당 메서드를 
       재정의 한 뒤 객체를 생성하는 과정을 거쳐야 하지만 object Expression은 이러한 과정없이 간단하게 가능
* */


open class Superman() {
    fun work() = println("Talking photos")
    fun talk() = println("Talking with people")
    open fun fly() = println("Flying in the air")
}

fun main() {
    // pretendedMan 접근 시점에서 인스턴가 생성됨
    val pretendedMan = object : Superman() { // object Expression으로 fly() 메서드 구현의 재정의
        override fun fly() = println("I'm not a real superman, I can't fly!")
    }

    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()


}