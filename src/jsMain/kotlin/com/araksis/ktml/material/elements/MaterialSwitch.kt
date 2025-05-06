package com.araksis.ktml.material.elements

import com.araksis.ktml.material.MaterialInput

open external class MaterialSwitch : MaterialInput {
    val selected: Boolean
    val icons: Boolean
    val showOnlySelectedIcon: Boolean
}