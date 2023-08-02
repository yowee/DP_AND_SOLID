package com.example.myapplication.solid_priniciple.srp

interface Notification3 {
    fun sendNotification(message: String)
}

class EmailNotification3 : Notification3 {
    override fun sendNotification(message: String) {
        println("Sending email notification with message \"$message\"")
    }
}


class SmsNotification3 : Notification3 {
    override fun sendNotification(message: String) {
        println("Sending sms notification with message \"$message\"")
    }
}


class NotificationService3 {

    // this can be injected through constructor as well and it would be constructor injection
    var notification: Notification3? = null

    fun sendNotification(message: String) {
        notification?.sendNotification(message)
    }
}


fun main() {
    val message = "Happy Coding"
    val notificationService = NotificationService3()
    var notification: Notification3

    notification = EmailNotification3()
    notificationService.notification = notification
    notificationService.sendNotification(message)
    // Output: Sending email notification with message "Happy Coding"

    notification = SmsNotification3()
    notificationService.notification = notification
    notificationService.sendNotification(message)
    // Output: Sending sms notification with message "Happy Coding"
}