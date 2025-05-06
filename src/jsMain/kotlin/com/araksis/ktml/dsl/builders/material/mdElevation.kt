package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdElevation
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdElevation(init: MdElevation.() -> Unit = {}): MdElevation {
    val button = MdElevation()
    appendChild(button)
    button.init()
    return button
}

inline fun mdElevation(init: MdElevation.() -> Unit = {}): MdElevation {
    val button = MdElevation()
    button.init()
    return button
}