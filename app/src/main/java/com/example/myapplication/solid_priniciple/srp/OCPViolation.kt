package com.example.myapplication.solid_priniciple.srp

enum class Notification1 {
    PUSH_NOTIFICATION, EMAIL
    //,SMS
}

class NotificationService1 {

    fun sendNotification(notification: Notification1) {
        when (notification) {
            Notification1.PUSH_NOTIFICATION -> {
                // send push notification
            }

            Notification1.EMAIL -> {
                // send email notification
            }

//            Notification.SMS -> {
//                // send sms notification
//            }
        }
    }
}