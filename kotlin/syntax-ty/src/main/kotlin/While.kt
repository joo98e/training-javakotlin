fun main() {
    val b: String? = null
    val c = b ?: failFast("a is null")
    println(c.length)
}

fun failFast(message: String): String {
    return message
}