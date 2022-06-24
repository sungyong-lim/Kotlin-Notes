package chap07.class05_VisibilityModifiers

fun main() {

    val otheric = InternalClass() // 생성 가능

    println(otheric) // 접근 허용

    otheric.icFunc() // 접근 허용


}