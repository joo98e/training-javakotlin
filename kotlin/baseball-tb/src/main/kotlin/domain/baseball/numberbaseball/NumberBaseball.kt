package org.example.domain.baseball.numberbaseball

import org.example.domain.baseball.dto.NumberBaseballMatchupResult

class NumberBaseball(
    correct: Int,
) {
    private var correctInts: List<Int>

    init {
        this.correctInts = correct.toString().map { it.toString().toInt() }
    }

    fun matchup(attemptNumber: Int): NumberBaseballMatchupResult {
        var strike: Int = 0
        var ball: Int = 0

        val attemptNumberToString = attemptNumber.toString().map { it.toString().toInt() }


        return NumberBaseballMatchupResult.of(strike = strike, ball = ball)
    }
}