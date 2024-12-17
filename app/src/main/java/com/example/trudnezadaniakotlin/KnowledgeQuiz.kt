package com.example.trudnezadaniakotlin

interface Question {
    fun askQuestion(): String
    fun checkAnswer(answer: String): Boolean
}

class MultipleChoiceQuestion(
    private val questionText: String,
    private val options: List<String>,
    private val correctAnswer: String
) : Question {
    override fun askQuestion(): String {
        val optionsText = options.joinToString("\n") { "${options.indexOf(it) + 1}. $it" }
        return "$questionText\n$optionsText"
    }

    override fun checkAnswer(answer: String): Boolean {
        return answer.equals(correctAnswer, ignoreCase = true)
    }
}