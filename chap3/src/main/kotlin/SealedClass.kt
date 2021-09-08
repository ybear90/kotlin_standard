// similar to enum class; use them to define a fixed set of options
// unlike enum class, sealed class can have multiple instances for each option.
// sealed class hierarchy used with a when statement:
sealed class SuperHero

class Hulk: SuperHero() {
    fun smashOpponent() {

    }
}

class SuperMan: SuperHero() {
    fun flyToKrypton() {

    }
}

class SpiderMan: SuperHero() {
    fun useSpiderSense() {

    }
}

fun actOnHero(hero: SuperHero) {
    when (hero) {
        is Hulk -> {
            hero.smashOpponent()
        }

        is SuperMan -> {
            hero.flyToKrypton()
        }

        is SpiderMan -> {
            hero.useSpiderSense()
        }
    }
}

// compiler will not alow you to create an instance of it
// cannot have non-private constructors(because its constructor is private by default)