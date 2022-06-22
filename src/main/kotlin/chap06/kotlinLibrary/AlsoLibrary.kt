package chap06.kotlinLibrary

fun main() {

    var m = 1
    m = m.also { it + 1 } // it + 1이 반환되지 않고 원본 값이 m에 할당
    println(m) // 원본 값 1 출력


    /** let()과 also() 비교 **/
    data class Person(var name:String, var skills: String)
    val person = Person("Lim","Kotlin")

    //let() 활용
    val a = person.let{
        it.skills = "Android" //여기서 복사된 it은 객체의 참조가 복사된 것 -> 그래서 요소를 변경 가능
        "Success" // "success"가 반환되서 a에 할당
    }

    println("a: $a")
    println("person: $person") //skills가 Android로 변경됨

    //also() 활용
    val b = person.also {
        it.skills = "Java"
        "Success" // 이부분이 반환되지 않음
    }

    println("b: $b") //let()처럼 success가 출력되지 않고 person 자체가 할다됨
    println("person: $person") //skills가 Android로 변경됨



}