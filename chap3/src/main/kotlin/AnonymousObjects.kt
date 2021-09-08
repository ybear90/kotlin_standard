Thread(object : Runnable {
    override fun run() {
        println("I'm created with anonymous")
    }
}).run()

// syntax for creating anonymous objects is similar to Singleton objects.(name in most cases is not needed)
// also can initialize  a variable with it.
val runnable = object : Runnable {
    override fun run() {
        println("I'm created with anonymous object")
    }
}

// anonymous class of an abstract class
fun main() {
    val writer = object : Writer() {
        override fun write(cbuf: CharArray, off: Int, len: Int) {
            // implementation omitted
        }

        override fun flush() {
            // implementation omitted
        }

        override fun close() {
            // implementation omitted
        }
    }
}



