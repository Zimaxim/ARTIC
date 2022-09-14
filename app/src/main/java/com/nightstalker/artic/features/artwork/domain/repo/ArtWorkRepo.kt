package com.nightstalker.artic.features.artwork.domain.repo

import com.nightstalker.artic.core.domain.model.ArtworkDefault

interface ArtWorkRepo {
   suspend fun getArtworkById(id: Int): ArtworkDefault
}