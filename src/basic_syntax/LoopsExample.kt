fun main() {
//    arrayTest1()
//    arrayTest2()
//    arrayTest3()
//    arrayTest4()
    arrayTest5()
}

fun arrayTest5() {
    val array = arrayOfNulls<Int?>(301)

    for ((index, i) in (300..600).withIndex()) {
        array[index] = i
    }

    for (i in array.size - 1 downTo 0 step 5) {
    print(array[i])
    }
}

fun arrayTest4() {
    val array = arrayOfNulls<Int?>(5)
    for (i in 0..4) {
        array[i] = i
    }

    for ((index, i) in array.withIndex()) {
        array[index] = i?.times(2)
    }

    for (i in array) {
        println(i)
    }
}

fun arrayTest3() {
    // Вывести элемент в массиве в обратном порядке с шагом 2
    val array = arrayOf(1, 2, 3, 4 ,5)
    for (i in 4 downTo 0 step 2) {
        println(array[i])
    }
}

fun arrayTest2() {
    // Заполнить и вывести массив
    val array = arrayOfNulls<Int?>(5)
    for (i in array.indices) {
        array[i] = i
        println(i)
    }
}

fun arrayTest1() {
    // Вывести массив
    val array = arrayOf(1, 2, 3, 4, 5)
    for (i in array) {
        println(i)
    }
}