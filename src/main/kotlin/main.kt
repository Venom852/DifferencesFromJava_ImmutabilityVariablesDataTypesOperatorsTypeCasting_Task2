package ru.netology

fun main() {
    val likes = 4511

    if ((likes).toString().last() == '1' && (likes).toString().takeLast(2) != "11") {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}