package br.com.iupp.apivenda.infrastructure.broker

import br.com.iupp.apivenda.model.EventsInformation

class SaleNatsClientImpl : SaleNatsClient {

    override fun sendSale(eventsInformation: EventsInformation) {
        sendSale(eventsInformation = eventsInformation)
    }

    override fun deleteSale(eventsInformation: EventsInformation) {
        deleteSale(eventsInformation = eventsInformation)
    }
}