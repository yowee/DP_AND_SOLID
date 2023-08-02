package com.example.myapplication.design_patterns.creational.factory

object HostingPackageFactory {

    fun getHostingFrom(type: HostingPackageType) : IHostingPackage{
       return when(type){
            HostingPackageType.Standard -> StandardHostingPackage()
           HostingPackageType.Premium -> PremiumHostingPackage()
       }
    }

}