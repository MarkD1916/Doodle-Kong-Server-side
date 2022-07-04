package com.example.models

import com.example.util.Constants.TYPE_CHOSEN_WORD

data class ChosenWord(
    val chosenWord: String,
    val roomName: String
): BaseModel(TYPE_CHOSEN_WORD)
