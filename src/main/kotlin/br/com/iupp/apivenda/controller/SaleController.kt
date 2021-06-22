package br.com.iupp.apivenda.controller

import br.com.iupp.apivenda.model.SaleRequest
import br.com.iupp.apivenda.service.SaleService
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import java.util.*
import javax.validation.Valid

@Validated
@Controller("/api/v1/sales")
class SaleController(val service: SaleService ) {

    @Post
    fun sale(@Body @Valid sale: SaleRequest){

        service.saveSale(saleRequest = sale)
    }

    @Delete("/{saleId}")
    fun deleteSale(@PathVariable saleId:UUID){
        println("try delete the sale ")
        service.deleteSale(saleId = saleId)
    }
}