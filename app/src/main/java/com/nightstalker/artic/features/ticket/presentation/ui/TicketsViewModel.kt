package com.nightstalker.artic.features.ticket.presentation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nightstalker.artic.features.ticket.domain.TicketUseCase
import com.nightstalker.artic.features.ticket.domain.repo.TicketsRepo
import kotlinx.coroutines.launch


/**
 * ViewModel для отображения списка билетов
 * @author Maxim Zimin
 * @created 2022-10-13
 */

class TicketsViewModel(private val repo: TicketsRepo)  : ViewModel() {
    private var _ticketLoaded = MutableLiveData<TicketUseCase>()
    val ticketLoaded: LiveData<TicketUseCase> get() = _ticketLoaded

    private var _ticketsLoaded = MutableLiveData<List<TicketUseCase>>()
    val ticketsLoaded: LiveData<List<TicketUseCase>> get() = _ticketsLoaded

    fun getTicket(id: Long) {
        viewModelScope.launch {
            _ticketLoaded.postValue(repo.getTicketById(id))
        }
    }

    fun getTickets() {
        viewModelScope.launch {
            _ticketsLoaded.postValue(
                repo.getTickets()?: listOf(TicketUseCase())

            )
        }
    }


}