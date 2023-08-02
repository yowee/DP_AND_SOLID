package com.example.myapplication.design_patterns.creational.DI

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.graphics.drawable.shapes.Shape
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.MainActivity
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Inject
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule() {

    @Provides
    @Singleton
    fun provideDependencyInjection() : DependencyInjectionSample{
        return DependencyInjectionSample()
    }

}
class DependencyInjectionSample(){
    fun print(name: String){
        println(name)
    }
}

//@AndroidEntryPoint
//class SomeClass {
//    @Inject
//    lateinit var dependencyInjectionSample: DependencyInjectionSample
//
//    fun doSomething() {
//        dependencyInjectionSample.print("John")
//    }
//}