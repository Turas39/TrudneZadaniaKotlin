package com.example.trudnezadaniakotlin

data class Match(var score: Int)

class MatchAnalyzer(val matches: MutableList<Match> = mutableListOf()) {

    fun addMatch(score: Int) {
        matches.add(Match(score))
    }

    fun filterMatchesAboveThreshold(threshold: Int): List<Match> {
        return matches.filter { it.score > threshold }
    }

    fun addBonusPoints(bonus: Int) {
        matches.forEach { it.score += bonus }
    }

    fun sumScores(): Int {
        return matches.sumOf { it.score }
    }

    fun maxScore(): Int? {
        return matches.maxOfOrNull { it.score }
    }

    fun scoreDifference(): Int? {
        val max = matches.maxOfOrNull { it.score }
        val min = matches.minOfOrNull { it.score }
        return  if (max != null && min != null) max - min else null
    }

    fun countMatchesAboveThreshold(threshold: Int): Int {
        return matches.count { it.score > threshold }
    }
}

fun main() {
    val matchAnalyzer = MatchAnalyzer()

    matchAnalyzer.addMatch(75)
    matchAnalyzer.addMatch(80)
    matchAnalyzer.addMatch(60)
    matchAnalyzer.addMatch(90)
    matchAnalyzer.addMatch(50)

    val filteredMatches = matchAnalyzer.filterMatchesAboveThreshold(70)
    println("Mecze powyżej 70 punktów: ${filteredMatches.map { it.score }}")

    matchAnalyzer.addBonusPoints(5)
    println("Wyniki po dodaniu bonusu: ${matchAnalyzer.matches.map { it.score }}")

    val totalScore = matchAnalyzer.sumScores()
    println("Suma wyników: $totalScore")

    val maxScore = matchAnalyzer.maxScore()
    println("Maksymalny wynik: $maxScore")

    val scoreDiff = matchAnalyzer.scoreDifference()
    println("Różnica między maksymalnym a minimalnym wynikiem: $scoreDiff")

    val countAbove = matchAnalyzer.countMatchesAboveThreshold(80)
    println("Liczba meczów powyżej 80 punktów: $countAbove")
}