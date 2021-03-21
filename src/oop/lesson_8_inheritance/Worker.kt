package oop.lesson_8_inheritance

open class Worker(val name: String, val age: Int) {
    open fun work() {
        println("работает")
    }
}