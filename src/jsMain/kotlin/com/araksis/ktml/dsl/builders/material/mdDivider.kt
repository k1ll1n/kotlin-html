package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdDivider
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdDivider(init: MdDivider.() -> Unit = {}): MdDivider {
    val button = MdDivider()
    appendChild(button)
    button.init()
    return button
}

inline fun mdDivider(init: MdDivider.() -> Unit = {}): MdDivider {
    val button = MdDivider()
    button.init()
    return button
}