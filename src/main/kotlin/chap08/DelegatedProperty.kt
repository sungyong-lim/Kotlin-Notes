package chap08.p6

import kotlin.properties.Delegates

class User {
    // observable 값의 변화를 감시하는 일종의 콜백 루틴
    var name: String by Delegates.observable("Noname") { // 1. 프로퍼티를 위임
        prop ,old, new ->  // 2. 람다식 매개변수로 프로퍼티, 기존 값, 새로운 값
        println("$old -> $new") // 3. 이부분은 이벤트가 발생할 때만 실행됨
    }
}

fun main() {
    var user = User()

    user.name = "Lim" // 4. 값이 변경되는 시점에서 첫 이벤트 발생
    user.name = "Kim" // 5. 값이 변경되는 시점에서 두번째 이벤트 발생
}