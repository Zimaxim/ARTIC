package com.nightstalker.artic.features.exhibition.di

import com.nightstalker.artic.features.exhibition.data.ExhibitionsRepoImpl
import com.nightstalker.artic.features.exhibition.domain.repo.ExhibitionsRepo
import com.nightstalker.artic.network.ExhibitionsApiMapper
import org.koin.dsl.module

val exhibitionDataModule = module {
    factory { ExhibitionsApiMapper(get()) }
    factory<ExhibitionsRepo> { ExhibitionsRepoImpl(get()) }
}