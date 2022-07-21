package solutions

// 리스트에 주어진 숫자를 리스트의 갯수 만큼 나눈 값을 출력하는 solution

fun main() {

    val arr1 = arrayListOf<String>("1", "2")
    val result1 = solution(arr1)
    println(result1) // 1.5

    val arr2 = arrayListOf<String>("1", "2", "3", "4", "5")
    val result2 = solution(arr2)
    println(result2) // 3.0

}

private fun solution(arr: ArrayList<String>): Double {

    // 내가 푼 방식
    /*
    val list = arrayListOf<Int>()

    for(i in arr) {
        list.add(i.toInt())
    }

    return list.average()
    */


    // 다른 사람이 푼 방식
    var result = 0.0

    for(i in arr) {
        result += i.toInt()
    }


    return result / arr.size

}