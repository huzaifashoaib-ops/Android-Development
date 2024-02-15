package morebasics

// we can use the try and catch block as an expression in our code
fun test(a: Int, b: Int): Any {
    return try {
        a / b
    } catch (e: Exception) {
        println(e)
        "Division by zero is not allowed"
    }
}

fun checkPassLength(password: String) {
    if (password.length < 6){
        throw Exception("Password is too short")
    } else{
        println("Strong Password")
    }
}

fun main() {
    checkPassLength("bleh")
    println("Executes after validation")

//    try {
//        val int = 10 / 0
//        println(int)
//    } catch (e: Exception) {
//        println(e)
//    } finally {
//        println("This block always executes")
//    }

//    try {
//        val arr = arrayOf(1, 2, 3, 4, 5)
//        val int = arr[6]
//        println(int)
//    } finally {
//        println("This block always executes")
//    }

//    val result = test(10, 2) // calling try block
//    println(result)
//    val result2 = test(10, 0) // calling catch block
//    println(result2)

//    try {
//        var num = 10 / 0
//    } catch (e: ArithmeticException) {
//        println("Division by zero not allowed")
//    }
}

// exception handling is used to handle a problem during program execution
// the exception can be -> running out of memory, array out of bound, or a condition like divided by zero
// exception handling is done by using the "Throw" class
// 4 keywords are used in exception handling
// try -> contains statements that might generate an exception. Must be followed by catch or finally or both
// catch -> use to catch the exception thrown by the try block
// finally -> always executes the code whether the exception is handled or not. Runs the important lines of code
// throw -> allows us throw an exception explicitly

// unchecked exceptions -> exceptions due to mistakes in our code. occur at runtime/logical errors
/* types of unchecked exceptions
*  ArithmeticException -> thrown when we divide by zero or other error
*  ArrayIndexOutOfBoundException -> thrown when an array is tried to access with incorrect index value
*  SecurityException -> thrown by security manager when we have a security violation
*  NullPointerException -> thrown when invoking a method or property on a null object*/

// checked exceptions -> checked at compile time
/* IOException (Input/Output), SQLException*/
