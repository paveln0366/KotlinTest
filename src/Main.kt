fun main() {
    var count = 400

    val food = if (count > 500) {
        count -= 500
        "Пицца"
    } else if (count > 300) {
        count -= 300
        "Шаурма"
    } else {
        count -= 30
        "Доширак"
    }

    println("Вы можете себе позволить купить следующий продукт: ${food.length},  у вас осталось $count рублей");
}