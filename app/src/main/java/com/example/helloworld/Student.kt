package com.example.helloworld

fun main() {
    val student = Student("a123", 3, "Tom", 20)
    val student1 = Student("Tom", 20)
    val student2 = Student()
    student.readBooks()
    student.doHomework()
}

class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age), Study {
    init{
        println("sno is " + sno)
        println("grade is " + grade)}
    override fun readBooks() {
        println(name + " is reading.")
    }

    /*override fun doHomework() {
        println(name + " is doing homework.")
    }*/

    constructor(name: String, age: Int) : this("", 0, name, age) {
        println("secondary constructor")
    }

    constructor() : this("", 0) {
        println("third constructor")
    }
}

class Student1(name:String, age:Int) : Person(name, age), Study {
    override fun readBooks() {
        println(name + " is reading.")
    }
    override fun doHomework() {
        println(name + " is doing homework.")
    }
}
