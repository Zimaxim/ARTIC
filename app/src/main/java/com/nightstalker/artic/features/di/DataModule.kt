package com.nightstalker.artic.features.di

import com.nightstalker.artic.features.artwork.domain.repo.ArtWorkRepo
import com.nightstalker.artic.features.artwork.data.ArtWorkRepoImpl
import com.nightstalker.artic.network.ArtworksApiMapper
import org.koin.dsl.module

val dataModule = module {
    factory { ArtworksApiMapper(get()) }
    factory<ArtWorkRepo> { ArtWorkRepoImpl(get()) }
}