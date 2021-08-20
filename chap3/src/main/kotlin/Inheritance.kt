open class User10(var firstName: String,
                  var lastName: String,
                  var birthYear: String)

class AdminUser(firstName: String,
                lastName: String,
                birthYear: String,
                var role: String) : User10(firstName, lastName, birthYear)

open class User11 {
    constructor(firstName: String,
                lastName: String,
                birthYear: String)
}

class AdminUser2 : User11 {
    constructor(firstName: String,
                lastName: String,
                birthYear: String,
                role: String) : super(firstName, lastName, birthYear)
}

// Overriding members
open class Base {
    open fun print() {
        println("I'm called from the base type")
    }
}

class Derived : Base() {
    override fun print() {
        println("I'm called from the super type")
    }
}

// members that have the override keyword are implicitly open, that is, they can be
// overridden by their subclasses.
// prevent further overriding
open class Derived2 : Base() {
    final override fun print() {
        println("I'm called from the super type")
    }
}

// Override properties
open class User12(open val name: String)

class AdminUser3(override var name: String) : User12(name)