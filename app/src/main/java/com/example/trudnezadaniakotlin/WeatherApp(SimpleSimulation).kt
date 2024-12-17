package com.example.trudnezadaniakotlin

interface Weather {
    fun displayForecast() : String
}

class Sunny : Weather {
    override fun displayForecast(): String {
        return "Pogoda jest słoneczna i bezchmurna. Idealny dzień na spacer!"
    }
}
