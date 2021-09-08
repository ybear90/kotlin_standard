class User14 private constructor(val userId: String) {
    companion object {
        fun newUserWithEmail(email: String) : User14 {
            return User14(email)
        }

        fun newUserFromUUID(uuid: UUID) : User14 {
            return User14(uuid.toString())
        }
    }
}

// companion objects의 접근 방법은 다음과 같다
fun main() {
    val userFromEmail = User14.newUserWithEmail("john@mail.com")
    val userFromUUID = User14.newUserFromUUID(UUID.randomUUID())
}

// companion 객체 또한 이름을 가질 수 있다
class Outer {
    // Outer.saySomething() 또한 가능
    companion object Inner {
        fun saySomething() {
            print("Hello")
        }
    }
}

// Static with companion objects
class Static {
    companion object {
        // static method, Java와 같이 사용시 annotation 명시
        @JvmStatic
        fun staticFunction() {

        }

        // static field
        @JvmField
        val staticField = 0
    }
}