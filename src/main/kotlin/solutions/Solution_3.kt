package solutions

// 별 찍기 -> 두개로 증가

fun main() {

    solution(3)
    /*
        *      1
        **     2
        ****   4
    */

    println()

    solution(5)
    /*
        *                   1
        **                  2
        ****                4
        ********            8
        ****************    16
    */

}



private fun solution(star: Int) {
    var cnt = 1

    for(i in 1..star) {
        for(j in 1..cnt) {
            print("*")
        }
        println()
        cnt *= 2
    }
}