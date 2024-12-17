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

