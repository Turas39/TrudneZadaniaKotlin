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