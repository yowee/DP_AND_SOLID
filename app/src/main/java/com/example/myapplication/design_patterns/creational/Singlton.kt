package com.example.myapplication.design_patterns.creational

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

object Singleton {

    @Composable
    fun iAmInsideSingleton(){
        Text(text = "Hi")
    }

}