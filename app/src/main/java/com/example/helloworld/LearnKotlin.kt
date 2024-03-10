package com.example.helloworld

import kotlin.math.max

class LearnKotlin
{
    fun main()
    {
        println("Hello, Kotlin!")
    }
}

fun main()
{
    println("Hello, Kotlin!")

    // call getScore function
    /*var name = "Jim"
    var score = getScore(name)
    println("$name's score is $score")*/

    // call checkNumber function
    /*var num = "abc"
    checkNumber(num)*/


}

fun largerNumer(num1:Int, num2:Int):Int
{
    return max(num1, num2)

}

fun getScore(name:String) = if(name == "Tom") {
    86
} else if (name == "Jim") {
    92
} else if (name == "Jack") {
    77
} else if (name == "Lily") {
    95
} else {
    0
}
// getScore1 use when to return score
fun getScore1(name:String) = when(name) {
    "Tom" -> 86
    "Jim" -> 92
    "Jack" -> 77
    "Lily" -> 95
    else -> 0
}

// loop for when using a is
fun checkNumber(num:Any) = when(num) {
    is Int -> println("This is a Int")
    is String -> println("This is a String")
    else -> println("This is other type")
}
