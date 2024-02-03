package app.zaifi.kotlinbasics

// Method -> a Method is a function within a class

fun main() {
//    breakAndContinue()
//    add(5, 10)
//    average(10.1,20.2)
    subtract(5,20)
}

fun subtract(a:Int, b:Int){
    var result = a-b
    return print("The result of subtraction from the subtract function is $result because the numbers are $a and $b, " +
            "so $a - $b is $result")
}

fun average(a: Double, b: Double) {
    var result = (a+b)/2
    return print("The average of 2 numbers is $result")
}

fun add(a: Int, b: Int) {
    var result = a + b
    return print("The result of addition from the add function is $result")
}

fun breakAndContinue() {
    //break keyword
    for (i in 1 until 20) {
        print("$i ")
        if (i / 2 == 5) {
            break
        }
    }
    println("\nDone with the loop.")
    //continue keyword
    for (i in 1 until 20) {
        // 10/5 is 5
        // 11/5 is 5.5, which is 5 in terms of Int. This is why 10 and 11 are not included in this loop's output
        if (i / 2 == 5) {
            continue
        }
        print("$i ")
    }
    println("\nDone with the loop.")
}