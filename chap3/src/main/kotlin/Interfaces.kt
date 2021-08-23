interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() {
        println("Driving a car")
    }
}

interface Flyable {
    fun climb() {
        println("Climbing")
    }

    fun fly()
}

class Airplane : Flyable {
    override fun fly() {
        println("Flying a plane")
    }
}