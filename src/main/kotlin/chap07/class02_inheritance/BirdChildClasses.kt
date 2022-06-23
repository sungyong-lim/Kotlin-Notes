package chap07.class02_inheritance

//상속 가능한 기반 클래스
open class Bird(var name: String, var wing: Int, var beak: String) { // 주 생성자 및 프로퍼티 생성
                //3
    fun fly() {
        println("Fly")
    }
}

/** 부모 클래스 생성자를 자식 클래스의 주 생성자에 정의한 예**/
// 최종 클래스 -> 다른 클래스가 상속 불가능
// 주 생성자에 정의하는 경우에 추가 프로퍼티 작성 시 var, val 사용 가능
class Lark(name: String, wing: Int, beak: String) : Bird(name, wing, beak){
    fun singHitone() {
        println("sing Hitone")
    }
}

/** 부모 클래스 생성자를 자식 클래스의 부 생성자에 정의한 예**/
// 반드시 부모 클래스가 가지는 생성자의 내용이 주 혹은 부 생성자에 정의 되어야함
class Parrot : Bird {
    // 부 생성자에서는 프로퍼티와 같이 직접 선언할 수 없으므로 상위에 선언
    var language: String

    /** super **/
    // 부 생성자는 상위에 있는 주 생성자에 내용을 같이 초기화할 수 있도록 super를 사용
    // super는 자식에 상위 클래스를 가르킴 == 상위의 프로퍼티가 초기화 되는 것
    // super 동작 순서  1. constructor(name: String, wing: Int, beak: String, language: String) 프로퍼티가 2. super(name, wing, beak)로 옮겨지고 그다음에 해당 3. 부모클래스의 프로퍼티를 가르킴
    constructor(name: String, wing: Int, beak: String, language: String) : super(name, wing, beak) {
                //1                                                         //2
        this.language = language
    }

    fun speak() {
        println("Speak : $language")
    }

}

fun main() {
    var lark = Lark("myLark", 2, "short")
    var parrot = Parrot("myParrot", 2, "long","Korean")

    println("lark -> name: ${lark.name}, wing: ${lark.wing}, beak: ${lark.beak}")
    println("parrot -> name: ${parrot.name}, wing: ${parrot.wing}, beak: ${parrot.beak}, language: ${parrot.language}")

    println()
    lark.singHitone()
    lark.fly()

    println()
    parrot.speak()
    parrot.fly()
}