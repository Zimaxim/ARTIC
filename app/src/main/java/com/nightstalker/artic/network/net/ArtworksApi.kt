package com.nightstalker.artic.network.net

import com.nightstalker.artic.core.data.model.artwork.detail.ArtworkModel
import com.nightstalker.artic.core.data.model.artwork.list.ArtworksListResult
import com.nightstalker.artic.core.data.model.artwork.detail.manifest.ArtworkManifestModel
import com.nightstalker.artic.network.ApiConstants.ID
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Запросы получения произведений искусства
 *
 * @author Tamerlan Mamukhov on 2022-09-13
 */
interface ArtworksApi {
    @GET("artworks/{$ID}/")
    suspend fun getArtworkById(@Path(ID) id: Int): ArtworkModel

    @GET("artworks")
    suspend fun getArtworks(): ArtworksListResult

    @GET("artworks/{$ID}/manifest.json")
    suspend fun getArtworkManifest(@Path(ID) id: Int): ArtworkManifestModel
}