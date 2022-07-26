package chap06.kotlinLibrary

import java.util.Random

fun main() {

    var fish = feedTheFish()
    println(fish)
}

fun feedTheFish(): String {
    val week = randomDay()
    val food = "pellets"

    return "Today is $week and the fish eat $food"
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")

    return week[Random().nextInt(week.size)] // 0 ~ 6(week.size = 7) 사이의 숫자 중 랜덤으로 하나의 숫자를 가져오고 그 숫자에 해당하는 week 인덱스 값을 return

}
