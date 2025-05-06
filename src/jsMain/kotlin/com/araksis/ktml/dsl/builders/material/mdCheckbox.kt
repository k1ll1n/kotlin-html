package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdCheckbox
import com.araksis.ktml.material.MdRadio
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdCheckbox(init: MdCheckbox.() -> Unit = {}): MdCheckbox {
    val button = MdCheckbox()
    appendChild(button)
    button.init()
    return button
}

inline fun mdCheckbox(init: MdCheckbox.() -> Unit = {}): MdCheckbox {
    val button = MdCheckbox()
    button.init()
    return button
}

inline fun HTMLElement.mdRadio(init: MdRadio.() -> Unit = {}): MdRadio {
    val button = MdRadio()
    appendChild(button)
    button.init()
    return button
}

inline fun mdRadio(init: MdRadio.() -> Unit = {}): MdRadio {
    val button = MdRadio()
    button.init()
    return button
}