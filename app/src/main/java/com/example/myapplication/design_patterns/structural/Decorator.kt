package com.example.myapplication.design_patterns.structural


interface Salad{
    fun getIngredients() : String
}

class PlainSalad() : Salad {

    override fun getIngredients(): String {
        return "Arugula & Lettuce"
    }
}

//3
open class SaladDecorator(protected var salad: Salad) : Salad {
    override fun getIngredients(): String {
        return salad.getIngredients()
    }
}

class Cucumber(salad: Salad) : SaladDecorator(salad) {
    override fun getIngredients(): String {
        return salad.getIngredients()+ ", Cucumber"
    }
}

class Carrot(salad: Salad) : SaladDecorator(salad){
    override fun getIngredients(): String {
        return salad.getIngredients()+ ", Carrot"
    }
}


fun main() {
    val cucumberSalad = Cucumber(Carrot(PlainSalad()))
    println(cucumberSalad.getIngredients()) // Arugula & Lettuce, Carrot, Cucumber
    val carrotSalad = Carrot(PlainSalad())
    print(carrotSalad.getIngredients()) // Arugula & Lettuce, Carrot
}