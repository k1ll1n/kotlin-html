package com.araksis.ktml.material.elements

import com.araksis.ktml.dsl.builders.core.img
import com.araksis.ktml.dsl.builders.core.setAsIconSlot
import org.w3c.dom.HTMLImageElement

open external class MaterialInputChip : MaterialChipLink {
    var avatar: Boolean
    var removeOnly: Boolean
    var selected: Boolean
    var ariaLabelRemove: Boolean
}

fun MaterialInputChip.setAvatar(avatarUrl: String): HTMLImageElement {
    return img {
        src = avatarUrl
        setAsIconSlot()
    }
}