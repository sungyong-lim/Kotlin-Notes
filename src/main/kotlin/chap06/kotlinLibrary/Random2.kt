package chap06.kotlinLibrary

import java.util.Random

fun main() {

    val fish = feedTheFish2()
    println(fish)
}

fun feedTheFish2(): String {
    val day = randomDay2()
    val food = fishFood(day)

    return "Today is $day and the fish eat $food"
}

fun randomDay2(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")

    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String {
    var food = ""
    when(day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"

    }

    return food
}
