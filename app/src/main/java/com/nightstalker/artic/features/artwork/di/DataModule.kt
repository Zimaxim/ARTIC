package com.nightstalker.artic.features.artwork.di

import com.nightstalker.artic.features.artwork.domain.repo.ArtWorkRepo
import com.nightstalker.artic.features.artwork.data.ArtWorkRepoImpl
import com.nightstalker.artic.network.ArtworksApiMapper
import com.nightstalker.artic.network.ExhibitionsApiMapper
import org.koin.dsl.module

val artworkDataModule = module {
    factory { ArtworksApiMapper(get()) }
    factory<ArtWorkRepo> { ArtWorkRepoImpl(get()) }
}