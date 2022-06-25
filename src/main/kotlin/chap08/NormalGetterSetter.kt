package chap08

// 기본 세터/게터
class User(_id: Int, _name:String, _age: Int) {
    // 프로퍼티들
    val id: Int = _id
        get() = field // field는 프로퍼티를 참조하는 변수로 보조 필드로 불림
    //  get() = _id  -> 프로퍼티를 대신할 임시 필드로 만일 프로퍼티를 직접 사용하면 게터나 세터가 무한 호출되는 재귀에 빠짐

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            println("age Update")
            field = value + 10 // 커스텀 세터가 구성됨
        }
}

fun main() {
    val user = User(1,"Lim", 26)
    // user.id = 2 -> error! val 프로퍼티는 값 변경 불가
    user.age = 35
    println("user.age: ${user.age}") //getter 동작



}