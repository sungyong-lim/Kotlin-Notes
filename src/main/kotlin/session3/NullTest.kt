package session3

fun main() {

    var temp: String?
    temp = null

    var size = -1

    //null 비교하기
    if(temp != null) {
        size = temp.length
    }

    println(size)
    println("=============================================")

    var temp2: String? = null
    var size2 = if(temp2 != null) temp2.length else -1
    println(size2)

    println("=============================================")

    //Elvis Operation
    var temp3: String? = null

    println("temp3: $temp3, length: ${temp3?.length ?: -1}")

}