package com.nightstalker.artic.features.di

import com.nightstalker.artic.core.local.database.AppDatabase
import com.nightstalker.artic.core.local.ticket.LocalTicketRepository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val repositoryModule = module {
    single { LocalTicketRepository(get()) }
}

val daoModule = module {
    single { AppDatabase.getInstance(androidContext()).tickets }
}

val databaseModule = module {
    // Room Database
    single { AppDatabase.getInstance(get()) }
    // TicketsDAO


}
