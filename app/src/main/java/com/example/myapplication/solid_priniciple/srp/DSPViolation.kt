package com.example.myapplication.solid_priniciple.srp

class DSPViolation {
}

class ClassA {
    fun doSomething() {
        println("Doing something")
    }
}

class ClassB {
    fun doIt() {
        val classA = ClassA() // <- ClassB needs an object of ClassA in order to work properly
        classA.doSomething()
    }
}