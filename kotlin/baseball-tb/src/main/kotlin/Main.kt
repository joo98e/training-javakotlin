package org.example

import org.example.domain.baseball.constants.BaseballMessageBundle
import org.example.domain.input.actor.InputLine
import org.example.domain.output.actor.OutputLine

fun main(args: Array<String>) {

    OutputLine.notice(BaseballMessageBundle.numericRequest)
    val numericValue = InputLine.getNumericValue()

    println(numericValue)
}