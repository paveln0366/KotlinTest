package oop.lesson_11_code_optimization

class Sportsman {
    fun callWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }
    inline fun invokeWaterBoy(bringWater: () -> Unit) {
        bringWater()
    }
}