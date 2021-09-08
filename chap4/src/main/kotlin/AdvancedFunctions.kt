fun main(args: Array<String>) {
    val str = "foo"
    val match = str.regionMatches(thisOffset = 0, other = "foo", otherOffset = 0,
                                length = 3, ignoreCase = true)
    // compile error
    // val match = str.regionMatches(3, "foo", otherOffset = 0, 3, true)
    // possible
    // val match = str.regionMatches(3, "foo", otherOffset = 0, length = 3,
    //                               ignoreCase = true)

    // reverse order could be as follows.
    val user = User(birthYear = 1955, lastName = "Wayne", firstName = "Bruce")

    // Default parameters
    fun indexOf(ch: Int, fromIndex: Int = 0) {}

    // Java doesn't have default argument values, they can only be used in functions defined in Kotlin
    // if you wanna use take @JvmOverloads
//    @JvmOverloads
//    fun createUser(name: String, phoneNumber: String = "", loggedIn: Boolean = false) : User2 {
//        return User2(name, phoneNumber, loggedIn)
//    }

    // Variable function arguments apply
    val result = sumNumbers(1, 2, 3, 4, 5)

    val nums = intArrayOf(1, 2, 3, 4, 5)
    val result2 = sumNumbers(*nums)
}

// Named arguments can also be used on class constructors.
class User(private val firstName: String,
           private val lastName: String,
           private val birthYear: Int)

// Default argument values can also be used in class constructors.
class User2 {

    constructor(name: String) : this(name, null)

    constructor(name: String,
                phoneNumber: String?) : this(name, phoneNumber, false)

    constructor(name: String,
                phoneNumber: String?,
                isLoggedIn: Boolean) {

    }
}
// Simplify
class User3(name: String,
            phoneNumber: String? = null,
            isLoggedin: Boolean = false) {

}

// Variable function arguments
// apply the vararg
fun sumNumbers(vararg num: Int) : Int {
    var result = 0
    for (i in num) {
        result += i
    }

    return result
}