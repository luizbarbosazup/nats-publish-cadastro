package br.com.iupp.apivenda.model

data class EventsInformation(
    val event: Events = Events.SAVE_SALE,
    val sale: SaleRequest
)