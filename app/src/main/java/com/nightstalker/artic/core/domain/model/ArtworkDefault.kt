package com.nightstalker.artic.core.domain.model

/**
 * Класс произведения искусства
 *
 * @property id         ид
 * @property title      заголовок
 * @property imageId    ид картинки
 * @author Tamerlan Mamukhov
 */
data class ArtworkDefault(
    val id: Int,
    val title: String,
    val imageId: String
)
