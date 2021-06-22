package br.com.iupp.apivenda.infrastructure.broker

import br.com.iupp.apivenda.model.EventsInformation

class SaleNatsClientImpl : SaleNatsClient {

    override fun sendSale(eventsInformation: EventsInformation) {
        println("evento : ${eventsInformation.event}")
        println("Product ID : ${eventsInformation.sale.productId} " +
                "Qty: ${eventsInformation.sale.qty}")

        sendSale(eventsInformation)

    }


}