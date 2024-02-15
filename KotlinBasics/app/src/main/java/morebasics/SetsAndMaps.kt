package morebasics

fun main() {
    // a set is a collection that eliminates duplicate data
    val fruits = setOf("Apple", "Orange", "Grape", "Apple")
    println(fruits.size) // the size will be 3 because the "Apple" is appearing twice and set ignores it
    println(fruits)

    // we can sort a set as well
    println(fruits.toSortedSet()) // since 'fruits' is a set of strings, it is sorted alphabetically

    // we can also convert sets to mutable
    val newSet = fruits.toMutableSet()
    newSet.add("Water Melon")
    newSet.addAll(setOf("Pear", "Guava", "Dragon Fruit"))
    println(newSet)

    // like lists, we can access any element at any index in the set
    println(newSet.elementAt(4))


    // maps are another type of collection that contain an id for each element and map the element to it
    val days = mapOf(
        1 to "Monday",
        2 to "Tuesday",
        3 to "Wednesday"
    ) // each key (1, 2, 3) is connected to its corresponding value
    println(days[2]) // collects the key value and not the index in this case

    // to loop through maps
    for (key in days.keys) {
        println("$key is to ${days[key]}") // prints the key and the value corresponding to it
    }

    // we can also use maps with data classes
    val fruitsMap = mapOf(1 to Fruit("Apple", 250.0), 2 to Fruit("Orange", 400.0))
    println(fruitsMap)

    // we can also add elements to any index
    val newDays = days.toMutableMap()
    newDays[4] = "Thursday"
    newDays[5] = "Friday"

    // we can sort the map as well
    println(newDays.toSortedMap()) // sorted by the key values
}

data class Fruit(val name: String, val price: Double)