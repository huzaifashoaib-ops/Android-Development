package morebasics

fun main() {
    // unsafe cast
//    val str1: String? = null
//    val str2: String? = str1 as String?      // throw exception
//    println(str2)

    // safe cast
    var str:Any = "Safe Casting"
    val str2=str as? String
    str = 11
    val str3 = str as? String // type casting not possible so this returns null
    val str4 = str as? Int
    println(str2)
    println(str3)
    println(str4)
}