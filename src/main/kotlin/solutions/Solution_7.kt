package solutions

// 문자 갯수를 세는 solution
// 문자열이 많이 나온 순서대로 정렬
// 단, 문자열 갯수가 같은 경우는 없음

fun main() {


    val result1 = solution("aabbaabccbb")
    println(result1)
    
    val result2 = solution("ccddcddaaq")
    println(result2)

}

private fun solution( str : String) : Map<String, Int> {


    // 문자열에 어떤 알파벳이 있는지 찾기
    val resultList = arrayListOf<String>()
    for(i in str) {
        resultList.add(i.toString())
    }

    // 중복된 알파벳을 구함 -> 무슨 알파벳이 있는지 확인
    val distinctList = resultList.distinct()
    val countList = arrayListOf<Int>()

    // 어떤 알파벳이 몇번 사용되었는지 세기
    for(i in distinctList) {
        val cnt = resultList.count { it == i } // resultList 에 들어 있는 값들이 중복된 값과 같은게 몇개 있는가
//        val cnt = resultList.filter { it == i }.count() // 위와 동일
        countList.add(cnt)
    }

    // 알파벳이 많이 나온 순서대로 정렬
    val result = mutableMapOf<String, Int>()
    for(i in 0 until distinctList.count() ) {
        result[distinctList[i]] = countList[i]
    }

    println(result.toList()) // 정렬을 위해 Map 형태를 List 형태로 형변환 -> [(a, 4), (b, 5), (c, 2)]
    println(result.toList().sortedBy { it.second }) // 리스트의 두번째 원소를 기준으로 정렬 -> [(c, 2), (a, 4), (b, 5)]
    println(result.toList().sortedBy { it.second }.reversed()) // 내림차순 정렬으로 변경 -> [(b, 5), (a, 4), (c, 2)]
    println(result.toList().sortedBy { it.second }.reversed().toMap()) // 반환형이 Map 형태이기 때문에 Map 형태로 형변환

    return result.toList().sortedBy { it.second }.reversed().toMap()

}