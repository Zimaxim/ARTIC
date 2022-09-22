package com.nightstalker.artic.network

import com.nightstalker.artic.core.network.BaseApiMapper
import com.nightstalker.artic.features.artwork.domain.Artwork
import com.nightstalker.artic.features.artwork.data.mappers.toArtworkManifest
import com.nightstalker.artic.features.artwork.data.mappers.toListOfArtworks
import com.nightstalker.artic.features.artwork.data.mappers.toArtwork
import com.nightstalker.artic.features.artwork.domain.ArtworkManifest
import com.nightstalker.artic.network.net.ArtworksApi

/**
 * Класс получения данных с помощью [ArtworksApi]
 *
 * @property api    API
 * @author Tamerlan Mamukhov on 2022-09-16
 */
class ArtworksApiMapper(private val api: ArtworksApi) : BaseApiMapper() {
    suspend fun getArtWorkById(id: Int): Artwork = api.getArtworkById(id).toArtwork()

    suspend fun getArtworks(): List<Artwork> = api.getArtworks().data.toListOfArtworks()

    suspend fun getArtworkManifest(id: Int): ArtworkManifest =
        api.getArtworkManifest(id).toArtworkManifest()
}