package com.araksis.ktml.material.elements

import com.araksis.ktml.material.MaterialElement

open external class MaterialTab : MaterialElement {
    val isTab: Boolean
    val active: Boolean
    val hasIcon: Boolean
    val iconOnly: Boolean
    val selected: Boolean
}

open external class MaterialPrimaryTab : MaterialTab {
    val inlineIcon: Boolean
}

open external class MaterialSecondaryTab : MaterialTab