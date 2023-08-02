package com.example.myapplication.solid_priniciple.srp

class DSP {
}

class EmailNotification1 {
    fun sendNotification(message: String) {
        println("Sending email notification with message \"$message\"")
    }
}


class NotificationService2 {

    fun sendNotification(message: String) {
        val emailNotification = EmailNotification1() // <- here is the dependency
        emailNotification.sendNotification(message)
    }
}


fun main() {
    val notificationService = NotificationService2()
    notificationService.sendNotification("Happy Coding") // Output: Sending email notification with message "Happy Coding"
}