package com.nightstalker.artic.core.local.ticket

import android.util.Log
import com.nightstalker.artic.core.local.database.AppDatabase
import com.nightstalker.artic.features.ticket.domain.TicketUseCase


class TicketStore(val dao: TicketDao) {

    suspend fun all(): List<LocalTicket> =  dao.getTickets()
    fun all(term: String): List<LocalTicket> = dao.searchAll(term)
    fun findById(id: Long): LocalTicket = dao.findById(id)

    suspend fun save(tickets: List<TicketUseCase>) {
        Log.d("Ticket_save"," 1 size =  ${tickets.size}")
        tickets.forEach{
            dao.insert( it.toLocal())
        }
        Log.d("Ticket_save"," 2 size =  ${tickets.size}")
    }

     private fun TicketUseCase.toLocal() = LocalTicket(
        id = id,
        title = title,
        exhibitionId = exhibitionId,
        galleryId = galleryId,
        galleryTitle = galleryTitle,
        aicEndAt = aicEndAt,
        aicStartAt = aicStartAt,
        shortDescription = shortDescription,
        numberOfPersons = numberOfPersons,
        timestamp = timestamp,
    )

     private fun LocalTicket.fromLocal() = TicketUseCase(
        id = id,
        title = title,
        exhibitionId = exhibitionId,
        galleryId = galleryId,
        galleryTitle = galleryTitle,
        aicEndAt = aicEndAt,
        aicStartAt = aicStartAt,
        shortDescription = shortDescription,
        numberOfPersons = numberOfPersons,
        timestamp = timestamp,
    )
}