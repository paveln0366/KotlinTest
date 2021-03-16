fun main() {
    val indexOfMonth = 2
    val season = when(indexOfMonth) {
        12, 1, 2 -> {
            "Зима"
        }
        in 3..5 -> {
            "Весна"
        }
        in 6..8 -> {
            "Лето"
        }
        in 9..11 -> {
            "Осень"
        }
        else -> {
            "Не найдено!"
        }
    }
    println(season);
    waterState()
    goodDay()
}

fun goodDay() {
    val time = 23
    val weatherIsGood = true
    val result = when {
        time in 6..22 && weatherIsGood -> {
            "Идем гулять"
        }
        time in 6..22 && !weatherIsGood -> {
            "Учить программирование"
        }
        else -> {
            "Спать"
        }
    }
    println(result)
}

fun waterState() {
    val temp = 50
    val state = when {
        temp < 0 -> "Твердое"
        temp in 0..100 -> "Жидкое"
        else -> "Газообразное"
    }
    println(state)
}