package br.com.iupp.apivenda.service

import br.com.iupp.apivenda.infrastructure.broker.SaleNatsClient
import br.com.iupp.apivenda.model.Events
import br.com.iupp.apivenda.model.EventsInformation
import br.com.iupp.apivenda.model.SaleRequest
import javax.inject.Singleton

@Singleton
class SaleServiceImpl(val nats:SaleNatsClient): SaleService {
    override fun saveSale(saleRequest: SaleRequest) {

//        println("[SaleServiceImpl] Product ID : ${saleRequest.productId} " +
//                "Qty: ${saleRequest.qty}")

        nats.sendSale(EventsInformation(Events.SAVE_SALE,saleRequest))

    }
}