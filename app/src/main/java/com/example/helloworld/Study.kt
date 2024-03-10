package com.example.helloworld

interface Study {
    fun readBooks()
    fun doHomework() {
        println("do homework default implementation.")
    }
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}

fun main() {
    val student = Student("a123", 3, "Big Tom", 20)
    doStudy(student)

}