package app.zaifi.kotlinbasics

// The primary constructor must have at-least 1 parameter in a data class
data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Huzaifa")

    val name = user1.name
    println(name)

    user1.name = "Huzaifa Shoaib"

    val user2 = User(1, "Huzaifa Shoaib")
    println(user1 == user2)

    val newUser = user1.copy(id = 4, name = "Muhammad Huzaifa Shoaib")
    println(user1)
    println(newUser)

    println(newUser.component1()) //prints the id of the user
    println(newUser.component2()) // prints the name of the user

    val (id, newName) = newUser
    println("id = $id, name = $newName")
}