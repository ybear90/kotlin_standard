// Class Delegation examples
interface Drivable {
    fun drive()
}

class Car : Drivable {

    override fun drive() {
        println("Driving a car")
    }
}

// Kotlin has built-in support for delegation
class Vehicle(car: Car) : Drivable by car

// Delegation also works with multiple interfaces.
interface Rideable {
    fun ride()
}

interface Chargable {
    fun charge()
}

class Battery : Chargable {
    override fun charge() {
        println("Charging")
    }
}

class Bike : Rideable {
    override fun ride() {
        println("Riding a bike")
    }
}

class ChargableBike(bike: Bike, battery: Battery): Rideable by bike, Chargable by battery