fun main() {
    printInfo("Иванов", "Иван")
    println()
    printInfo("", "Иван")
    println()
    printInfo(patronymic = "Иванович")
}

fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") {
    if (lastName.isNotEmpty()) {
        println("Фамилия $lastName")
    }

    if (name.isNotEmpty()) {
        println("Имя $name")
    }

    if (patronymic.isNotEmpty()) {
        println("Отчество $patronymic")
    }
}

fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c