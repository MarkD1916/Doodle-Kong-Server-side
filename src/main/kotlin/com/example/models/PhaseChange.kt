package com.example.models

import com.example.data.Room
import com.example.util.Constants.TYPE_PHASE_CHANGE

data class PhaseChange(
    var phase: Room.Phase?,
    var time: Long,
    val drawingPlayer: String? = null
) : BaseModel(TYPE_PHASE_CHANGE)
