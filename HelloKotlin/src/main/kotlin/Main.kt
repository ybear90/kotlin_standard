import java.io.*
import java.lang.Math.PI

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

    // Nullable operator
    var nullable: String? = null

    // if-else
    val num = 0
    val str: String = if (num < 10) "Lower than 10" else "Equal or greater than 10"

    // For loops
    for (i: Int in 0..10) {
        println(i)
    }

    if (5 in 1..10) print("5 found in range")

    for (i in 0..10) {
        println(i)
    }

    // same syntax (loop)
    val array = arrayOf(1, 2, 3)
    for (i in array) println(i)

    // not include the last num
    for (i in 1 until 5) {
        println(i)
    }

    // while loop
    var i = 0
    while (i < 10) {
        println("value is $i")
        i += 1
    }

    // do-while
    do {
        println("This will be printed only once")
    } while (false)

    // Exceptions
    val file = File("foo")
    var stream: OutputStream? = null
    try {
        stream = file.outputStream()
        // do something with stream
    } catch (ex: FileNotFoundException) {
        println("File doesn't exist")
    } finally {
        if (stream != null) stream.close()
    }
    
    // throw ex
    if (num !in 1..10) throw IllegalArgumentException("Number has to be from 1 to 10")

//    val divide = if (divisor > 0) {
//        value / divisor
//    } else {
//        throw IllegalArgumentException("Can't divide with 0")
//    }

    // Equality comparison
    val a = "Kotlin"
    val b = "Kotlin"
    val c = "Java"
    println("Strings a and b are equal in content: ${a == b}")
    println("Strings b and c are equal in content: ${b == c}")
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
//fun printUserDetails(user: User) {
//    fun tryPrint(str: String) {
//        if (str.length > 5) {
//            println(str)
//        } else {
//            println("I print strings with more than 5 characters")
//        }
//    }
//    tryPrint(user.firstName)
//    tryPrint(user.lastName)
//    tryPrint(user.address)
//}

// null check function by using safe call operator
fun safeCall(str: String?) {
    val upperCase: String? = str?.toUpperCase()
}

// non-null assertions
fun nonNullAssertion(str: String?) {
    val nonNullString = str!!
    val upperCase: String = nonNullString.toUpperCase()
    println(upperCase)
}

// elvis operator '?:'
fun elvisOperator(str: String?) {
    val upperCase = str?.toUpperCase() ?: ""
}

// chaining elvis operator
fun chainingElvisOperator(first: String?, second: String?) {
    val upperCase = first?.toUpperCase() ?: second?.toUpperCase() ?: ""
}

// Casting example func
fun casting(any: Any) {
    val num = any as Int
}

// Safe Casting
fun safeCasting(any: Any) {
    val num: Int? = any as? Int
}

// Safe Casting with elv
fun safeCastingWithElvis(any: Any) {
    val num: Int = any as? Int ?: 0
}

// when : similar as switch in another language
fun checkNumbers(num: Int) {
    when(num) {
        // 1 -> println("Number is 1")
        // 2, 3, 4, 5 -> println("Number is in range from 2 to 5")
        1 -> "Number is 1"
        2, 3, 4, 5 -> "Number is in range from 2 to 5"
        else -> "Number is higher than 5"
    }
}

// when can also accept type checking.(InOtherWords it can check types)
fun whenAny(any: Any) {
    when (any) {
        is Int -> println("This is an Int type")
        is Double -> println("This is a Double type")
        is String -> println("This is a String type")
    }
}

// when without arguments
fun whenWithoutArgument(a: Int, b: Int) {
    when {
        a * b > 100 -> println("product of a and b is more than 100")
        a + b > 100 -> println("sum of a and b is more than 100")
        a < b -> println("a is less than b")
    }
}

// reverse iterate loop
fun downToLoop() {
    for (i in 5 downTo 1) {
        println(i)
    }
}

// import ex
 fun circumference(radius: Double): Double {
     return 2 * PI * radius
 }