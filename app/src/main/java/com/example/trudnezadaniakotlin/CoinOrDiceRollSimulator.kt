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