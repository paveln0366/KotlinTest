package oop.lesson_16_generic_functions_lateinit_var

fun main() {
    val list: MyList<String> = MyArrayList.myListOf()
    for (i in 0..100) {
        list.add("$i")
    }

    for (i in 0..90) {
        list.removeAt(0)
    }

    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}