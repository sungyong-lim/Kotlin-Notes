package chap06.kotlinLibrary

import java.util.Random

fun main() {

    val fish = feedTheFish3()
    println(fish)
}

fun feedTheFish3(): String {
    val day = randomDay3()
    val food = fishFood2(day)

    return "Today is $day and the fish eat $food"
}

fun randomDay3(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")

    return week[Random().nextInt(week.size)]
}

// 바뀐 코드
// 1. Wednesday, Saturday 에는 아무것도 먹지 않기 때문에 else 문을 추가해 Nothing 으로 출력
// 2. food 변수를 제거하고 when 문에서 나오는 값을 바로 return
fun fishFood2(day: String): String {
    return when(day){
        "Monday" ->  "flakes"
        "Tuesday" ->  "pellets"
        "Thursday" ->  "granules"
        "Friday" ->  "mosquitoes"
        "Sunday" ->  "plankton"
        else -> "Nothing"
    }

}
