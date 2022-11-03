package com.nightstalker.artic.core.local.ticket

import androidx.lifecycle.LiveData

class LocalTicketRepository(private val localTicketDao: TicketDao) {

    val tickets: LiveData<List<LocalTicket>>
        get() = localTicketDao.getAll()

    suspend fun getTickets(): List<LocalTicket> = localTicketDao.getTickets()

    suspend fun save(newTitle: String) {
        localTicketDao.save(LocalTicket(title = newTitle))
    }

    suspend fun update(localTicket: LocalTicket ) {
        localTicketDao.update(localTicket)
    }

    suspend fun delete(localTicket: LocalTicket) {
        localTicketDao.remove(localTicket)
    }

    fun get(localTicket: LocalTicket) : LocalTicket =
        localTicketDao.get(localTicket.id)

}
