package com.example.myapplication.solid_priniciple.srp


data class Order(
    val id: Long,
    val name: String,
    // ... other properties.
)

class OrderNotificationSender {

    fun sendNotification(order: Order) {
        // send order notifications
    }
}


class OrderInvoiceGenerator {

    fun generateInvoice(order: Order) {
        // generate invoice
    }
}


class OrderRepository {

    fun save(order: Order) {
        // insert/update data in the db.
    }
}


class OrderFacade(
    private val orderNotificationSender: OrderNotificationSender,
    private val orderInvoiceGenerator: OrderInvoiceGenerator,
    private val orderRepository: OrderRepository
) {

    fun sendNotification(order: Order) {
        // sends notification about order updates to the user.
        orderNotificationSender.sendNotification(order)
    }

    fun generateInvoice(order: Order) {
        // generates invoice
        orderInvoiceGenerator.generateInvoice(order)
    }

    fun save(order: Order) {
        // insert/update data in the db
        orderRepository.save(order)
    }
}