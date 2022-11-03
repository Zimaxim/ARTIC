package com.nightstalker.artic.core.local.ticket

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


@Dao
interface TicketDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(ticket: LocalTicket)

    @Delete
    suspend fun remove(ticket: LocalTicket)

    @Update
    suspend fun update(ticket: LocalTicket)

    @Query("SELECT * FROM tickets")
    fun getAll() : LiveData<List<LocalTicket>>

    @Query("SELECT * FROM tickets WHERE id = :key")
    fun get(key: Long) : LocalTicket


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(localTicket: LocalTicket)


    @Query("SELECT * FROM tickets WHERE upper(title) like  upper('%'||:term||'%')  ")
    fun searchAll(term: String): List<LocalTicket>

    @Query("SELECT * FROM tickets WHERE id = :id  ")
    fun findById(id: Long): LocalTicket

    @Query("SELECT * FROM tickets WHERE id = :id  ")
    suspend fun getTicketById(id: Long): LocalTicket

    @Query("SELECT * FROM tickets")
    suspend fun getTickets(): List<LocalTicket>



}