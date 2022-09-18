package com.nightstalker.artic

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.nightstalker.artic.core.utils.ImageLinkConstructor
import com.nightstalker.artic.databinding.ActivityMainBinding
import com.nightstalker.artic.features.artwork.domain.Artwork
import com.nightstalker.artic.features.artwork.presentation.ui.ArtworkViewModel
import com.nightstalker.artic.features.exhibition.domain.Exhibition
import com.nightstalker.artic.features.exhibition.presentation.ui.ExhibitionsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModel<ArtworkViewModel>()
    private val exhibitionsViewModel by viewModel<ExhibitionsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        viewModel.getArtwork(100226)
        viewModel.artworkLoaded.observe(this, ::logData)

        exhibitionsViewModel.getExhibition(9779)
        exhibitionsViewModel.exhibitionLoaded.observe(this, ::logEx)
    }

    private fun logEx(exhibition: Exhibition?) {
        Log.d("TAG", "logEx: $exhibition")
    }

    private fun logData(artwork: Artwork?) {
        Log.d("TAG", "logData: $artwork")
        val imageUrl = artwork?.imageId.orEmpty()

        val url = ImageLinkConstructor.createImageDefaultLink(imageUrl)

        Glide
            .with(this)
            .load(url)
            .into(binding.iv)
    }
}