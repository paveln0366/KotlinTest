package oop.lesson_8_inheritance

open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Ест")
    }

    fun run() {
        println("Бежит")
    }
}