package com.nightstalker.artic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nightstalker.artic.core.domain.model.ArtworkDefault
import com.nightstalker.artic.features.artwork.presentation.ui.ArtworkViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<ArtworkViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        viewModel.getArtwork(100226)
        viewModel.artworkLoaded.observe(this, ::logData)
    }

    private fun logData(artworkDefault: ArtworkDefault?) {
        Log.d("TAG", "logData: $artworkDefault")
    }
}