package oop.lesson_16_generic_functions_lateinit_var

class Dog {
    private lateinit var a: String
    fun printA() {
        a = "123"
        println(a)
    }
}