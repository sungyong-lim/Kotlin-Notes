package solutions

/*
    이메일 중 구글과 네이버로 가입한 사람의 숫자와 그 외의 이메일로 가입한 사람의 숫자를 출력
*/
fun main() {

    val emailList1 = arrayListOf<String>(
        "jay@naver.com",
        "john@naver.com",
        "emily@google.com",
        "ken@google.com",
        "minjun@kakao.com"
    )
    val result1 = solution(emailList1)
    println(result1) // { naver = 2, google = 2, else = 1}

    val emailList2 = arrayListOf<String>(
        "Aiden@naver.com",
        "Andew@naver.com",
        "Adrian@daum.com",
        "Asher@google.com",
        "Austin@kakao.com",
        "Antonio@google.com",

    )
    val result2 = solution(emailList2)
    println(result2) // { naver = 2, google = 2, else = 2 }

}

private fun solution(emailList: ArrayList<String>) : Map<String, Int> {

    var mapList = mutableMapOf<String, Int>()
    var naverCount = 0
    var googleCount = 0
    var elseCount = 0
    for(i in emailList) {

        var email = i.split("@")[1].split(".")[0]

        when (email) {
            "naver" -> { naverCount++ }
            "google" -> { googleCount++ }
            else -> { elseCount++ }
        }
    }

    mapList["naver"] = naverCount
    mapList["google"] = googleCount
    mapList["else"] = elseCount

    return mapList

}