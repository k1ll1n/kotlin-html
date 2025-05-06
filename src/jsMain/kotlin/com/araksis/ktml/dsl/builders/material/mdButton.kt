package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.*
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdElevatedButton(init: MdElevatedButton.() -> Unit = {}): MdElevatedButton {
    val button = MdElevatedButton()
    appendChild(button)
    button.init()
    return button
}

inline fun mdElevatedButton(init: MdElevatedButton.() -> Unit = {}): MdElevatedButton {
    val button = MdElevatedButton()
    button.init()
    return button
}

inline fun HTMLElement.mdFilledButton(init: MdFilledButton.() -> Unit = {}): MdFilledButton {
    val button = MdFilledButton()
    appendChild(button)
    button.init()
    return button
}

inline fun mdFilledButton(init: MdFilledButton.() -> Unit = {}): MdFilledButton {
    val button = MdFilledButton()
    button.init()
    return button
}

inline fun HTMLElement.mdFilledTonalButton(init: MdFilledTonalButton.() -> Unit = {}): MdFilledTonalButton {
    val button = MdFilledTonalButton()
    appendChild(button)
    button.init()
    return button
}

inline fun mdFilledTonalButton(init: MdFilledTonalButton.() -> Unit = {}): MdFilledTonalButton {
    val button = MdFilledTonalButton()
    button.init()
    return button
}

inline fun HTMLElement.mdOutlinedButton(init: MdOutlinedButton.() -> Unit = {}): MdOutlinedButton {
    val button = MdOutlinedButton()
    appendChild(button)
    button.init()
    return button
}

inline fun mdOutlinedButton(init: MdOutlinedButton.() -> Unit = {}): MdOutlinedButton {
    val button = MdOutlinedButton()
    button.init()
    return button
}

inline fun HTMLElement.mdTextButton(init: MdTextButton.() -> Unit = {}): MdTextButton {
    val button = MdTextButton()
    appendChild(button)
    button.init()
    return button
}

inline fun mdTextButton(init: MdTextButton.() -> Unit = {}): MdTextButton {
    val button = MdTextButton()
    button.init()
    return button
}



