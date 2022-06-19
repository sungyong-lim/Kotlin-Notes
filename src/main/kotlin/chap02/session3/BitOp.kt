package session3

fun main() {
    val x = 4 // 0100(2) 4(10)
    val y = 0b0000_1010 //10(10)
    val z = 0x0f //0b0000_1111(2), 15(10)

    println("x shl 2 -> ${x.shl(2)}") //16(10) 0001_0000(2)
    println("x shr 2 -> ${x.shr(2)}") // 1(10) 0001(2)
    println("x inv -> ${x.inv()}") //111....1011(2)

    println("x and y -> ${x.and(y)}") //0(10) 0000(2)
    println("x or y -> ${x.or(y)}") //14(10) 1110(2)

    println("x xor z -> ${x.xor(z)}") //11(10) 1011(2)

    val num = 0x3F

}