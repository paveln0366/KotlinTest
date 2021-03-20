package oop.lesson_7_enum_class

import oop.lesson_7_enum_class.Month.*
import oop.lesson_7_enum_class.Season.*

fun main() {
    val month = SEPTEMBER
    val season = when (month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }
    println(month.tempAverage)
    println(season)
}