package org.example.domain.input.actor

import org.example.domain.util.validate.ValueConvertor

class InputLine {
    companion object {
        fun getNumericValue(): Int {
            val readLine: String = readlnOrNull() ?: ""
            return ValueConvertor.toNumeric(readLine)
        }
    }
}