package solutions

import kotlin.math.min

// 가장 가까운 사람의 이름 알려주는 solution 
// 단, 거리는 음수가 아니고, 같은 거리는 없음

fun main() {
    val result1 = solution("민수 : 3, 민지 : 4, 찬혁 : 1.5, 지우 : 2")
    println(result1) // 찬혁

    val result2 = solution("지영 : 3.7, 민영 : 1.5, 해피 : 2.7, 퍼니 : 3")
    println(result2) // 민영
}

private fun solution(str: String): String {

    // "," 기준으로 자른다
    val list = str.split(",")
    println(list)

    val nameList = mutableListOf<String>() // 이름을 담을 리스트 변수
    val distanceList = mutableListOf<Double>() // 거리를 담을 리스트 변수

    // ":"으로 자른 후 이름과 거리를 리스트에 담는다
    for(i in list) {
        val name = i.split(":")[0].replace(" ", "") // 리스트에서 ":" 기준으로 나눈 후 0번째 인덱스(이름)에 공백을 제거해서 name 변수에 할당한다.
        val distance = i.split(":")[1].toDouble() // 리스트에서 ":" 기준으로 나눈 후 1번째 인덱스(거리)를 Double 형으로 형변환 시킨 후 distance 변수에 할당한다.

        nameList.add(name) // nameList 에 name 변수 할당
        distanceList.add(distance)// distanceList 에 distance 변수 할당
    }

    // 거리 리스트에서 가장 작은 수를 가져온다.
    val minValue = distanceList.minOf { it }

    // 가장 작은 수의 인덱스 값을 가져온다.
    val resultIndex = distanceList.indexOf(minValue)

    // 이름 리스트에서 짧은 거리의 인덱스를 넣어 이름을 리턴한다.
    return nameList[resultIndex]
}