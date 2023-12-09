open class Dog {
    open var age: Int = 0
    open fun bark() {
        println("멍멍")
    }
}


open class Bulldog(override var age: Int = 0) : Dog() {
    fun test() {
        println(2323)
    }

    override fun bark() {
        println("342342")
        super.bark()
    }
}

class ChildBulldog : Bulldog() {
    override var age: Int = 0
    override fun bark() {
        super.bark()
    }

}

abstract class Developer {
    abstract var age: Int
    abstract fun code(language: String)
    open fun test() {
        println(323322)
    }
}

interface IDeveloper {
    fun test() {
        println(323322)
    }
}

class BackendDeveloper(override var age: Int) : Developer() {

    override fun code(language: String) {
        println("I ode with $language")
    }



}

fun main() {

    val backendDeveloper = BackendDeveloper(age = 6)
    backendDeveloper.test()
    println(backendDeveloper.age)
    backendDeveloper.code("kotlin")
//    val bulldog = Bulldog(age = 6)
//
//    println(bulldog.age)
//    bulldog.bark()
//    bulldog.test()
}