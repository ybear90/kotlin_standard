// Data Class
data class User9(var firstName: String,
                 var lastName: String,
                 var birthYear: String)

// main test
fun main(args: Array<String>) {
    val user = User9("Bruce", "Wayne", "1965")
    val userCopy = user.copy("John") // user.copy(firstName = "John")s
}