package com.nightstalker.artic.core.data.model


import com.google.gson.annotations.SerializedName

/**
 * Класс произведения искусства
 *
 * @property config
 * @property data
 * @property info
 * @constructor Create empty Artwork default model
 */
data class ArtworkDefaultModel(
    @SerializedName("config")
    val config: Config,
    @SerializedName("data")
    val data: Data,
    @SerializedName("info")
    val info: Info
)