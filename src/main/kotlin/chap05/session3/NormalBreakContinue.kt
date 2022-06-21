package chap05.session3

//라벨 없는 break

fun notLabelBreak() {
    println("NotLabelBreak")
    for(i in 1..5) {
        second@ for(j in 1..5) {
            if(j == 3) break
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

//라벨 있는 break
// break문을 통해 라벨이 return 되서 i가 1일 경우 끝나게 된다
fun labelBreak() {
    println("labelBreak")
    first@ for(i in 1..5)  {
        second@ for(j in 1..5) {
            if(j == 3) break@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")

}

//라벨 없는 Continue
fun notLabelContinue() {
    println("NotLabelContinue")
    for(i in 1..5) {
        second@ for(j in 1..5) {
            if(j == 3) continue
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

//라벨 있는 Continue
fun labelContinue() {
    println("Label Continue")
    first@ for(i in 1..5) {
        second@ for(j in 1..5) {
            if(j== 3) continue@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun main() {
    //break
    for(i in 1..5) {
        if(i == 3) break
        print(i)
    }
    println()
    println("Break outside")

    //continue
    for(i in 1..5) {
        if(i==3) continue
        print(i)
    }
    println()
    println("Continue outside")

    notLabelBreak()
    labelBreak()

    notLabelContinue()
    labelContinue()

}
