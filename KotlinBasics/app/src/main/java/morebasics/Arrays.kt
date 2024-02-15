package morebasics

fun main() {
    // first way of making an integer array
//    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    // with type inference, second way of doing it
//    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    // keeping in mind the type inference, third way of doing it
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
//    println(numbers) // this prints the address of the array
    println(numbers.contentToString()) // this converts the array to string and prints the actual array

    // traversing through the array
    for (i in numbers) {
        println(i)
    }

    // to access the index of a particular element in the array, we change the value in the [] brackets
    println(numbers[0])

    // changing the values of indexes in the array
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    println(numbers.contentToString())

    // we can perform all these operations on other types of arrays as well

    val fruits = arrayOf(Fruits("Apple", 250.0), Fruits("Grape", 100.0))
    println(fruits.contentToString())

    // to get the names of fruits using indices
    for (index in fruits.indices) {
        println("${fruits[index].name} is at index $index with price of Rs.${fruits[index].price}/-")
    }

    // to get the names of the fruits
    for (fruit in fruits) {
        println(fruit.name)
    }

    // we can also have arrays that have different types of data
    val mix = arrayOf("Monday", 1, 2, 3, Fruits("Apple", 250.0))
    println(mix.contentToString())
}

// we can store entire objects in an array as well by the following method
data class Fruits(val name: String, val price: Double)