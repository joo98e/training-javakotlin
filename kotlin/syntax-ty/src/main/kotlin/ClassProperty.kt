class Coffee(
    var name: String = "",
    var price: Int = 0,
) {
    val brand: String
        get() = "스타벅스"


    var quantity: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    fun aaa() = 1 + 2
}

fun main() {
    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = 1
    println(coffee.name)
    println("${coffee.brand} 브랜드 ${coffee.name} 가격은 ${coffee.price} 수량은:${coffee.quantity}")
}

