fun main() {
    averageValue()
    averageMapValue()
}

fun averageMapValue() {
    val data1 = mutableMapOf<String, List<Int>>()
    data1.put("file1", listOf(1,2,3,4,5))
    data1.put("file2", listOf(2,5,3,6,5))
    data1.put("file3", listOf(4,2,9,7,4))

    val data2 = mutableMapOf<String, List<Int>>()
    data2["file1"] = listOf(1,2,3,4,5)
    data2["file2"] = listOf(2,5,3,6,5)
    data2["file3"] = listOf(4,2,9,7,4)

    val data3 = mapOf(
        "file1" to listOf(1,2,3,4,5),
        "file2" to listOf(2,5,3,6,5),
        "file3" to listOf(4,2,9,7,4)
    )

    val data4 = mapOf(
        Pair("file1", listOf(1,2,3,4,5)),
        Pair("file2", listOf(2,-5,3,6,5)),
        Pair("file3", listOf(4,2,9,7,4))
    )

    val average = data4.flatMap { it.value }.average()
    println(average)

    val average2 = data4.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    val average3 = data4.filterNot { it.value.any { it < 0 } }.flatMap { it.value }.average()
    println(average2)
}

fun averageValue() {
    val revenueByWeek = listOf(
        listOf(1, 8, 2, 6, 7),
        listOf(8, 4, 1, 6, 2),
        listOf(1, 5, 2, 4, 7),
        listOf(1, 4, 9, 6, 1)
    )

//    val total = revenueByWeek.flatMap { it } // Если к коллекции применяется функция
    val total = revenueByWeek.flatten() // Если к коллекции не применяется функция
    val average = total.average()
    println(average)
}