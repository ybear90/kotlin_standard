object Singleton {
    fun sayMyName() {
        println("I'm a singleton")
    }
}

fun main(args: Array<String>) {
    Singleton.sayMyName()
}

object RunnableSingleton: Runnable {
    override fun run() {
        println("I'm a runnable singleton")
    }
}

class Outer {
    object Singleton {

    }
}

object SingletonWithInitializer {
    var name = ""

    init {
        name = "Singleton"
    }
}