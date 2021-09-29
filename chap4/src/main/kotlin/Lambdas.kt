import java.util.function.IntPredicate
import javax.swing.text.View

fun main (args: Array<String>) {

    // button.setOnClickListener({ v: View -> println("Clicked on: $v") })
    // button.setOnClickListener { v -> println("Clicked on: $v") }
    { a: Int, b: Int -> a + b }

    // Kotlin closure
    var a = 0
    val closure = {
        a++
    }
    // println(returnStatement())

    // Defining function types
    val multiplier: (Int, Int) -> Int = { a, b -> a * b }
    val print: () -> Unit = { println("Kotlin") } // no parameter return type

    val print2 = { println("Kotlin") } // type inference works on function types

    val nullableFun: (() -> Unit)? = null

    val nullableReturnType: () -> String? = { null }

    // Naming parameters of function types
    longRunningTask2( { result -> println("Result: $result") }, { fail ->
        println("Error: ${fail.message}") })

    longRunningTask2( { r -> println("Result: $r") }, { err ->
        println("Error: ${err.message}") }) // or you can use your own names, as you can see here:
}

// Returning from lambdas
fun returnStatement() {
    val nums = arrayOf(1, 2, 3, 4, 5)
    println("Started iterating the array")
    nums.forEach { n ->
        if (n > 2) {
            return@forEach
        }
    }

    println("Finished iterating the array")
}

// Calling function types
fun longRunningTask(onFinished: (Any) -> Unit, onError: (Throwable) -> Unit) {
    try {
        // something long running
        onFinished("got result")
    } catch (fail: Throwable) {
        onError(fail)
    }
}

fun longRunningTask2(onFinished: (result: Any) -> Unit,  onError: (fail: Throwable) -> Unit) {
    try {
        // something long running
        onFinished.invoke("got result") // can also be used to call a function type, like this  example shows
    } catch (fail: Throwable) {
        onError.invoke(fail)
    }
}

// Calling function types from Java
fun applyLambda(a: Int, b: Int, modifierFunc: (Int, Int) -> Int) {
    val result = modifierFunc(a, b)
    println("Result of applying a function: $result")
}

// Lambdas and SAM types
fun createPredicate(): IntPredicate {
    return IntPredicate { n -> n % 2 == 0 }
}

// Member reference

class MemberReference {
    //var numFunc: (Int, Int) -> Int = {
    //    a, b -> multiplier(a, b)
    //}
    //var numFunc: (Int, Int) -> Int = this::multiplier // 왜 에러가 나지 ?
    //var numFunc: (Int, Int) -> Int = ::multiplier

    fun multiplier(a: Int, b: Int): Int {
        return a * b
    }

    // this member function has to have the same signature as the function type that is being initialized;
    // otherwise, you'd get a compiler err:
    // compiler err
    //var numFunc: (Int, Int) -> Int = this::printNum
    // not Int
    // fun printNums(a: Int, b: Int) {
    //     println("$a and $b")
    // }

    // if you want to use a function from some other object to initialize a function type variable,
    // you just have to set the name of the object variable on the left-hand side of the :: operator
    var str = "Kotlin"
    val getChar: (Int) -> Char = str::get

    // Member reference can also be used to get a reference to a class constructor.
    // we can store a reference to it and invoke it later
    class Person(val name: String)
    val personConstructor = ::Person

    // we can invoke a person constructor function type and we'll get an instance of the `Person` type.
    val person: Person = personConstructor("John")
}

// Inline, Noinline, Crossinline
// there is also the overhead of allocating memory on the heap, since function types are objects. -> Using inline keyword
// Inlining can be described as moving the functionality of a called function to its caller function.
fun noInline(func: () -> String) {
    val str = func()
    println("Func produced: $str")
}

inline fun inlined(func: () -> String) {
    val str = func()
    println("Func produced: $str")
}
