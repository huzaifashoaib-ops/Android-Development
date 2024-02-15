package morebasics

// we can use multiple catch blocks in our code. These are used when there are different operations in
// our try block that may cause exceptions
//fun main() {
//    try {
//        val a = IntArray(5)
//        a[5] = 10/0
//    } catch (e:ArithmeticException){
//        println("Arithmetic catch")
//    } catch (e:IndexOutOfBoundsException){
//        println("Index Out Of Bound catch")
//    }catch (e:Exception){
//        println(e)
//    }
//    println("Code after multiple catch blocks...")
//}

// we can have nested try blocks as well
fun main() {
    try {
        val arr = IntArray(5)
        arr[6] = 10 / 0
        try {
            val num = 20 * 0 + 1 / 0
        } catch (e: ArithmeticException) {
            println("Inner catch block ${e.message}")
        }
    } catch (e: IndexOutOfBoundsException) {
        println("Outer catch block ${e.message}")
    } catch (e: ArithmeticException){
        println("Outer catch block ${e.message}")
    }
}