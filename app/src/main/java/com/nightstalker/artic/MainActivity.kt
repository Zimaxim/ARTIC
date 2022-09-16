package com.nightstalker.artic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.nightstalker.artic.core.domain.model.ArtworkDefault
import com.nightstalker.artic.core.utils.ImageLinkConstructor
import com.nightstalker.artic.databinding.ActivityMainBinding
import com.nightstalker.artic.features.artwork.presentation.ui.ArtworkViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModel<ArtworkViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        viewModel.getArtwork(100226)
        viewModel.artworkLoaded.observe(this, ::logData)
    }

    private fun logData(artworkDefault: ArtworkDefault?) {
        Log.d("TAG", "logData: $artworkDefault")
        val imageUrl = artworkDefault?.imageId.orEmpty()

        val url = ImageLinkConstructor.createImageDefaultLink(imageUrl)

        Glide
            .with(this)
            .load(url)
            .into(binding.iv)
    }
}