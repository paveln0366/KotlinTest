fun main() {
    takeX()

    println()
    dropX()

    println()
    generateX()

    println()
    generateY()

    println()
    generateZ()

    println()
    generateEmployee()
}

fun takeX() {
    val array = (0..9).toList()
    val employees = array.map { "Employee $it" }
    val takeLast5 = employees.takeLast(5)
    val take5 = employees.take(5)
    for (i in take5) {
        print("$i, ")
    }
}

fun dropX() {
    val array = (0..9).toList()
    val employees = array.map { "Employee $it" }
    val dropLast5 = employees.dropLast(5)
    val drop5 = employees.drop(5)
    for (i in drop5) {
        print("$i, ")
    }
}

fun generateX() {
    val array = generateSequence(0) {
        println("Сгенерировано ${it + 2}")
        it + 2
    }
    val generateNumbers = array.take(5)
    for (i in generateNumbers) {
        print("$i ")
    }
}

fun generateY() {
    val array = generateSequence('A') {
        println("Сгенерировано ${it + 1}")
        it + 1
    }
    val generateNumbers = array.take(5)
    for (i in generateNumbers) {
        print("$i ")
    }
}

fun generateZ() {
    val array = generateSequence {
        (Math.random() * 100).toInt()
    }
    val generateNumbers = array.take(5)
    for (i in generateNumbers) {
        print("$i ")
    }
}

fun generateEmployee() {
    val employees = generateSequence("Сотрудник №1") {
        val index = it.substring(11).toInt()
        "Сотрудник №${index + 1}"
    }
    val listEmployees = employees.take(5)
    for (i in listEmployees) {
        print("$i, ")
    }
}