package morebasics

// nested class is a class that is created inside another class. It is static by default meaning that
// its data members can be accessed without creating the object of the class
// a nested class cannot access the data members of the outer class -> only the outer class can access the members of the nested class
class Outer {
    private val name = "Huzaifa Shoaib"

    class Nested {
        private val description = "Code inside the nested class"
        val id = 20
        fun foo(): String {
//            println(description)
            return description
        }
    }
}

// inner class is a class that is created inside another class with the keyword "inner"
// it is basically a nested class marked as inner
// inner class cannot be declared inside an interface or non-nested classes
// the difference between inner and nested class is that inner class can access the members of its outer class
// even if it is private. It keeps a reference to an object of its outer class
class OuterClass {
    private val demo = 1

    inner class InnerClass {
        fun foo() {
            println("\n$demo is accessed inside the inner class from the outer class")
        }
    }
}

fun main() {
    // nested class
    println(Outer.Nested().id)
    val demo = Outer.Nested()
    print(demo.foo())

    // inner class
    val demo2 = OuterClass().InnerClass()
    println(demo2.foo())
}