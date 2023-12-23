package domain.baseball.numberbaseball

import org.example.domain.baseball.numberbaseball.NumberBaseball
import org.example.domain.util.generator.RandomUtil
import org.junit.jupiter.api.Test

class NumberBaseballTest {

    @Test
    fun `test` () {
        val numberBaseball = NumberBaseball(RandomUtil.generateNumber())

        numberBaseball.matchup(123)
    }
}