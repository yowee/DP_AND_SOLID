package com.example.myapplication.solid_priniciple.srp

import androidx.compose.ui.graphics.Outline.*





open class Rectangle1 {
    private var height = 0
    private var width = 0
    open fun setHeight(height: Int) {
        this.height = height
    }

    open fun setWidth(width: Int) {
        this.width = width
    }

    fun area(): Int {
        return height * width
    }
}


class Square1 : Rectangle1() {
    override fun setHeight(height: Int) {
        setSide(height)
    }

    override fun setWidth(width: Int) {
        setSide(width)
    }

    private fun setSide(side: Int) {
        super.setHeight(side)
        super.setWidth(side)
    }
}

fun main() {
    val rectangle = Rectangle1()
    rectangle.setHeight(5)
    rectangle.setWidth(2)

    val rectangleCheck = rectangle.area() == 10 // true

    val square: Rectangle1 = Square1()
    square.setHeight(5) // width is also set to 5
    square.setWidth(2) // height is also set to 2

    val squareCheck = square.area() == 10 // false - not substitutable
}