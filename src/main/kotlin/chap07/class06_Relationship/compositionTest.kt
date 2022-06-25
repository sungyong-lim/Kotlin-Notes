package chap07.class06_Relationship

/** 구성(Composition) **/

class Car(name: String, power: String) {
    private var engine = Engine(power) // Engine 클래스 객체는 Car에 의존적

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {
    fun start() = println("Engine has been started")
    fun stop() = println("Engine has been stopped")
}

fun main() {
    val car = Car("tico", "100hp")

    car.startEngine()
    car.stopEngine()
}