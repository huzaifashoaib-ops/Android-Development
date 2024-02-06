package app.zaifi.kotlinbasics


// we can create variables of class types like the following code is working
fun main() {
//    var huzaifa = Person("Huzaifa", "Shoaib", 22)
//    huzaifa.age = 23
//    println("Huzaifa is ${huzaifa.age} years old")
//    huzaifa.hobby = "Skateboarding"
//    huzaifa.stateHobby()
//    var shoaib = Person()
//    shoaib.hobby = "Playing video games"
//    shoaib.stateHobby()
//    var usingLastnName = Person(lastName = "Huzaifa")
    var myCar = Car()
    println("The brand of the car is ${myCar.brand}.")
    myCar.maxSpeed =
        240 // this line throws the exception from the setter as the value is being set here
    println("The top speed of this particular ${myCar.brand} is ${myCar.maxSpeed} km/h.") // this line throws the exception from the getter as the value is being get here
//    myCar.model = "M8"
    println(myCar.model)
}

// lateinit and setters & getters
/*Setters come in handy when the values are set
* and getters come in handy when the values are printed or "get" */
class Car() {
    lateinit var owner: String

    val brand: String = "BMW"
        // below is the custom getter for the variable "brand"
        get() {
            return field.lowercase()
        }
    var maxSpeed: Int = 250
        // below is the custom getter for the variable "maxSpeed"
        get() {
            return if (field > 0) field else throw IllegalArgumentException("The value of speed cannot be less than 0. This message is from the getter.")
        }
        // below is the custom setter for the variable "maxSpeed"
        set(value) {
            field =
                if (value > 0) value else throw IllegalArgumentException("The value cannot be less than 0. This message is from the setter")
        }
    var model: String = "M5"
        // this private setter will not let me set the value outside the Car class (Same is for the getter)
        private set

    init {
        this.model = "M3"
        this.owner = "Huzaifa"
    }
}

//class Person(firstName: String = "Muhammad", lastName: String = "Shoaib") {
//    // member variables (properties) and functions
//    var age: Int? = null
//    var hobby: String = "Programming"
//    var name1: String? = null
//
//    // initializer block -> initializing the object created in the main function
//    init {
//        this.name1 = firstName
//        println("Person has been created with First Name = $firstName and Last Name = $lastName")
//    }
//
//    //member constructor -> secondary constructor
//    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
//        this.age = age
//        println("Person has been created with First Name = $firstName and Last Name = $lastName and Age = $age")
//    }
//
//    // member functions -> methods
//    fun stateHobby() {
//        println("$name1\'s hobby is $hobby")
//    }
//}