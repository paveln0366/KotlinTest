package oop.lesson_1_get_set

fun main() {
    val user = User()
    user.name = ""
    user.age = 10
    user.age = 15
    user.age = -20
    println("Имя: ${user.name} Возраст: ${user.age}")
}