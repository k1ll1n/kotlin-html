package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdMenu
import com.araksis.ktml.material.MdMenuItem
import com.araksis.ktml.material.MdSubMenu
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdMenu(init: MdMenu.() -> Unit = {}): MdMenu {
    val button = MdMenu()
    appendChild(button)
    button.init()
    return button
}

inline fun mdMenu(init: MdMenu.() -> Unit = {}): MdMenu {
    val button = MdMenu()
    button.init()
    return button
}

inline fun HTMLElement.mdMenuItem(init: MdMenuItem.() -> Unit = {}): MdMenuItem {
    val button = MdMenuItem()
    appendChild(button)
    button.init()
    return button
}

inline fun mdMenuItem(init: MdMenuItem.() -> Unit = {}): MdMenuItem {
    val button = MdMenuItem()
    button.init()
    return button
}

inline fun HTMLElement.mdSubMenu(init: MdSubMenu.() -> Unit = {}): MdSubMenu {
    val button = MdSubMenu()
    appendChild(button)
    button.init()
    return button
}

inline fun mdSubMenu(init: MdSubMenu.() -> Unit = {}): MdSubMenu {
    val button = MdSubMenu()
    button.init()
    return button
}