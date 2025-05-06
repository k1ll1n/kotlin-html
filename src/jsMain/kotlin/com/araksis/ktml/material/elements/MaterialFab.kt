package com.araksis.ktml.material.elements

import com.araksis.ktml.dsl.builders.material.mdIcon
import com.araksis.ktml.material.MaterialElement
import com.araksis.ktml.material.MdIcon
import com.araksis.ktml.material.enums.FabSize
import com.araksis.ktml.material.enums.FabVariant

open external class MaterialFab : MaterialElement {
    var variant: String
    var size: String
    var label: String
    var lowered: String

    var ariaLabel: String
}

fun MaterialFab.setIcon(iconName: String): MdIcon {
    return mdIcon {
        textContent = iconName
        setAsIconSlot()
    }
}

fun MaterialFab.setVariant(fabVariant: FabVariant) {
    variant = fabVariant.name.lowercase()
}

fun MaterialFab.setSize(fabSize: FabSize) {
    size = fabSize.name.lowercase()
}