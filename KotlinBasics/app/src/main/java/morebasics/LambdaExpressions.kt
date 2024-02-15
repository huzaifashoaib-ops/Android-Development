package morebasics


// lambda functions are functions that are not declared but passed immediately as an expression
// lambda functions don't have any name so they are referred to as anonymous functions
fun main() {
    // simple example of lambda expression
    val name = { println("Huzaifa Shoaib") }
    // invoking the function
    name() // -> this is one method to invoke a lambda function/expression
    name.invoke() // -> this is another method invoke a lambda expression/function

    val sum = { a: Int, b: Int -> println(a + b) }
    //println(sum(5,10))
    //sum(5, 10)

    // if we want to print a string value then we can use the toString() method
    sum.toString()
    sum(5, 10) // this will give the result as a string

    // here are some examples of lambdas with return types
    val lambda1: (Int) -> Int = { a -> a * a }
    val lambda2: (String, String) -> String = { a, b -> a + b }
    val lambda3: (Int) -> Unit = { print(Int) }

    //Lambdas can be used as class extensions
    println("Huzaifa Shoaib".lambda4(22))
    // we have used the lambda expression as a class extension . "this" keyword is used for the String and the "it" keyword
    // is used for the integer value passed in the lambda expression. the code_body concatenates both the values and
    // returns the result

    // it -> implicit name of a single parameter. used to represent the single parameter we pass to the lambda

    // shorthand form of a lambda expression
    val numbers = arrayOf(1, -2, -3, 4, 5)
    println(numbers.filter { it > 0 })
    // longhand form of the same lambda
    println(numbers.filter { item -> item > 0 })

    // returning a value from teh lambda expression
    val find = fun(num: Int) { // this is an anonymous function
        if (num % 2 == 0 && num < 0) {
            println("The value is even and negative")
        } else if (num % 2 == 0 && num > 0) {
            println("The value is even and positive")
        } else if (num % 2 != 0 && num < 0) {
            println("The value is odd and negative")
        } else {
            println("The value is odd and positive")
        }
    }
    find(-500)

    // anonymous function examples
    val anonymous1 = fun(a: Int, b: Int): Int = a + b
    // body as block
    val anonymous2 = fun(a: Int, b: Int): Int {
        return a * b
    }
    val add = anonymous1(5, 10)
    val multiply = anonymous2(5, 10)
    println("anonymous1 yields $add")
    println("anonymous2 yields $multiply")

}

val lambda4: String.(Int) -> String = { this + it }