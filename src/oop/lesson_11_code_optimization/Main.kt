package oop.lesson_11_code_optimization

fun main() {
    val sportsman = Sportsman()
//    sportsman.callWaterBoy(object : WaterBoy {
//        override fun bringWater() {
//            println("Несет воду")
//        }
//    })
    sportsman.invokeWaterBoy { println("Несет воду") }
}