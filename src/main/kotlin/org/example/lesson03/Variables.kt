package org.example.lesson03

// will be mutable?
// do we need to initialize it right away? -> if not lateinit
// initialization value, if needed
// do we need a delay before initialization -> if yes ->by lazy
// naming: fun -> action, variable -> data, try to be short
// lot of comments -> bad practice


// blabla auto
val shassi: String = "bslkdsdklsld667788"

// auto color
lateinit var color: String

// auto length
var probeg: Double = 0.0

// owner name
lateinit var ownerName: String

// wheels number
const val wheelsNumber: Int = 4

//detailed report for auto utilization
val deadReport: String by lazy {
    "blabla"
}

val name: String = "Alice" // immutable, can be calculated at runtime
var age: Int = 38 //mutable

//lateinit var only
lateinit var phoneNumber: String

const val PI: Double = 3.14 // only primitive, out of fun and class

// lazy initialization

val lazyValue: String by lazy {
    Thread.sleep(2000)
    "this is very lazy String"
}

//getters & setters
var count: Int = 0
    get() {
        return if (field > 100) field else 0
    }
    set(value) {
        if (value >= 0) field = value
    }

fun test() {
    println(name)
    println(age)
    age = 31
    println(age)
    phoneNumber = "23555"
    println(phoneNumber)

}

fun main() {
    test()
}