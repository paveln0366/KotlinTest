var name: String? = null
var testList: MutableList<Int>? = mutableListOf()

fun main() {
    letFun()
    withFun()
    testFun()
}

fun letFun() {
    name?.let {
        if (it.length > 5) {
            println("name > 5")
        }
    }
}

fun withFun() {
    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0 until 10) {
            this.add((Math.random() * 100).toInt())
        }
        println(sum())
        println(average())
        println(minOrNull())
        println(maxOrNull())
        println(first())
        println(last())
    }
}

fun testFun() {
    testList?.let {
        with(it) {
            for (i in 0 until 10) {
                add((Math.random() * 100).toInt())
            }
            val result = filter { it % 2 == 0 }.take(100)
            for (i in result) {
                print("$i ")
            }
        }
    }
}