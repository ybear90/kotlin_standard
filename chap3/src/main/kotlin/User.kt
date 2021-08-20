class User(firstName: String,
           lastName: String,
           birthYear: Int) {
    var firstName: String
    var lastName: String
    var birthYear: Int

    init {
        println("Calling constructor of User class")
        this.firstName = firstName
        this.lastName = lastName
        this.birthYear = birthYear
    }
}

// Also possible
class User2(firstName: String,
            lastName: String,
            birthYear: Int) {
    var firstName: String = firstName
    var lastName: String = lastName
    var birthYear: Int = birthYear
}

// MultipleInits
class MultipleInits {
    private var counter = 1

    init {
        // called first
        println("I'm called $counter time(s)")
    }

    init {
        // called second
        println("I'm called $counter time(s)")
    }
}

// Secondary constructors
class User3 {
    constructor(firstName: String,
                lastName: String,
                birthYear: Int) {

    }
}

class User4(firstName: String,
            lastName: String) {

    constructor(firstName: String,
                lastName: String,
                birthYear: Int) : this(firstName, lastName) {

    }
}

class User5 {
    constructor(firstName: String,
                lastName: String) {

    }

    constructor(firstName: String,
                lastName: String,
                birthYear: Int) {

    }
}

// Nested Class
class User6(val name: String) {
    class Address(val street: String,
                  val streetNumber: String,
                  val zip: String,
                  val city: String)
}

// Private Nested Class
class User7(val name: String) {
    private class Address(val street: String,
                          val streetNumber: String,
                          val zip: String,
                          val city: String)
    private val address = Address("Aparo Park", "1", "ABC", "Gotham City")
}

// Inner Class가 Outer Class member에 접근하는 방법
class User8(val name: String) {

    inner class Address(val street: String,
                        val streetNumber: String,
                        val zip: String,
                        val city: String) {
        init {
            println("The name of the User is: $name")
        }
    }
}

// Enum Classes
enum class Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

// Enum Class : numerical representation of each month
enum class Month2 (val num: Int) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12)
}

fun main(args: Array<String>) {
    val user = User("bruce", "Wayne", 1950) // 객체 생성방법
    val march = Month.MARCH// Enum 사용방법
    val may = Month2.MAY // Enum 사용방법 2
    val mayNum = may.num

    for (month in Month.values()) {
        println(month)
    }

    val june = Month.valueOf("JUNE")
}