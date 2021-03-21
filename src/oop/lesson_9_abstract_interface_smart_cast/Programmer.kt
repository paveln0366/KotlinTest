package oop.lesson_9_abstract_interface_smart_cast

class Programmer(name: String, age: Int, val language: String) : Worker(name, age), Cleaner {
    override fun work() {
        println("пишет код на $language")
    }

    override fun clean() {
        println("программист убирает")
    }
}