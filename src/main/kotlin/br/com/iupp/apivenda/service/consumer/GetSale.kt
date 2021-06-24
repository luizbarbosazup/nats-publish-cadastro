package br.com.iupp.apivenda.service.consumer

import br.com.iupp.apivenda.model.SaleConsulted
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("http://localhost:8082/api/v1/sales")
interface GetSale {

    @Get
    fun consultSales():List<SaleConsulted>

}