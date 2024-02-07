package app.zaifi.kotlinbasics

// abstract classes are similar to interfaces. Like interfaces, they cannot be instantiated (you cannot create objects of abstract classes)
// we can inherit sub classes from abstract classes and their members as well unless we explicitly use the abstract keyword with the members

abstract class Mammal(
    private val name: String,
    private val origin: String,
    private val weight: Double
    // these are concrete (non-abstract) parameters
) {
    // abstract property -> must be overridden by subclasses
    abstract var maxSpeed: Double

    // abstract methods -> must be implemented by subclasses
    abstract fun run()
    abstract fun breath()

    // Concrete (non-abstract) methods
    fun displayDetails() {
        println("Name: $name\nOrigin: $origin\nWeight: $weight\nMax Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double) :
    Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on two legs.")
    }

    override fun breath() {
        println("Breath through mouth and nose.")
    }

}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double) :
    Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on four legs.")
    }

    override fun breath() {
        println("Breathes through the trunk.")
    }

}

fun main() {
    val human = Human("Huzaifa", "Pakistan", 70.5, 28.3)
    val elephant = Elephant("Elephant", "Jungle", 1000.0, 25.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}
/* The difference between interfaces and abstract classes is that interfaces cannot hold state
*  We can have multiple interfaces but we cn only inherit from 1 class
*  Abstract classes have constructors
*  Interfaces cannot hold fields */
