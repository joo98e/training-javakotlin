package org.example.domain.util.generator

import kotlin.math.pow
import kotlin.random.Random

object RandomUtil {
    fun generateNumber(digits: Int = 3): Int {
        require(digits > 0) { "자리수는 최소 1 이상이어야 합니다." }

        val min = 10.0.pow(digits - 1).toInt()
        val max = 10.0.pow(digits).toInt() - 1

        return Random.nextInt(min, max + 1)
    }
}