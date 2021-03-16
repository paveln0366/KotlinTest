import kotlin.math.min

fun main() {
    println(max2(5, 10))
    println(crop("0123456789"))
    println(sumNumbers(5, 3, 2))
    val numbers = mutableListOf<Int>(7, 5, 6, 1 )
    println(sort(numbers))
}

fun sort(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())

fun sumNumbers(vararg numbers: Int): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}

fun crop(str: String) = str.substring(0, min(5, str.length))

fun max2(a: Int, b: Int) = if (a > b) a else b

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}



