package chap06.kotlinLibrary

fun main() {

    // 익명함수 처럼 동작하는 형태
    var skills = "Kotlin"
    println(skills)

    val a = 10
    skills = run {
        val level = "$skills Level: $a"
        level
    }
    println(skills)

    //확장함수 형태
    data class Person(var name: String, var skills: String)
    val person = Person("Lim", "Kotlin")

    var resultApply = person.apply {
        name = "SY"
        skills = "Android"
        "Success" //사용되지 않음
    }
    println("person: $person")
    println("resultApply: $resultApply")

    var resultRun = person.run {
        name = "SYL"
        skills = "Java"
        "Success" // 사영됨
    }
    println("person: $person")
    println("resultRun: $resultRun")

}