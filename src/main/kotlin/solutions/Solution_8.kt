package solutions

// 리스트의 가장 작은 숫자를 찾아서 제거하고 남은 숫자들을 모두 더하는 Solution

fun main() {
    val input1 = arrayListOf(1,2,3,4,5)
    val result1 = solution(input1)
    println(result1) // 14

    val input2 = arrayListOf(10,8,6,4,2)
    val result2 = solution(input2)
    println(result2) // 28

    val input3= arrayListOf(6,3,9)
    val result3 = solution(input3)
    println(result3) // 15
}

private fun solution(arr: ArrayList<Int>): Int {

    // 내가 푼 방식

    // 가장 적은 값을 구한다
    val min = arr.minOf { it }
    // 리스트 중에서 가장 적은 값을 제거한다.
    arr.remove(min)
    // 더해줄 변수 생성
    var result = 0
    println(arr)

    // 리스트를 반복해서 모두 더한다.
    for(i in arr){
        result += i
    }

    // 수동으로 가장 작은 값 구하기
    /*
    // 방법 1
    var result2 = arr[0]
    for(i in 1 until arr.size) {
        if(result2 > arr[i]) result2 = arr[i]
    }

    // 방법 2
    var result3 = arr[0]
    for(i in arr) {
        if(result3 > i) result3 = i
    }
     */

    return result

}