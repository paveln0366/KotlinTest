package oop.lesson_14_singleton

fun main() {
    val db = Database
    db.insertData("1")
    db.insertData("2")
    val test = Test()
    test.insertTestDate("3")
    test.insertTestDate("4")
    for (str in db.data) {
        println(str)
    }
}