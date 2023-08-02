package com.example.myapplication.design_patterns.behavioral

interface TransportTypeStrategy {
    fun travelMode(): String
}
// 2
class Car : TransportTypeStrategy {
    override fun travelMode(): String {
        return "Road"
    }
}
class Ship : TransportTypeStrategy {
    override fun travelMode(): String {
        return "Sea"
    }
}
class Aeroplane : TransportTypeStrategy {
    override fun travelMode(): String {
        return "Air"
    }
}

class TravellingClient(var strategy: TransportTypeStrategy){

    fun update(strategy: TransportTypeStrategy) {
        this.strategy = strategy
    }

    fun howToTravel(): String {
        return "Travel by ${strategy.travelMode()}"
    }

}

fun main() {
    val travelClient = TravellingClient(Aeroplane())

    print(travelClient.howToTravel()) // Travel by Air

    travelClient.update(Ship())
    print(travelClient.howToTravel())
}