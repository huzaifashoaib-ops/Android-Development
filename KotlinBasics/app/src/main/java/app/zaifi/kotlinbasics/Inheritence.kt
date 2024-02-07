package app.zaifi.kotlinbasics

/* A class that inherits from another class is called a Derived class or Child Class or a Sub Class
* A class that the Sub Class inherits from is called a Super Class or Parent Class or Base Class*/

// interface -> it allows us to extend the functionality of a class
interface Drivable {
    var maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }
}

// in order to use inheritance among classes, the base class needs to be open because all classes are non-inheritable by default in Kotlin

open class Cars(override var maxSpeed: Double, val name: String, val brand: String) :
    Drivable { // sub class of vehicle class

    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
            println("The range is $range KM")
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }

    override fun drive(): String {
        return "Driving the interface drive."
    }
}

class ElectricCars(maxSpeed: Double, name: String, brand: String, batteryLife: Double) :
    Cars(maxSpeed, name, brand) { // sub class of car class
    override var range = batteryLife * 5

    override fun drive(distance: Double) {
        println("Drove for $distance KM on battery")
    }

    override fun drive(): String {
        return "Drove for $range KM on battery"
    }

    override fun brake() {
//        super.brake()
        println("Brake inside the Electric Car.")
    }
}

fun main() {
    var myCar = Cars(250.2, "M5", "BMW")
    var myEV = ElectricCars(200.1, "Model S", "Tesla", 90.3)

    myEV.extendRange(200.8)

    // we are using polymorphism in the following 2 lines of code -> it is the ability to treat objects with similar traits in a common way
    myCar.drive(200.5)
    myEV.drive(200.8)

    myCar.drive()

    myEV.brake()
    myCar.brake()
}
