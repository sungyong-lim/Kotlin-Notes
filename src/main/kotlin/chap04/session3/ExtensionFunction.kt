package chap04.session3

fun main() {
    /* 확장함수 (extension function)
        - 기존의 표준 라이브러리를 수정하지 않고도 확장 가능
        - 클래스의 멤버 함수를 외부에서 더 추가할 때 사용
        - 라이브러리 사용 시 라이브러리 자체를 수정하지 않고 멤버 함수를 집어넣을 때 확장함수 사용
        - 너무 많은 확장함수를 만들어내게 되면 기존에 의도하지 않은 멤버함수가 추가되기 때문에 호환성이 떨어짐

        - 기본 형태
            - fun 학장대상.함수명(매개변수, ---): 반환값 {
                본문 content
                return 값
              }
    */

    val source = "Kotlin Notes"
    val target = "Kotlin"

    println(source.getLongString(target))


}

// String 을 확장해 getLongString 추가
fun String.getLongString(target: String) : String =
    if (this.length > target.length) this else target