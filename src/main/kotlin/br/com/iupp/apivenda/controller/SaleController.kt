package br.com.iupp.apivenda.controller

import br.com.iupp.apivenda.model.SaleRequest
import br.com.iupp.apivenda.infrastructure.broker.SaleNatsClient
import br.com.iupp.apivenda.service.SaleService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/api/v1/sales")
class SaleController(val service: SaleService ) {

    @Post
    fun sale(@Body @Valid sale: SaleRequest){

        service.saveSale(saleRequest = sale)
    }
}