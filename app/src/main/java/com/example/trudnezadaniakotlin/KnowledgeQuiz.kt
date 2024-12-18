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

class TrueFalseQuestion(
    private val questionText: String,
    private val correctAnswer: Boolean
) : Question {

    override fun askQuestion(): String {
        return "$questionText\n1. Prawda\n2. Fałsz"
    }

    override fun checkAnswer(answer: String): Boolean {
        return when(answer.lowercase()) {
            "prawda" -> correctAnswer
            "fałsz" -> !correctAnswer
            else -> false
        }
    }
}

class Quiz(private  val questions: List<Question>) {

    fun startQuiz() {
        var correctAnswers = 0

        for (question in questions) {
            println(question.askQuestion())
            val userAnswer = readLine() ?: ""
            if (question.checkAnswer(userAnswer)) {
                println("Poprawna odpowieź!")
                correctAnswers++
            } else {
                println("Błędna odpowiedź")
            }
        }

        println("Twój wynik: $correctAnswers/${questions.size}")
    }
}

fun main() {
    val questions = listOf(
        MultipleChoiceQuestion(
            "Kto jest autorem cyklu książek Wiedźmin?",
            listOf("J.R.R. Tolkien", "Andrzej Sapkowski", "Mike Tyson", "J.K. Rowling"),
            "Andrzej Sapkowski"
        ),
        TrueFalseQuestion(
            "Jedną z głównych rol w grze Cyberpunk 2077 zagrał Keanu Reeves?",
            true
        ),
        MultipleChoiceQuestion(
            "Kto jest najstarszym synem Ragnara Lothbroka w serialu Wikingowie?",
            listOf("Sigurd Wężowe Oko", "Ivar Bez Kości", "Ubbe", "Bjorn Żelaznoboki", "Hvitserk"),
            "Bjorn Żelaznoboki"
        )
    )

    val quiz = Quiz(questions)
    quiz.startQuiz()
}