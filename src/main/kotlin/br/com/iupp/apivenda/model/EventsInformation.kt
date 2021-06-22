package br.com.iupp.apivenda.model

import java.util.*

data class EventsInformation(
    val event: Events = Events.SAVE_SALE,
    val sale: SaleRequest?,
    val saleId: UUID?
)