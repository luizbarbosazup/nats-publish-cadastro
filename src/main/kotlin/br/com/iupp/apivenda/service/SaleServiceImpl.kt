package br.com.iupp.apivenda.service

import br.com.iupp.apivenda.infrastructure.broker.SaleNatsClient
import br.com.iupp.apivenda.model.Events
import br.com.iupp.apivenda.model.EventsInformation
import br.com.iupp.apivenda.model.SaleRequest
import java.util.*
import javax.inject.Singleton

@Singleton
class SaleServiceImpl(val nats:SaleNatsClient): SaleService {

    override fun saveSale(saleRequest: SaleRequest) {
        nats.sendSale(EventsInformation(Events.SAVE_SALE,saleRequest,saleId = null))
    }

    override fun deleteSale(saleId: UUID) {
        nats.deleteSale(EventsInformation(event = Events.DELETE_SALE,saleId = saleId, sale = null))
    }
}