package com.nightstalker.artic.core.data.model


import com.google.gson.annotations.SerializedName

data class Contexts(
    @SerializedName("groupings")
    val groupings: List<String>
)