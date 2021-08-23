abstract class BaseUser {
    abstract val name: String
    abstract fun login()

    fun logout() {
        println("Logging out")
    }
}

class User13(override val name: String) : BaseUser() {

    override fun login() {
        println("Logging out")
    }
}