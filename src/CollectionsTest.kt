fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 100),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filterNot { it.value.any { it < 0 } }
    val averageWeek = validData.flatMap { it.value }.average()
    println("Средняя выручка в неделю: $averageWeek")

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.maxOrNull()
    val min = listOfSum.minOrNull()
    val averageMonth = listOfSum.average()

    val maxMonth = validData.filter { it.value.sum() == max }.keys
    val minMonth = validData.filter { it.value.sum() == min }.keys

    println("Средняя выручка в месяц: $averageMonth")
    println("Максимальная выручка в месяц: $max")
    print("Месяцы с максимальной выручкой: ")
    for (month in maxMonth) {
        print("$month ")
    }
    println("\nМинимальная выручка в месяц: $min")
    print("Месяцы с минимальной выручкой: ")
    for (month in minMonth) {
        print("$month ")
    }

    val invalidData = data.filter { it.value.any { it < 0 } }
    val errorMonth = invalidData.keys
    print("\nОшибки произошли в следующих месяцах: ")
    for (month in errorMonth) {
        print("$month ")
    }
}