package com.example.trudnezadaniakotlin

import kotlin.random.Random

interface RollingTool {
    fun roll(): String
}

class Coin : RollingTool {
    override fun roll(): String {
        return if (Random.nextBoolean()) "Orzeł" else "Reszka"
    }
}

class Dice : RollingTool {
    override fun roll(): String {
        return (1..6).random().toString()
    }
}

fun main() {
    println("Witaj drogi użytkowniku w symulatorze rzutu monetą i kością!")

    while (true) {
        println("Wybierz opcje:")
        println("1. Rzut monetą")
        println("2. Rzut kością")
        println("3. Wyjście")

        println("Twój wybór: ")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                val coin = Coin()
                println("Wynik rzutu monetą: ${coin.roll()}")
            }
            2 -> {
                val dice = Dice()
                println("Wynik rzutu kostką: ${dice.roll()}")
            }
            3 -> {
                println("Żegnaj!")
                break
            }
            else -> println("Zły wybór, spróbuj ponownie")
        }
    }
}