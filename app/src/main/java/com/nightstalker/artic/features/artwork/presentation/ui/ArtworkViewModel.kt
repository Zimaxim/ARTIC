package com.nightstalker.artic.features.artwork.presentation.ui

import androidx.lifecycle.*
import com.nightstalker.artic.core.domain.model.ArtworkDefault
import com.nightstalker.artic.features.artwork.domain.repo.ArtWorkRepo
import kotlinx.coroutines.launch

class ArtworkViewModel(
    private val repo: ArtWorkRepo
) : ViewModel() {
    private var _artworkLoaded = MutableLiveData<ArtworkDefault>()
    val artworkLoaded: LiveData<ArtworkDefault> get() = _artworkLoaded

    fun getArtwork(id: Int) {
        viewModelScope.launch {
            _artworkLoaded.postValue(repo.getArtworkById(id))
        }
    }
}