package domain.baseball.resulttype

sealed class NumberBaseballMatchupResultType(
    desc: String,
) {
    class S(val count: Int) : NumberBaseballMatchupResultType("스트라이크")
    class B(val count: Int) : NumberBaseballMatchupResultType("볼")
}