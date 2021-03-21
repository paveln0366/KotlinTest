package oop.lesson_9_abstract_interface_smart_cast

fun main() {
    val workers = mutableListOf<Worker>()
    workers.add(Seller("Leonid", 27))
    workers.add(Seller("Ivan", 30))
    workers.add(Seller("Sergey", 23))
    workers.add(Programmer("Max", 34, "Java"))
    workers.add(Programmer("John", 18, "Kotlin"))
    workers.add(Director("Nick", 50))
//    for (worker in workers) {
//        worker.work()
//        if (worker is Cleaner) {
//            worker.clean()
//        }
//        worker as Cleaner
//        worker.clean()
//    }
    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for (cleaner in cleaners) {
        cleaner.clean()
    }
}