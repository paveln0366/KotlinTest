package oop.lesson_10_anonymous_classes

fun main() {
    val car: Transport = Car()
    val bike: Transport = Bike()

    if (car is Car) {
        car.name = "Машина2"
    }
    println(car.name)
    travel(object : Transport("Автобус") {
        override fun drive() {
            println("автобус едет")
        }
    })
}

fun travel(transport: Transport) {
    transport.drive()
}