package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdSwitch
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdSwitch(init: MdSwitch.() -> Unit = {}): MdSwitch {
    val button = MdSwitch()
    appendChild(button)
    button.init()
    return button
}

inline fun mdSwitch(init: MdSwitch.() -> Unit = {}): MdSwitch {
    val button = MdSwitch()
    button.init()
    return button
}
