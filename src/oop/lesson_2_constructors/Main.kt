package oop.lesson_2_constructors

fun main() {
    val russia = Country("Russia", 144_000_000)
    val belarus = Country()
    val germany = Country(name = "Germany")
    println("${russia.name} ${russia.population}")
    println("${belarus.name} ${belarus.population}")
    println("${germany.name} ${germany.population}")

    val book1 = Book("Book1", 1990, 2.50)
    val book2 = Book("Book2", 1990)
    val book3 = Book("Book3")
    println("${book1.name} ${book1.year} ${book1.cost}")
    println("${book2.name} ${book2.year} ${book2.cost}")
    println("${book3.name} ${book3.year} ${book3.cost}")
}