package domain.util.convertor

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