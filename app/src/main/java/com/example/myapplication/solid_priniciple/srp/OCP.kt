package com.example.myapplication.solid_priniciple.srp


interface Notification {
    fun sendNotification()
}

class PushNotification : Notification {
    override fun sendNotification() {
        // send push notification
    }
}

class EmailNotification : Notification {
    override fun sendNotification() {
        // send email notification
    }
}

class NotificationService {

    fun sendNotification(notification: Notification) {
        notification.sendNotification()
    }
}

class SMSNotification : Notification {
    override fun sendNotification() {
        // send sms notification
    }
}