package oop.lesson_1_get_set

class Dog {
    var name = ""
    get() = field.toLowerCase().capitalize()

    var age = 0f
    set(value) {
        if (value >= 0) {
            field = value
        }
    }

    var weight = 0
    set(value) {
        if (value >= 0) {
            field = value
        }
    }

}