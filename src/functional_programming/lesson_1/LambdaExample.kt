fun main() {
    val sum1 = { a: Int, b: Int -> a + b }
    val sum2: (Int, Int) -> Int = { a, b -> a + b }
    println(sum1(2, 10))
    println(sum2(2, 10))

    val square1 = { a: Int -> a * a }
    val square2: (Int) -> Int = { it * it }
    println(square1(5))
    println(square2(5))

    val perimeter: (Int, Int) -> Int = { a, b -> ((a * 2) + (b * 2)) }
    println(perimeter(2, 3))

    val hello: (String) -> Unit = { println("Hello $it") }
    hello("Pavel")

    val sort: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }
    val sorted = sort(arrayOf(5, 2, 3, 1, 4))
    for (i in sorted) {
        print(i)
    }
}