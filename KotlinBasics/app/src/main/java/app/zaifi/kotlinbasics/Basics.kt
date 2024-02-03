package app.zaifi.kotlinbasics

fun main() {
//    var myName = "Huzaifa"
//    myName = "Huzaifa Shoaib"
//
//    val myByte: Byte = 13
//    val myShort: Short = 3123
//    val myInt: Int = 1231231231
//    val myLong: Long = 34101_4697981_9
//
//    print("Hello $myName\n")
//
////    working with strings
//    val myStr = "Hello World"
//    var firstCharInString = myStr[0]
//    print("First Character in the string -> $firstCharInString\n")
//    var lastCharInString = myStr[myStr.length - 1]
//    print("last character in string -> $lastCharInString\n")
//
//    print("The first character in the string is $firstCharInString and the length of the string is ${myStr.length}. The complete string is $myStr")
//
//    print("Hello $myByte\n")
//    print("Hello $myLong\n")
//    print("Hello $myShort\n")
//    print("Hello $myInt\n")
//
////    Arithmetic Operators
//    var result = 5 + 3
//    result /= 2
//    result *= 4
////    the same can be done with + and - operators as well
//    result = 15 % 2
//    print(result)
//
//    val a = 5.0
//    val b = 3
//    val resultDouble: Double = a / b
//    print(resultDouble)
//
////    comparison operators
//    val isEqual = 5 == 3
//    println("\nisEqual is $isEqual")
//
////    IF statements
//    var heightPerson1 = 170
//    var heightPerson2 = 183
//
//    if (heightPerson1 > heightPerson2) {
//        print("use raw force")
//    } else if (heightPerson1 < heightPerson2) {
//        print("use technique")
//    }

////    when expression
//    var season = 3
//    when (season) {
//        1 -> print("summer")
//        2 -> print("winter")
//        3 -> {
//            print("autumn")
//            print("fall")
//        }
//
//        4 -> print("spring")
//        else -> print("Invalid Season")
//    }

//    var month = 4
//    when(month){
//        in 3..5 -> print("winter")
//        in 6..9 -> print("Summer")
//        in 9..12 -> print("Autumn")
//        12, 1, 2 -> print("spring")
//        else -> print("Invalid Season")
//    }

//    var x : Any= 13.37
//    when(x){
//        is Int -> print("$x is an Int")
//        is Double->print("$x is a double")
//        is String-> print("$x is a string")
//        else -> print("Invalid type")
//    }

//    while loop
//    var x = 1
//    while (x <= 10) {
//        println("$x")
//        x++
//    }
//    print("While loop is done")

//    var x = 100
//    while (x >= 0) {
//        println("$x")
//        x -= 2
//    }
//    print("While loop is done")

//    var x = 1
//    do {
//        println("$x")
//        x++
//    } while (x <= 10)
//    print("Do while loop is done.")

//    var feltTemp = "cold"
//    var roomTemp = 10
//    while(feltTemp == "cold"){
//        roomTemp++
//        if (roomTemp >=25){
//            feltTemp = "comfy"
//            println("It's comfy now")
//        }
//    }

//    FOR loop
//    for (i in 10 downTo 1 step 2) { //same as -> for(i in 10.downTo(1).step(2))
//        print("$i ")
//    }
//    print("\n")
//    for (i in 1 until 10) {  //same as -> for(i in 1.until(10))
//        print("$i ")
//    }


    /* there are 2 kinds of keywords in kotlin to assign variables, 1 is the val keyword which makes the
    * variable immutable meaning that its value cannot change or be overwritten in the code again, and the other 1 is var keyword which means that the value of the
    * variable can change of be overwritten in the code.
    * using these keywords we don't have to mention the datatype explicitly with each variable is right. Kotlin performs type inference to the variables by
    * identifying the type of value assigned to the variable.
    * For the numeric data types that involve having long numbers we can use '_' sign to make them more readable
    * boolean has only 2 states, True or False
    * Type inference finds the type from the context */
}