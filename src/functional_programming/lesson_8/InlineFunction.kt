package functional_programming.lesson_8

fun main() {
    val result = modifyString("Hello world!") { it.toUpperCase() }
    println(result)

    val list = (0..100).toList()
    modifyList(list) { println(it.sum()) }
}

fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}

inline fun modifyList(list: List<Int>, operator: (List<Int>) -> Unit) {
    return operator(list)
}