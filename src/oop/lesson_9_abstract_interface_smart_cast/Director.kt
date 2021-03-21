package oop.lesson_9_abstract_interface_smart_cast

class Director(name: String, age: Int) : Worker(name, age) {
    override fun work() {
        println("управляет")
    }
}