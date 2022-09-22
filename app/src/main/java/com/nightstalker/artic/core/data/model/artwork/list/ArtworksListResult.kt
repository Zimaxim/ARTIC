package com.nightstalker.artic.core.data.model.artwork.list


import com.google.gson.annotations.SerializedName
import com.nightstalker.artic.core.data.model.artwork.detail.ArtworkData
import com.nightstalker.artic.core.data.model.common.Config
import com.nightstalker.artic.core.data.model.common.Info
import com.nightstalker.artic.core.data.model.common.Pagination

/**
 * Класс со списком данных экспонатов из сети
 * @property config
 * @property data       список данных
 * @property info
 * @property pagination
 * @constructor Create empty Artworks list result
 */
data class ArtworksListResult(
    @SerializedName("config")
    val config: Config,
    @SerializedName("data")
    val data: List<ArtworkData>,
    @SerializedName("info")
    val info: Info,
    @SerializedName("pagination")
    val pagination: Pagination
)