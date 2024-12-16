package com.example.trudnezadaniakotlin

import kotlin.random.Random

object Quotes {
    private val quotesList: MutableList<String> = mutableListOf(
        "Proponuję partyjkę gwinta.",
        "Głupiś. Elf z cebulą dobry. Jak pomidor.",
        "Widzę, że niektóre rzeczy się nie zmieniają. Night City to ciągle syf i kluski z paśnika."
    )

    fun getRandomQuote(): String {
        if (quotesList.isEmpty()) {
            return "Brak dostępnych cytatów."
        }
        return quotesList[Random.nextInt(quotesList.size)]
    }

    fun addQuote(quote: String) {
        if (quote.isNotBlank()) {
            quotesList.add(quote)
        }
    }
}

fun main() {
    println("Witaj w aplikacji do cytatów!")

    while (true) {
        println("Wybierz opcję: ")
        println("1. Wyświetl losowy cytat")
        println("2. Dodaj nowy cytat")
        println("3. Wyjście")

        when (readLine()?.trim()) {
            "1" -> println("Losowy cytat: ${Quotes.getRandomQuote()}")
            "2" -> {
                println("Napisz cytat który chcesz dodać: ")
                val newQuote = readLine()
                if (newQuote != null && newQuote.isNotBlank()) {
                    Quotes.addQuote(newQuote)
                    println("Udało ci się dodać nowy cytat")
                } else {
                    println("Niepoprawny cytat. Spróbuj ponownie.")
                }
            }
            "3" -> {
                println("Żegnaj!")
                break
            }
            else -> println("Zła opcja. Spróbuj ponownie.")
        }

    }
}
