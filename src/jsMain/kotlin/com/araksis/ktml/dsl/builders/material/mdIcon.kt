package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.*
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdIcon(init: MdIcon.() -> Unit = {}): MdIcon {
    val button = MdIcon()
    appendChild(button)
    button.init()
    return button
}

inline fun mdIcon(init: MdIcon.() -> Unit = {}): MdIcon {
    val button = MdIcon()
    button.init()
    return button
}

