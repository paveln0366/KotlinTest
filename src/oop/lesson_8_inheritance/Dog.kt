package oop.lesson_8_inheritance

class Dog(weight: Float) : Animal("Собака", weight, "Суша") {
    override fun eat() {
        println("Ест кость")
    }
}