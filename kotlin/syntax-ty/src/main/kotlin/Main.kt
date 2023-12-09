package org.example

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.

var topVal = 3;

val day = 2;


val result = when (day) {
    1 -> "요일"
    2 -> "화요일"
    3 -> "수요일"
    4 -> "목요일"
    else -> "기타"
}


fun sumDefault(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Int, b: Int): String {
    val s = "${a + b}zzz"
    return s
}

fun greeting() {
    when(getColor()) {
        Color.RED -> print("red")
        Color.GREEN -> println("green")

    }

}


enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED

fun main() {
    println(result)
    greeting()
    val test = Test()
    println(test.test1)

    val a: Int = 1
    val b = 1
    val c: Int

    var d: String = "Hello"
    d = "World"

    var f = 123

    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    //TIP click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    // To <b>Run</b> code, press <shortcut actionId="Run"/> or
    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}