package com.nightstalker.artic.network.net

import com.nightstalker.artic.network.ApiConstants.ID
import retrofit2.http.GET
import retrofit2.http.Path

// TODO: добавить отдельный API для картинок
/**
 * Интерфейс для получения картинок (на данный момент с экспонатов)
 *
 * @constructor Create empty Images api
 */
interface ImagesApi {
    @GET("https://www.artic.edu/iiif/2/{$ID}/full/843,/0/default.jpg")
    suspend fun getSmallImageById(@Path(ID) id: String): ArtImage
}

data class ArtImage(val id: String)