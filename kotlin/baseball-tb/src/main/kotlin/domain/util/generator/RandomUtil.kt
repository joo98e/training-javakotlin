package org.example.domain.util.generator

import kotlin.math.pow
import kotlin.random.Random

object RandomUtil {
    fun generateNumber(digits: Int = 3, ): Int {

        require(digits > 0) { "자리수는 최소 1 이상이어야 합니다." }

        val min = 10.0.pow(digits - 1).toInt()
        val max = 10.0.pow(digits).toInt() - 1

        return Random.nextInt(min, max + 1)
    }

    fun generateNumber(digits: Int = 3, test: Boolean): Int {
        require(digits > 0) { "자리수는 최소 1 이상이어야 합니다." }

        val min = 10.0.pow(digits - 1).toInt()
        val max = 10.0.pow(digits).toInt() - 1

        var generatedNumber: Int

        do {
            generatedNumber = Random.nextInt(min, max + 1)
        } while (!areDigitsUnique(generatedNumber))

        return generatedNumber
    }

    private fun areDigitsUnique(number: Int): Boolean {
        val digitSet = HashSet<Char>()
        val numberString = number.toString()

        for (char in numberString) {
            if (!digitSet.add(char)) {
                return false
            }
        }

        return true
    }
}