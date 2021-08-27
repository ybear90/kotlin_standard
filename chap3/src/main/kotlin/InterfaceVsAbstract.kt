abstract class InsureBase {
    abstract fun insure()
}

abstract class CarBase {
    abstract fun drive()
}

// compiler error, can't inherit from multiple classes
//class InsurableCar: InsureBase(), CarBase() {
//    override fun insure() {
//
//    }
//
//    override fun drive() {
//
//    }
//}
class InsurableSuperCar: Insurable, Drivable {
    override fun insure() {
        println("Car is now insured")
    }

    override fun drive() {
        println("Car is driving")
    }
}