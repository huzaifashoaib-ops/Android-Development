package morebasics

// ArrayList are used to create dynamic arrays in kotlin, meaning we can increase or decrease the size
// of an arrayList depending upon our need. They provide read and write functionality, are non-synchronized
// and may contain duplicates
fun main() {
    val arrayList = ArrayList<String>() // creates an empty ArrayList

    // using the add() method
    arrayList.add("Huzaifa") // add items to ArrayList
    arrayList.add("Shoaib")

    // traversing through the ArrayList
    println("--add() method--")
    for (i in arrayList) {
        println(i)
    }

    // adding an element to a specific index in the ArrayList
    arrayList.add(0, "Muhammad")
    println("--add() method--")
    for (i in arrayList.indices) {
        println("Index $i has the value ${arrayList[i]}")
    }

    // adding another value at index 3
    arrayList.add(3, "Chughtai")
    println("--add() method--")
    for (index in arrayList.indices) {
        println("At index $index, ${arrayList[index]} is stored.")
    }


    // using the addAll() method
    val arrayList1 = ArrayList<Any>()
    arrayList1.addAll(arrayList) // adding the first arrayList to the newly created ArrayList
    println("--addAll() method--")
    for (index in arrayList1) {
        println(index)
    }


    // using the get() method to obtain an element at any index
    val list = listOf(10, 20, 30, 40, 50)
    val arrayList2 = ArrayList<Int>()
    arrayList2.addAll(list)

    // traversing through the list to get the values
    println("--get() method--")
    for (index in arrayList2.indices){
        println("$index holds the value ${arrayList2.get(index)}")
    }
    // we can also use the arrayList2[4] method to access the specific element at specified index as well
    // we can access single elements without traversing through the whole ArrayList

    // using the set() method to change the value at specified index in the ArrayList
    println("--get() method--")
    arrayList2.set(0,100)
    for (index in arrayList2.indices){
        println("$index holds the value ${arrayList2.get(index)}")
    }

    // using the indexOf() method to know the index of a specific element in the list
    println("--indexOf() method--")
    println(arrayList.indexOf("Huzaifa"))
    println(arrayList.indexOf("Chughtai"))

    // we can use the remove() and clear() methods as well
    // remove() -> used to remove a single item at a time from the ArrayList
    // clear() -> used to remove all the data inside the ArrayList
}