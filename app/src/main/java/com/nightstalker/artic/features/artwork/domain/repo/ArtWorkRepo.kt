package com.nightstalker.artic.features.artwork.domain.repo

import com.nightstalker.artic.features.artwork.domain.Artwork

interface ArtWorkRepo {
   suspend fun getArtworkById(id: Int): Artwork
}