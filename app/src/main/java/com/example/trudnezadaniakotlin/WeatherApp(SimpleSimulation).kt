package com.example.trudnezadaniakotlin

interface Weather {
    fun displayForecast() : String
}

class Sunny : Weather {
    override fun displayForecast(): String {
        return "Pogoda jest słoneczna i bezchmurna. Idealny dzień na spacer!"
    }
}

class Rainy : Weather {
    override fun displayForecast(): String {
        return "Na zewnątrz jest chłodno, trochę wietrznie i pada mocny deszcz. Nie zapomnij parasolki!"
    }
}
class Snowy : Weather {
    override fun displayForecast(): String {
        return "Pada intensywny śnieg, jest zimno, a droga jest zamarznięta. Na twoim miejscu założyłbym czapkę!"
    }
}

data class City(val name: String, val weather: Weather)

fun main() {
    val cities = listOf(
        City("Jonkowo", Snowy()),
        City("Olsztyn", Sunny()),
        City("Orneta", Rainy()),
        City("Kaplityny", Snowy()),
        City("Łukta", Rainy())
    )
}