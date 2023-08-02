package com.example.myapplication.solid_priniciple.srp


interface Waste {
    fun process()
}

class OrganicWaste : Waste {
    override fun process() {
        println("Processing Organic Waste")
    }
}


class PlasticWaste : Waste {
    override fun process() {
        println("Processing Plastic Waste")
    }
}

class WasteManagementService {

    fun processWaste(waste: Waste) {
        waste.process()
    }
}


fun main() {

    val wasteManagementService = WasteManagementService()

    var waste: Waste

    waste = OrganicWaste()
    wasteManagementService.processWaste(waste) // Output: Processing Organic Waste

    waste = PlasticWaste()
    wasteManagementService.processWaste(waste) // Output: Processing Plastic Waste
}