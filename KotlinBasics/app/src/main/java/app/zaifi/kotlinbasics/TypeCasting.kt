package app.zaifi.kotlinbasics

import kotlin.math.floor

fun main() {
    val stringList: List<String> = listOf("Muhammad", "Huzaifa", "Shoaib", "Chughtai")
    val mixedList: List<Any> = listOf("Huzaifa", 20, 10, "Birthday", 70.5, "Weighs", "Kg")

    for (value in mixedList) {
        if (value is Int) {
            println("Integer: $value")
        } else if (value is Double) {
            println("Double: $value with floor value ${floor(value)}")
        } else if (value is String) {
            println("String: $value of length ${value.length}")
        } else {
            throw IllegalArgumentException("Type Unknown!")
        }
    }

    // alternatively
    for (value in mixedList) {
        when (value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with floor value ${floor(value)}")
            is String -> println("String: $value of length ${value.length}")
            else -> throw IllegalArgumentException("Type Unknown!")
        }
    }

    // Smart cast
    val obj: Any = "My name is Huzaifa Shoaib"
    if (obj !is String) {
        println("Not a String.")
    } else {
        println("Found a String of length ${obj.length}")
    }

    // Explicit (unsafe) casting using "as" keyword
    val str: String = obj as String
    println(str.length)

    // the code below gives error
//    val obj2: Int = 1947
//    val str2: String = obj2 as String
//    println(str2.length)

    // Explicit (safe) casting using "as?" keyword
    val obj3: Any = 2024
    val str3: String? = obj3 as? String
    println(str3)
}