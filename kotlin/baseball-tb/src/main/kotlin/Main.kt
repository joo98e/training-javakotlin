package org.example

import org.example.domain.baseball.constants.BaseballMessageBundle
import org.example.domain.baseball.numberbaseball.NumberBaseball
import org.example.domain.input.actor.InputLine
import org.example.domain.output.actor.OutputLine
import org.example.domain.util.generator.RandomUtil

fun main(args: Array<String>) {

    OutputLine.notice(BaseballMessageBundle.start)

    val numberBaseball = NumberBaseball(RandomUtil.generateNumber())

    OutputLine.notice(BaseballMessageBundle.numericRequest)
    val numericValue = InputLine.getNumericValue()
}