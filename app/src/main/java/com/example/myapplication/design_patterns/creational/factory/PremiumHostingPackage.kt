package com.example.myapplication.design_patterns.creational.factory

class PremiumHostingPackage : IHostingPackage {
    override fun getService(): List<String> {
        return listOf<String>("Premium","Standard")
    }
}