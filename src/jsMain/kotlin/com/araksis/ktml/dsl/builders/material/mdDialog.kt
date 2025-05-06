package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdDialog
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdDialog(init: MdDialog.() -> Unit = {}): MdDialog {
    val button = MdDialog()
    appendChild(button)
    button.init()
    return button
}

inline fun mdDialog(init: MdDialog.() -> Unit = {}): MdDialog {
    val button = MdDialog()
    button.init()
    return button
}