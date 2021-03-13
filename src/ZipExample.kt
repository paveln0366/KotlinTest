fun main() {
//    fun1()
//    fun2()
    fun3() // With OOP
}

fun fun1() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()

    for (i in 0..5) {
        names.add("Name $i")
        phones.add(375_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }

    val users = names.zip(phones)
    for (user in users) {
        println("${user.first} ${user.second}")
    }
}

fun fun2() {
    val fullNames = mutableListOf<String>()
    for (i in 0..5) {
        fullNames.add("Имя$i Фамилия$i")
    }
    val names = fullNames.map { it.substringBefore(" ") }
    val lastName = fullNames.map { it.substringAfter(" ") }
    val users = names.zip(lastName)
    for (user in users) {
        println("${user.first} ${user.second}")
    }
}

fun fun3() {
    val fullNames = mutableListOf<String>()
    for (i in 0..5) {
        fullNames.add("Имя$i Фамилия$i")
    }

    val users = fullNames.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }
    for (user in users) {
        println("${user.first} ${user.second}")
    }
}
