package com.nightstalker.artic.features.exhibition.di

import com.nightstalker.artic.features.exhibition.presentation.ui.ExhibitionsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val exhibitionPresentationModule = module {
    viewModel { ExhibitionsViewModel(get()) }
}