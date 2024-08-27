package com.franjurado.comparador

import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Items(
    @SerialName("id")
    val id: Int,
    @SerialName("carBrand")
    val brand: String,
    @SerialName("model")
    val carModel: String,
    @SerialName("range")
    val vehicleRange: Int,
    @SerialName("details")
    val details: String?,
    @SerialName("rate")
    val carRate: Float,
    @SerialName("pros")
    val carPros: String,
    @SerialName("cons")
    val carCons: String
) {
    var isGoodToTravel = vehicleRange > 300 
    var ratingCategory = when {
        carRate >= 4.5 -> "Recomendado"
        carRate >= 3.5 -> "Bueno"
        carRate >= 2.5 -> "Para unos pocos"
        else -> "Mejor no lo compres"
    }
}
