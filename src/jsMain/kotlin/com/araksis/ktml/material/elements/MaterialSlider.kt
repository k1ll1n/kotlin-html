package com.araksis.ktml.material.elements

import com.araksis.ktml.material.MaterialInput

open external class MaterialSlider : MaterialInput {
    val valueStart: Float
    val valueEnd: Float
    val valueLabel: String
    val valueLabelStart: String
    val valueLabelEnd: String
    val ariaLabelStart: String
    val ariaValueTextStart: String
    val ariaLabelEnd: String
    val ariaValueTextEnd: String
    val ticks: Boolean
    val labeled: Boolean
    val range: Boolean
    val nameStart: String
    val nameEnd: String
}