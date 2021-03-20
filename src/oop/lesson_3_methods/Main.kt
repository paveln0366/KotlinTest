package oop.lesson_3_methods

fun main() {
    val cat = Cat("Барсик", 12, 3f)
    cat.printInfo()

    println(cat.isOld)
    cat.age = 10
    println(cat.isOld)

    val programmer = Worker("Ivan", "Programmer", 2016)
    programmer.printInfo()
}

//fun Cat.isOld() = age >= 12

fun Worker.printInfo() {
    println("Имя: $name Должность: $position Год устройства: $startYear Стаж: $experience")
}