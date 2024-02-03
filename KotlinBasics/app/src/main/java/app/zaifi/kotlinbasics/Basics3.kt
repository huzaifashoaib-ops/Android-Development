package app.zaifi.kotlinbasics

// nullables
fun main() {
    var nullableName: String? = "Huzaifa"
//    nullableName = null

    // this is how we access the properties and methods of nullable variables
    var len = nullableName?.length
    nullableName?.let { println(it.length) }

    // Elvis operator -> ?:
    val name = nullableName ?: "Guest"
    println("Name is $name")

// not-null assertion -> !!
    print(nullableName!!.lowercase())
}