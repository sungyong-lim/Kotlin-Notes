package chap07.class07_enum

/** enum(enumerations) class **/
// 열거형 클래스

fun main() {
    println(Direction.NORTH)

    Direction.values().forEach {
        println(it)
    }

    val direction = Direction.SOUTH

    when(direction) {
        Direction.NORTH -> println("N")
        Direction.SOUTH -> println("S")
        Direction.WEST -> println("W")
        Direction.EAST -> println("E")
    }

    for(i in CustomerType.values()) { // "forEach"와 동일
        println(i)
    }

    val color = Color.GREEN
    when(color) {
        Color.RED -> println(Color.RED.rgb)
        Color.BLUE -> println(Color.BLUE.rgb)
        Color.GREEN -> println(Color.GREEN.rgb)
    }

    println(Device.DEVICEON.status)
    Device.DEVICEON.status = "OFF"
    println(Device.DEVICEON.status)

    println(Device.NETWORK.status)
    println(Device.LOCATION.status)



}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class CustomerType {
    A, B, C, D, VIP
}

enum class Color(val rgb: String) {
    RED("0XFF000"),
    GREEN("0X00FF00"),
    BLUE("0X0000FF")
}

enum class Device(var status: String) {
    DEVICEON("ON"),
    NETWORK("OFF"),
    LOCATION("GWANGJU")
}