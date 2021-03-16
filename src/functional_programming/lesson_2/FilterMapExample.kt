fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..9) {
        listOfNumbers.add(i)
    }

//    val listOfEvenNumbers = listOfNumbers.filter({number: Int -> number % 2 == 0})
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumbers) {
        print("$i ")
    }

    println()

    val names = listOf<String>("Ivan", "Pavel", "Artem")
    val namesStartsWithA = names.filter { it.startsWith("A") }
    for (i in namesStartsWithA) {
        print("$i ")
    }

    println()

    val numbers = (0..4).toList();
    val doubledNumbers = numbers.map { it * 2 }
    for (i in doubledNumbers) {
        print("$i ")
    }
    println()
    val employee = numbers.map { "Employee $it" }
    for (i in employee) {
        print("$i, ")
    }

    println()

    val array = arrayOf(5, 3, 2, 6, 7)
    val sortedArray = array.sortedDescending()
    for (i in sortedArray) {
        print("$i ")
    }

    println()

    val initArray = mutableListOf<Int>()
    for (i in 0 until 10) {
        initArray.add((Math.random() * 10).toInt())
    }
    val result = initArray.filter { it % 5 == 0 || it % 3 == 0 }
        .map { it * it }.sortedDescending().map { "$it" }
    for (i in result) {
        print("$i, ")
    }
}