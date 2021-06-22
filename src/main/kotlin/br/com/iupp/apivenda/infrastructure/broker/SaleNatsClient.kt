package br.com.iupp.apivenda.infrastructure.broker

import br.com.iupp.apivenda.model.EventsInformation
import br.com.iupp.apivenda.model.SaleRequest
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
interface SaleNatsClient {

    @Subject("event.product")
    fun sendSale(eventsInformation: EventsInformation)
}