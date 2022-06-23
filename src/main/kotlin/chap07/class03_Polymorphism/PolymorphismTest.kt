package chap07.class03_Polymorphism


open class Bird(var name: String, var wing: Int, var beak: String) { // 주 생성자 및 프로퍼티 생성

    // 해당 메서드를 overriding 하기 위해서는 open 키워드 작성
    // 메서드 및 프로퍼티도 오버라이드 가능
    open fun fly() {
        println("Fly")
    }
}

class Lark(name: String, wing: Int, beak: String) : Bird(name, wing, beak){

    // override 로 fly 메서드 재설계
    // final로 인해서 Lark를 상속하는 파생클래스에서 fly 재정의 금지
    final override fun fly() {
        println("Quick Fly")
    }

}

class Parrot : Bird {

    constructor(name: String, wing: Int, beak: String) : super(name, wing, beak) {

    }

    // override 로 fly 메서드 재설계
    override fun fly() {
        println("Slow Fly")
    }

}

fun main() {
    var lark = Lark("myLark", 2, "short")
    var parrot = Parrot("myParrot", 2, "long")

    lark.fly()

    parrot.fly()
}