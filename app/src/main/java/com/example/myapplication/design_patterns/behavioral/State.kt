package com.example.myapplication.design_patterns.behavioral

// 1
interface PrinterState {
    fun print()
}

// 2
class Ready : PrinterState {
    override fun print() {
        println("Printed Successfully.")
    }
}

// 3
class NoInk : PrinterState {
    override fun print() {
        println("Printer doesn't have ink.")
    }
}

// 4
class Printer() {
    private val noInk = NoInk()
    private val ready = Ready()
    private var state: PrinterState
    private var ink = 2

    init {
        state = ready
    }

    private fun setPrinterState(state: PrinterState) {
        this.state = state
    }

    // 5
    fun startPrinting() {
        ink--
        if (ink >= 0) {
            setPrinterState(ready)
        } else {
            setPrinterState(noInk)
        }
        state.print()
    }

    // 6
    fun installInk() {
        ink = 2
        print("Ink installed.")
    }
}

fun main() {
    val printing = Printer()
    printing.startPrinting() // Printed Successfully.
    printing.startPrinting() // Printed Successfully.
    printing.startPrinting() // Printer doesn't have ink.
    printing.installInk() // Ink installed.
    printing.startPrinting()
}