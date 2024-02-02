package app.zaifi.kotlinbasics

fun main() {
    var myName = "Huzaifa"
    myName = "Huzaifa Shoaib"

    val myByte: Byte = 13
    val myShort: Short = 3123
    val myInt: Int = 1231231231
    val myLong: Long = 34101_4697981_9

    print("Hello $myName\n")

//    working with strings
    val myStr = "Hello World"
    var firstCharInString = myStr[0]
    print("First Character in the string -> $firstCharInString\n")
    var lastCharInString = myStr[myStr.length - 1]
    print("last character in string -> $lastCharInString\n")

    print("The first character in the string is $firstCharInString and the length of the string is ${myStr.length}. The complete string is $myStr")

    print("Hello $myByte\n")
    print("Hello $myLong\n")
    print("Hello $myShort\n")
    print("Hello $myInt\n")


    /* there are 2 kinds of keywords in kotlin to assign variables, 1 is the val keyword which makes the
    * variable immutable meaning that its value cannot change or be overwritten in the code again, and the other 1 is var keyword which means that the value of the
    * variable can change of be overwritten in the code.
    * using these keywords we don't have to mention the datatype explicitly with each variable is right. Kotlin performs type inference to the variables by
    * identifying the type of value assigned to the variable.
    * For the numeric data types that involve having long numbers we can use '_' sign to make them more readable
    * boolean has only 2 states, True or False
    * Type inference finds the type from the context */
}