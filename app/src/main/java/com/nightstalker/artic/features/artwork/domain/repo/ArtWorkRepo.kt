package com.nightstalker.artic.features.artwork.domain.repo

import com.nightstalker.artic.features.artwork.domain.Artwork
import com.nightstalker.artic.features.artwork.domain.ArtworkManifest

interface ArtWorkRepo {
   suspend fun getArtworkById(id: Int): Artwork
   suspend fun getArtworks(): List<Artwork>
   suspend fun getArtworkManifest(id: Int): ArtworkManifest
}