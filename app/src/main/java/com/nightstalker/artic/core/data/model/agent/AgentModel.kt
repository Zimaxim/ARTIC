package com.nightstalker.artic.core.data.model.agent


import com.google.gson.annotations.SerializedName
import com.nightstalker.artic.core.data.model.common.Config
import com.nightstalker.artic.core.data.model.common.Info

data class AgentModel(
    @SerializedName("config")
    val config: Config,
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("info")
    val info: Info
)