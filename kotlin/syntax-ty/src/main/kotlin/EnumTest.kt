enum class PaymentStatus(val label: String): Payable {
    UNPAID("미지급") {
        override fun isPayable(): Boolean {
            return true
        }
    },
    PAID("지급완료") {
        override fun isPayable(): Boolean {
            return false
        }
    },
    FAILED("지급실패") {
        override fun isPayable(): Boolean {
            return false
        }
    },
    REFUNDED("환불") {
        override fun isPayable(): Boolean {
            return false
        }
    };


}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
    println(PaymentStatus.UNPAID.isPayable())

    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus == PaymentStatus.PAID )

    for (status in PaymentStatus.values()) {
        println("[${status.name}](${status.label}) : ${status.ordinal}")
    }
}