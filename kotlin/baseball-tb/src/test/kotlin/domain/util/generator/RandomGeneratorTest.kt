package domain.util.generator

import io.kotest.matchers.ints.shouldBeGreaterThanOrEqual
import io.kotest.matchers.ints.shouldBeLessThanOrEqual
import org.example.domain.util.generator.RandomUtil
import org.junit.jupiter.api.Test

class RandomGeneratorTest {
    @Test
    fun `자리수를 넘겨주면 랜덤의 숫자를 리턴한다`() {
        // given
        val DIGITS = 3

        // when
        val number = RandomUtil.generateNumber(DIGITS)

        // then
        number shouldBeGreaterThanOrEqual 100
        number shouldBeLessThanOrEqual 1000
    }
}