package com.nightstalker.artic.features.artwork.presentation.ui.list

import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import com.nightstalker.artic.databinding.ItemArtworkBinding
import com.nightstalker.artic.features.artwork.domain.Artwork

/**
 * @author Tamerlan Mamukhov
 * @created 2022-09-18
 */
class ArtworksListAdapter {
}

//fun cat2AdapterDelegate(itemClickedListener: (Artwork) -> Unit) =
//    adapterDelegateViewBinding<Artwork, List<Artwork>, ItemArtworkBinding>(
//        { layoutInflater, root -> ItemArtworkBinding.inflate(layoutInflater, root, false) }
//    ) {
//        binding.textTitle.setOnClickListener {
//            itemClickedListener(item)
//        }
//        bind {
//            binding.textTitle.text = item.title
////        binding.
//        }
//    }