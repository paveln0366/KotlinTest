package oop.lesson_9_abstract_interface_smart_cast

class Seller(name: String, age: Int) : Worker(name, age), Cleaner {
    override fun work() {
        println("продает товар")
    }

    override fun clean() {
        println("продавец убирает")
    }
}