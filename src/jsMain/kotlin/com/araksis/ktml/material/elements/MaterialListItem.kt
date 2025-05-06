package com.araksis.ktml.material.elements

import com.araksis.ktml.dsl.builders.material.mdIcon
import com.araksis.ktml.extensions.html.attr
import com.araksis.ktml.material.MaterialElement
import com.araksis.ktml.material.MdIcon
import org.w3c.dom.Element

open external class MaterialListItem : MaterialElement {
    var disabled: Boolean
    var type: String
    var href: String
    var target: String
}

// TODO заменить на DSL
fun MaterialListItem.setContent(content: Element) {
    content.attr("slot", "headline")
    appendChild(content)
}

fun MaterialListItem.setStartIcon(iconName: String): MdIcon {
    return mdIcon {
        textContent = iconName
        setAsIconSlot()
    }.apply { attr("slot", "start") }
}

fun MaterialListItem.setEndIcon(iconName: String): MdIcon {
    return mdIcon {
        textContent = iconName
        setAsIconSlot()
    }.apply { attr("slot", "end") }
}