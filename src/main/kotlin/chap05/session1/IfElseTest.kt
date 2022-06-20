package chap05.session1

fun main() {
    print("Enter the score: ")

    //readLine() => 코틀린 IO의 표준 함수인 readline()은 콘솔로부터 한 줄 입력을 받아들임
    // readLine() 은 문자열을 받아들이므로 원하는 자료형으로 변경해야함
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'

    // 범위(range) 연산자 => 변수명 in 시작값..마지막값
    if(score > 90.0) {
        grade = 'A'
    } else if(score in 80.0..89.9) {
        grade = 'B'
    } else if(score in 70.0..79.9) {
        grade = 'C'
    }

    println("score: $score, grade: $grade")
}
