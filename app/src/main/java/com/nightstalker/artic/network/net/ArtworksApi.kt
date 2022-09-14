package com.nightstalker.artic.network.net

import com.nightstalker.artic.core.data.model.ArtworkDefaultModel
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
    suspend fun getArtworkById(@Path(ID) id: Int): ArtworkDefaultModel
}