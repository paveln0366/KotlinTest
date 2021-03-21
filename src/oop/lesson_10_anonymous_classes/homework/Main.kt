package oop.lesson_10_anonymous_classes.homework

fun main() {
    val sportsman = Sportsman()
    sportsman.callWaterBoy(object : WaterBoy {
        override fun bringWater() {
            println("Несет воду")
        }
    })
}