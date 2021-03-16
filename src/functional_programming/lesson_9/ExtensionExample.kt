package functional_programming.lesson_9

fun main() {
    ex1()
    println(5.isPrime())
    ex2()
}

fun ex1() {
    val age = 5
    if (age.isAgeValid()) {
        println("Valid")
    }
    if (age.isAgeValid()) {
        println("Valid")
    }
    println(age.isPositive())
}

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

fun ex2() {
    val list = listOf<Int>()
    val string = "string"
    val obj = mutableMapOf<String, String>()

    myWith(list) {
        sum()
        average()
    }

    myWith(string) {
        println(toUpperCase())
    }

    myWith(obj) {
        keys
        values
    }
}

fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) {
    list.operation()
}

fun myWith(string: String, operation: String.() -> Unit) {
    string.operation()
}

inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}