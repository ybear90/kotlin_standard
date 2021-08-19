fun main(args: Array<String>) {

    val result: Int = add(1, 1)

    println("Hello World!: " + result)
    println("Hello another World!: " + addAsExpression(2, 3))

    printToConsole("Kim Jun Su")

    val bar: String
    if (true) {
        bar = "Foo"
    } else {
        bar = "Bar"
    }
}

fun add(a: Int, b: Int): Int {
    val result: Int = a + b
    return result
}

fun addAsExpression(a: Int, b: Int): Int = a + b

// a function that doesn't return a result(void function)
fun printToConsole(input: String): Unit {
    println(input)
}

// mutable, immutable
fun immutable() {
    val bar: String = "Kotlin"
    // bar = "Kotlin is Awesome" // compile error
}

fun mutable() {
    var bar: String = "KKotlin"
    bar = "Kotlin is Awesome"
}

// Local functions
fun printUserDetails(user: User) {
    fun tryPrint(str: String) {
        if (str.length > 5) {
            println(str)
        } else {
            println("I print strings with more than 5 characters")
        }
    }
    tryPrint(user.firstName)
    tryPrint(user.lastName)
    tryPrint(user.address)
}