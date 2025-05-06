package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdFilledTextField
import com.araksis.ktml.material.MdOutlinedTextField
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdFilledTextField(init: MdFilledTextField.() -> Unit = {}): MdFilledTextField {
    val button = MdFilledTextField()
    appendChild(button)
    button.init()
    return button
}

inline fun mdFilledTextField(init: MdFilledTextField.() -> Unit = {}): MdFilledTextField {
    val button = MdFilledTextField()
    button.init()
    return button
}

inline fun HTMLElement.mdOutlinedTextField(init: MdOutlinedTextField.() -> Unit = {}): MdOutlinedTextField {
    val button = MdOutlinedTextField()
    appendChild(button)
    button.init()
    return button
}

inline fun mdOutlinedTextField(init: MdOutlinedTextField.() -> Unit = {}): MdOutlinedTextField {
    val button = MdOutlinedTextField()
    button.init()
    return button
}