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
}
