package chap05.session2

/** when **/
/*
    - 기본형태
        - 인자가 있는 when
        when(인자) {
            인자에 일치하는 값 혹은 표현식 -> 수행할 문장
            인자에 일치하는 범위 -> 수행할 문장
            else -> {문장} // 블록 구문 사용 가능
         }

         - 인자가 없는 when
         when {
            조건[혹은 표현식] -> 실행문
         }
* */

fun main() {

    print("Enter the score: ")
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'
    // 인자가 있는 when Test
    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
    }

    println("score: $score, grade: $grade")

    //인자가 없는 When Test
    when {
        score >= 90 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 69.9 -> grade = 'F'
    }

    println("scroe: $score, grade: $grade")

}