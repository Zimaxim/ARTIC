package com.nightstalker.artic.features.artwork.domain.repo

import com.nightstalker.artic.features.artwork.domain.Artwork
import com.nightstalker.artic.features.artwork.domain.ArtworkManifest

/**
 * Репозиторий получения экспонатов
 *
 * @author Tamerlan Mamukhov on 2022-09-13
 */
interface ArtworkRepo {
   suspend fun getArtworkById(id: Int): Artwork
   suspend fun getArtworks(): List<Artwork>
   suspend fun getArtworkManifest(id: Int): ArtworkManifest
}