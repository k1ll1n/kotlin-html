package com.araksis.ktml.material.elements

import com.araksis.ktml.dsl.builders.material.mdIcon
import com.araksis.ktml.material.MaterialElement
import com.araksis.ktml.material.MdIcon

open external class MaterialChip : MaterialElement {
    var disabled: Boolean
    var alwaysFocusable: Boolean
    var label: String
    var hasIcon: Boolean
}

fun MaterialChip.setIcon(iconName: String): MdIcon {
    return mdIcon {
        textContent = iconName
        setAsIconSlot()
    }
}