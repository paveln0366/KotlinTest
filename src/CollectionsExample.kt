fun main() {
    arrayExample()
    arrayListExample()
}

fun arrayListExample() {
    // Создать изменяемый ArrayList
    val listOfNumbersFirst: MutableList<Int> = ArrayList<Int>()
    val listOfNumbers: MutableList<Int> = mutableListOf()
    listOfNumbers.add(5)
    println(listOfNumbers[0])
}

fun arrayExample() {
    // Создать массив размером 10 заполненный нулями
    val arrayFirst = arrayOfNulls<Int?>(10)
    val array: Array<Int?> = arrayOf(1, 2, 5)
    array[0] = 5
    println(array[0])
}