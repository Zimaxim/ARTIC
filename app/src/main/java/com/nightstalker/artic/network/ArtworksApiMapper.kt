package com.nightstalker.artic.network

import com.nightstalker.artic.core.network.BaseApiMapper
import com.nightstalker.artic.core.domain.model.ArtworkDefault
import com.nightstalker.artic.features.artwork.data.mappers.toDomain
import com.nightstalker.artic.network.net.ArtworksApi

class ArtworksApiMapper(private val api: ArtworksApi) : BaseApiMapper(){
    suspend fun getArtWorkById(id: Int) : ArtworkDefault = api.getArtworkById(id).toDomain()
}