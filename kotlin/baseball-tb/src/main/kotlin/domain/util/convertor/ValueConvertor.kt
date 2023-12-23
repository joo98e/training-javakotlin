package org.example.domain.util.validate

class ValueConvertor {
    companion object {
        fun toNumeric(value: String): Int {
            return try {
                value.toInt()
            } catch (e: NumberFormatException) {
                throw NumberFormatException("숫자로 입력하세요.")
            }
        }
    }
}