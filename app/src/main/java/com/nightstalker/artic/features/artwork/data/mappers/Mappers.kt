package com.nightstalker.artic.features.artwork.data.mappers

import com.nightstalker.artic.core.data.model.artwork.ArtworkDefaultModel
import com.nightstalker.artic.core.domain.model.ArtworkDefault

/**
 * Функции для преобразования данных из дата слоя в домайн
 *
 * @author Tamerlan Mamukhov
 */

fun ArtworkDefaultModel.toDomain() : ArtworkDefault =
    ArtworkDefault(id = data.id, title = data.title)