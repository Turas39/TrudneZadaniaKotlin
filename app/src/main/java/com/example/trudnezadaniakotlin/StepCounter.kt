package com.example.trudnezadaniakotlin

class StepCounter {
    companion object {
        var stepCount: Int = 0
            private set

        fun resetCounter() {
            stepCount = 0
        }
    }

    fun makeStep() {
        stepCount++
    }
}

fun main() {
    val stepCounter = StepCounter()

    stepCounter.makeStep()
    stepCounter.makeStep()
    stepCounter.makeStep()

    println("Liczba kroków: ${StepCounter.stepCount}")

    StepCounter.resetCounter()
    println("Liczba kroków po resecie: ${StepCounter.stepCount}")
}