package solutions

// 리스트의 숫자를 뒤집어서 반환하는 solution

fun main() {

    val arr1 = arrayListOf(1, 2, 3, 4, 5)
    val result1 = solution(arr1)
    println(result1) // [5,4,3,2,1]

    val arr2 = arrayListOf(2, 4, 6, 8)
    val result2 = solution(arr2)
    println(result2) // [8,6,4,2]


}

private fun solution(arr: ArrayList<Int>): ArrayList<String> {

    // 내가 푼 방식
    /*
    var result = arrayListOf<String>()

    for(i in arr) {
        result.add(i.toString())
    }

    result.sort()
    result.reverse()
    return result
     */

    // 내가 푼 방식 2
    /*
    var result = arrayListOf<String>()
    for(i in arr.size - 1 downTo 0) {
        result.add(arr[i].toString())

    }

    return result
     */

    // 다른 사람이 푼 방식 
    val result = mutableListOf<String>()

    for(i in 0 until arr.size) { // 0 ~ 4 
        result.add(arr[arr.size - 1 - i].toString()) 
        // 4 - 0 = arr[4]
        // 4 - 1 = arr[3]
        // 4 - 2 = arr[2]
        // 4 - 3 = arr[1]
        // 4 - 4 = arr[0]
    }


    return result as ArrayList<String> // mutableListOf -> ArrayList 형변환


}