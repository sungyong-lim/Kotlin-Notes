package solutions

// 여러개의 동전 중 가장 동전의 수를 적게 받을 수 있는 solution
// ex) 1360 -> 500원 2개 / 100원 3개 / 50원 1개 / 10원 1개 => total 7개
// ex) 1510 -> 500원 3개 / 10원 1개 => total 4개

fun main() {
    val coin = arrayListOf<Int>(500, 100, 50, 10)
    val money1 = 1360
    val result1 = solution(coin, money1)
    println(result1)

    val money2 = 1510
    val result2 = solution(coin, money2)
    println(result2)
}

private fun solution(coins: ArrayList<Int>, money: Int) : Int {

    var cnt = 0 // 코인을 몇번 사용했는지를 담을 변수
    var currentMoney = money // 현재 금액

    for(i in coins) {
        // 현재 돈에서 코인을 나눈 몫을 cnt 변수에 할당
        cnt += currentMoney / i

        // 현재 돈에서 코인을 나눈 나머지를 currentMoney 변수에 할당
        currentMoney %= i
    }

    return cnt
}

