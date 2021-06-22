package br.com.iupp.apivenda.service

import br.com.iupp.apivenda.model.SaleRequest
import javax.inject.Singleton

@Singleton
interface SaleService {

    fun saveSale(saleRequest: SaleRequest)

}