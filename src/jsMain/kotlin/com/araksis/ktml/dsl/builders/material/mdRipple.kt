package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdRipple
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdRipple(init: MdRipple.() -> Unit = {}): MdRipple {
    val button = MdRipple()
    appendChild(button)
    button.init()
    return button
}

inline fun mdRipple(init: MdRipple.() -> Unit = {}): MdRipple {
    val button = MdRipple()
    button.init()
    return button
}