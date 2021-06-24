package br.com.iupp.apivenda.controller

import br.com.iupp.apivenda.model.SaleConsulted
import br.com.iupp.apivenda.model.SaleRequest
import br.com.iupp.apivenda.service.SaleService
import br.com.iupp.apivenda.service.consumer.GetSale
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import java.util.*
import javax.validation.Valid
import kotlin.collections.ArrayList

@Validated
@Controller("/api/v1/sales")
class SaleController(val service: SaleService, val saleConsult:GetSale ) {

    @Post
    fun sale(@Body @Valid sale: SaleRequest){

        service.saveSale(saleRequest = sale)
    }

    @Delete("/{saleId}")
    fun deleteSale(@PathVariable saleId:UUID){
        println("try delete the sale ")
        service.deleteSale(saleId = saleId)
    }

    @Get
    fun getListSale():HttpResponse<List<SaleConsulted>>{

        //client
        val saleConsulted:List<SaleConsulted> = saleConsult.consultSales()

        val listOfSale:MutableList<SaleConsulted> = ArrayList<SaleConsulted>()

        for(itemSale:SaleConsulted in saleConsulted){
            listOfSale.add(itemSale)
        }

        if(listOfSale.isEmpty()){
            return HttpResponse.notFound()
        }
        return HttpResponse.ok(listOfSale)

    }

}