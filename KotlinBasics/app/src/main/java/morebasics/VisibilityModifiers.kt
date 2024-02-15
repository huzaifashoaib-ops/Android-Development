package morebasics

/*Visibility modifiers are used to restrict access to the classes and their uses.
There are 4 visibility modifiers namely public, private, protected and internal

by default, a class is public and we have to explicitly mention the visibility of a class or any attributes for other modifiers*/

// public modifier -> visible everywhere
class A { // public by default
    val a = 10
}

public class B { // specified with public modifier
    val b = 20
    fun display() {
        println("Accessible Everywhere!")
    }
}

// private modifier -> visible inside the same class only
private class C {
    private val c = 10
    fun display() {
        println("Accessing c successfully $c")
    }
}

//fun main() {
//    val classC = C()
//    println(classC.display())
//    println(classC.c) // this line cannot access the variable as it is private
//}

// protected modifier -> visible inside the same class and its sub-classes
open class X {
    protected val x = 10
}

class Y : X() {
    fun getVal(): Int {
        return x
    }
}

// internal modifier -> visible inside the same module
internal class E {
    internal val e = 10
    internal fun display() {
        println("$e from class E")
    }
}

class F {
    internal val f = 20
    internal fun display() {
        println("$f from class F")
    }
}

fun main() {
    val e = E()
    val f = F()
    e.display()
    f.display()
    f.f // displays because the class is public
    e.e // displays because the class is in this module and cannot be accessed from other modules

    val y = Y()
    println("The value of variable x from class X is: ${y.getVal()}")
}
// we can also change the class constructor visibility