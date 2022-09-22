package com.nightstalker.artic.network.net

import com.nightstalker.artic.core.data.model.exhibition.detail.ExhibitionModel
import com.nightstalker.artic.core.data.model.exhibition.list.ExhibitionsListResult
import com.nightstalker.artic.network.ApiConstants.ID
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Запросы получения выставок
 *
 * @author Tamerlan Mamukhov on 2022-09-16
 */
interface ExhibitionsApi {
    @GET("exhibitions/{$ID}/")
    suspend fun getExhibitionById(@Path(ID) id: Int): ExhibitionModel

    @GET("exhibitions")
    suspend fun getExhibitions(): ExhibitionsListResult
}