package com.example.studyapp.util

import androidx.compose.ui.graphics.Color
import com.example.studyapp.ui.theme.Green
import com.example.studyapp.ui.theme.Orange
import com.example.studyapp.ui.theme.Red

enum class Priority(val title:String, val color: Color, val value: Int){
    LOW(title = "low", color = Green, value = 0),
    MEDIUM(title = "Medium", color = Orange, value = 1),
    HIGH(title = "High", color = Red, value = 2);

    companion object {
        fun fromInt(value:Int) = values().firstOrNull(){it.value == value} ?: MEDIUM
    }
}