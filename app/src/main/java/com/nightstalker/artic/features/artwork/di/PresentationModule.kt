package com.nightstalker.artic.features.artwork.di

import com.nightstalker.artic.features.artwork.presentation.ui.ArtworkViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val artworkPresentationModule = module {
    viewModel { ArtworkViewModel(get()) }
}