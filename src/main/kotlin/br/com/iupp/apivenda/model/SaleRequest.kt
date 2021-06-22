package br.com.iupp.apivenda.model

import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Positive

@Introspected
data class SaleRequest (
    @field:NotEmpty @field:NotNull val productId:UUID,
    @field:Positive @field:NotNull val qty: Double )

