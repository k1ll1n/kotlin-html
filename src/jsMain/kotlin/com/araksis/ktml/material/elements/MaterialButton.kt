package com.araksis.ktml.material.elements

import com.araksis.ktml.dsl.builders.material.mdIcon
import com.araksis.ktml.material.MaterialElement
import com.araksis.ktml.material.MdIcon

open external class MaterialButton : MaterialElement {
    var disabled: Boolean
    var softDisabled: Boolean
    var href: String
    var target: String
    var trailingIcon: Boolean
    var hasIcon: Boolean
    var type: String
    var value: String
    var name: String
}

fun MaterialButton.setIcon(iconName: String): MdIcon {
    return mdIcon {
        textContent = iconName
        setAsIconSlot()
    }
}

open external class MaterialDivider : MaterialElement {
    var inset: Boolean
    var insetStart: Boolean
    var insetEnd: Boolean
}