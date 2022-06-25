package chap08.p2

/** 임시적인 보조 프로퍼티 **/

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
    get() {
        if(tempName == null) tempName = "NoName"
        return tempName ?: throw AssertionError("Asserted by others")
    }
}

fun main() {
    var user = User(1,"Im",123)

    user.name = ""
    println("user.name: ${user.name}")
}