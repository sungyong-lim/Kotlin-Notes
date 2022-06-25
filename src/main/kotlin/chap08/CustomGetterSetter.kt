package chap08.p1

// 커스텀 getter와 setter 사영
class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        get() = field
        set(value) {
            println("The name was changed")
            field = value.toUpperCase() // 받은 인자를 대문자로 변경해 프로퍼티에 할당
        }

    var age: Int = _age
}

fun main() {
    var user = User(1, "Lim",26)

    user.name = "LimDragon"

    println("user.name: ${user.name}")
}