package com.example.myapplication.design_patterns.creational.factory

class StandardHostingPackage : IHostingPackage {
    override fun getService(): List<String> {
        return listOf<String>("Default","Standard")
    }
}