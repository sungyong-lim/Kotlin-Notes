package chap07.class01

//주 생성자
// 생성자 및 해당되는 Property가 같이 사용되는 방법
//class Bird(var name: String, val wing: Int, var beak: String)
open class Bird{
    //Property
    var name: String
    var wing: Int
    var beak: String

    // 부 생성자
    constructor(_name: String, _wing: Int, _beak: String) {
        // this는 부생성자의 매개변수와 property가 다르다는 것을 표시하기 위해 this라는 참조포인터
//        this.name = name //this.name은 property name을 가르킴
//        this.wing = wing
//        this.beak = beak

        // 부생성자 매개변수와 property 이름이 다를 경우에는 this 키워드 작성안해도됨
        name = _name
        wing = _wing
        beak = _beak
    }

    // 2번째 부 생성자
    // 부 생성자에 매개변수가 같을 경우  에러
    constructor(_name: String,  _beak: String){
        name = _name
        wing = 4
        beak = _beak
    }


/*
    //초기화 블록 -> 무조건 실행 됨 그래서 시간이 많이 걸리는 작업 사용 X
    // 클래스 호출 시 제일 먼저 실행
    init {
        println("------ init start -------")
        name = name.capitalize() //capitalize : 문자열 첫 문자를 대문자로 바꿈
        println("name: $name, wing: $wing, beak: $beak")
        println("------ init end -------")
    }
*/

    //method
    fun fly() {
        println("$name Fly")
    }
}

fun main() {
    val coco = Bird("coco",2, "short")

    val coco2 = Bird("coco2","long")
    coco.fly()
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
    println()
    println("coco => name: ${coco.name}, wing: ${coco.wing}, beak: ${coco.beak}")
    println("coco2 => name: ${coco2.name}, wing: ${coco2.wing}, beak: ${coco2.beak}")
}