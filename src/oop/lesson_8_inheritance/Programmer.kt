package oop.lesson_8_inheritance

class Programmer(name: String, age: Int, val language: String) : Worker(name, age) {
    override fun work() {
        println("пишет код на $language")
    }
}