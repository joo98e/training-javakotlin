class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart : Wheel {

    var coin: Int
    val weight: String
        get() = "20KG"

    fun add(product: Product)
    fun rent() {
        if (coin > 0) {
            println("카트를 대여합니다")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다")
    }

    fun printId() = println("1234")
}

interface Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }

    fun printId() = println("5678")
}

class MyCart(override var coin: Int) : Cart, Order {
    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이 카드에 추가됐습니다.")
        super<Order>.add(product)
    }

    override fun printId() {
        super<Order>.printId()
        super<Cart>.printId()
    }
}

fun main() {
    val cart = MyCart(coin = 10)
    cart.rent()
    cart.roll()
    cart.printId()
    cart.add(Product(name = "장남감", price = 10000))
}