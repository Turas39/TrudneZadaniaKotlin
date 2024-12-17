package com.example.trudnezadaniakotlin

interface Question {
    fun askQuestion(): String
    fun checkAnswer(answer: String): Boolean
}