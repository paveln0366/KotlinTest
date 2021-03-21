package oop.lesson_10_anonymous_classes

class Car(override var name: String = "Машина"): Transport(name) {
    override fun drive() {
        println("машина едет")
    }

    fun startEngine(): Boolean {
        println("двигатель запущен")
        return true
    }
}