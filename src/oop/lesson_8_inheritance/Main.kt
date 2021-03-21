package oop.lesson_8_inheritance

fun main() {
//    val dog = Dog(3f)
//    println(dog.habitat)
    val workers = mutableListOf<Worker>()
    workers.add(Worker("Leonid", 27))
    workers.add(Worker("Ivan", 30))
    workers.add(Worker("Sergey", 23))
    workers.add(Programmer("Max", 34, "Java"))
    workers.add(Programmer("John", 18, "Kotlin"))
    for (worker in workers) {
        worker.work()
    }
}