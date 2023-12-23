package org.example.domain.baseball.dto

import domain.baseball.resulttype.NumberBaseballMatchupResultType

data class NumberBaseballMatchupResult(
    val strike: NumberBaseballMatchupResultType.S?,
    val ball: NumberBaseballMatchupResultType.B?,
    val out: Boolean,
) {
    companion object {
        fun of(strike: Int, ball: Int): NumberBaseballMatchupResult {
            val isOut = strike == 0 && ball == 0
            return if (isOut) {
                NumberBaseballMatchupResult(
                    strike = null,
                    ball = null,
                    out = true,
                )
            } else NumberBaseballMatchupResult(
                strike = NumberBaseballMatchupResultType.S(strike),
                ball = NumberBaseballMatchupResultType.B(ball),
                out = false,
            )
        }
    }
}