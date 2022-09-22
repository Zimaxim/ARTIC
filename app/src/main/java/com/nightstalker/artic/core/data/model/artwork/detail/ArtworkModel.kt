package com.nightstalker.artic.core.data.model.artwork.detail


import com.google.gson.annotations.SerializedName
import com.nightstalker.artic.core.data.model.common.Config
import com.nightstalker.artic.core.data.model.common.Info

/**
 * Класс произведения искусства
 *
 * @property config
 * @property data
 * @property info
 * @constructor Create empty Artwork default model
 */
data class ArtworkModel(
    @SerializedName("config")
    val config: Config,
    @SerializedName("data")
    val data: ArtworkData,
    @SerializedName("info")
    val info: Info
)