package org.example.domain.input.actor

import domain.util.convertor.ValueConvertor

class InputLine {
    companion object {
        fun getNumericValue(): Int {
            val readLine: String = readlnOrNull() ?: ""
            return ValueConvertor.toNumeric(readLine)
        }
    }
}