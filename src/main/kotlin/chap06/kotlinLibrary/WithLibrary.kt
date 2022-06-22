package chap06.kotlinLibrary

fun main() {
    data class User(var name: String, var skills: String, var email: String? = null)

    var user = User("Lim", "default")
    println("user: $user")

    val result = with(user) {
        this.skills = "Android" // this 생략 가능
        email = "abc@example.com"
        "success" //마지막 라인 result에 반환
    }

    println("user: $user")
    println("result: $result")
}