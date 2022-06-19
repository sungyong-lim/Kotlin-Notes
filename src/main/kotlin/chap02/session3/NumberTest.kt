package session3

fun main() {
    var test: Number = 123 //123으로 인해 test는 Int로 스마트 캐스트
    println("test: $test, Type: ${test.javaClass}")

    test = 20L
    println("test: $test, Type: ${test.javaClass}") //Long형으로 스마트 캐스트

    test = 12.5
    println("test: $test, Type: ${test.javaClass}") //Double형으로 스마트 캐스트
}