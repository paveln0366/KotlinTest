package oop.lesson_6_data_class

fun main() {
    val student1 = Student("Ivan", "Ivanov", "12345678")
    val student2 = student1.copy(id = "87654321")
    val (name, _, id) = student1
    println(name)
    println(id)
    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2) // Сравнение ссылок
    println(student1 === student2) // Сравнение объектов
}