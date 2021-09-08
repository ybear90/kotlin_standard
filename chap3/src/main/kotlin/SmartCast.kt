// whenever you check in an if or a when statement that a type can be cast to another type.
// the compiler then allows you to access all members from the target type.(type casting)
// Rules : The compiler has to be sure that a variable will not change after the instance of check.
// (immutable properties), and local variables that are not accessed inside a closure
open class BaseUser(val name: String)

open class User15(name: String, val birthYear: Int) : BaseUser(name) {

    fun login() {
    }
}

open class AdminUser(name: String, birthYear: Int) : User15(name, birthYear) {

    fun accessLogs() {
    }
}

// 사용 예시
fun smartCasting(baseUser: BaseUser) {
    if (baseUser is User15) {
        baseUser.login()
    } else if (baseUser is AdminUser) {
        baseUser.accessLogs()
    }
}