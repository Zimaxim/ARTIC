package com.nightstalker.artic.features.di

import androidx.room.Room
import com.nightstalker.artic.core.local.database.AppDatabase
import com.nightstalker.artic.core.local.ticket.LocalTicketRepository
import com.nightstalker.artic.core.local.ticket.TicketDao
import org.koin.dsl.module

val repositoryModule = module {
    single { LocalTicketRepository(get()) }
}

//val daoModule = module {
//    single { AppDatabase.getInstance(androidContext()).tickets }
//}

val databaseModule = module {
    // Room Database
    single<AppDatabase> {
        Room
            .databaseBuilder(get(), AppDatabase::class.java, "artic.db")
            .build()
    }
    // TicketsDAO
    single<TicketDao> { get<AppDatabase>().getTicketsDao() }
}
