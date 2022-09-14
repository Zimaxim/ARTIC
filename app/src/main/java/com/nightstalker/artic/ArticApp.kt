package com.nightstalker.artic

import android.app.Application
import com.nightstalker.artic.features.di.dataModule
import com.nightstalker.artic.features.di.networkModule
import com.nightstalker.artic.features.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ArticApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@ArticApp)
            modules(dataModule, networkModule, presentationModule)
        }
    }
}