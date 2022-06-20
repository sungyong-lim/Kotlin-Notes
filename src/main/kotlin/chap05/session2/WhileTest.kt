package chap05.session2

/** While **/
/*
    기본형태
        - while(조건식) { 본문 }
* */

/** do ~ while **/
// -무조건 한번은 실행

fun main() {

    /*
    Enter the lines: 5
        *
       ***
      *****
     *******
    *********
     */
    print("Input: ")
    var input = readLine()!!.toInt()

    for(i in 1..input) {
        for (j in 1..(input - i)) print(" ")
        for(k in 1..(2 * i - 1)) print("*")

        println()
    }

    do {
        print("Enter the Number: ")
        val input = readLine()!!.toInt() //널널 단정기호(!!)는 널일리 없다는 단정을 하는 것
        for(i in 0..(input - 1)) { //
            for(j in 0..(input - 1)){
                print((i + j) % input+1) //모듈 여
            }
            println()
        }
    } while(input != 0)

}