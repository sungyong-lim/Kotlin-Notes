package chap06.kotlinLibrary

fun main() {
    val score: Int? = 32
    val score2 = null


    // 1.1 일반적인 null 검사
    fun checkScore(score: Int?) {
        if(score != null) {
            println("Score: $score")
        }
    }

    // 1.2 let을 사용해 null 검사를 제거
    fun checkScoreLet(score: Int?) {
        score?.let { println("Score: $it") } //세이프콜(safe call)을 사용해서 null이 아니면 수행
                                            //세이프콜은 nullable한 변수를 검사하여 null이면 NPE를 발생하지 않고 그냥 그대로 null을 출력
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore(score)
    checkScore(score2)
    checkScoreLet(score)
    checkScoreLet(score2)

    // 2. let 함수의 chaining
    var a = 1
    val b = 2

    a = a.let { it + b }.let {
        println("a = $a") //a는 복사되기 전의 값인 1이 출력
        var i = it + b
        i
    }
    println(a)

    // 3. let 중첩사용
    var x = "Kotlin!"
    x.let { outer ->
        outer.let { inner ->
            println("Inner is $inner and outer is $outer") // it을 사용하지 않고 명시적 이름을 사용
        }
    }

    //4. 반환값은 바깥쪽의 람다식에만 적용
    var y = "Kotlin!"
    y = y.let {outer ->
        outer.let { inner ->
            println("Inner is $inner and outer is $outer")
            "Inner String" // 반환되지 않음
        }
        "Outer String"//이 문자열이 반환되 x에 할당
    }

    println(y)
}


