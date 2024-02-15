package morebasics

// there are 2 types of lists -> mutable and immutable
fun main() {
    val months = listOf("January", "February", "March")
    val anyType = listOf(1, 2, 3, true, false, "String")
    println(anyType.size)
    for (month in months) {
        println(month)
    }
    // the lists created above are immutable meaning that we cannot add or remove items

    // to do so, one thing is to convert the lists to mutable lists and add or remove items
    val additionalMonths = months.toMutableList()
    val newMonths = listOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    println(additionalMonths)
    additionalMonths.add("July")
    println(additionalMonths)
    // we can change the values at any index in the list as we did with the arrays

    // the other way is to use the immutableListOf keyword
    val days = mutableListOf("Monday", "Tuesday", "Wednesday")
    days.add("Thursday")
    println(days)
    // to remove and item from the list using index
    days.removeAt(3)
    println(days)
    // to remove an item using by name
    days.remove("Wednesday")
    println(days)

    // we can remove multiple values as well but there is no direct method
    val removeList = mutableListOf("Monday", "Tuesday")
    days.removeAll(removeList)
    println(days) // now the list will be empty
}