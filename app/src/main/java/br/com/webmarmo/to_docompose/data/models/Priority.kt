package br.com.webmarmo.to_docompose.data.models

import androidx.compose.ui.graphics.Color
import br.com.webmarmo.to_docompose.ui.theme.HighPriorityColor
import br.com.webmarmo.to_docompose.ui.theme.LowPriorityColor
import br.com.webmarmo.to_docompose.ui.theme.MediumPriorityColor
import br.com.webmarmo.to_docompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}