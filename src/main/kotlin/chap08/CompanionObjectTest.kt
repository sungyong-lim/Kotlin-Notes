package chap08.p7

/*
    - 고정된 static 내부 클래스처럼 정의되어 language와 work() 메서드는 단일(싱글톤)
      접근 요소가 됨. 따라서 객체 생성이 필요 없음

    - 컴패니언 객체는 실제 객체의 싱글톤으로 정의됨

    - 싱글톤, 오직 하나의 값만 허용하는 객체. 따라서 Person 객체를 여러개 생성해도 내부 동반 개체는
      오직 한개로 유지됨
* */


class Person {

    var id: Int = 0
    var name: String = "Sy"

    companion object { // 컴페니어 객체의 정의
        var language: String = "Korean"
        fun work() {
            println("Working...")
        }
    }
}

fun main() {
    // companion object는 중괄호 내부에 있는 객체 생성 없이 접근 가능-> person 객체를 생성하지 않아도 langauge, work 사용 가능
    println(Person.language) // 인스턴스를 생성하지 않고 기본값 사용
    Person.language = "English" // 기본값 변경 가능
    println(Person.language) // 변경된 내용 출력
    Person.work() // 메서드 실행
    // println(Person.name) // name은 companion object가 아니므로 오류

}