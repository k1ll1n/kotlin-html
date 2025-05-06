package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdPrimaryTab
import com.araksis.ktml.material.MdSecondaryTab
import com.araksis.ktml.material.MdTabs
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdTabs(init: MdTabs.() -> Unit = {}): MdTabs {
    val button = MdTabs()
    appendChild(button)
    button.init()
    return button
}

inline fun mdTabs(init: MdTabs.() -> Unit = {}): MdTabs {
    val button = MdTabs()
    button.init()
    return button
}

inline fun HTMLElement.mdPrimaryTab(init: MdPrimaryTab.() -> Unit = {}): MdPrimaryTab {
    val button = MdPrimaryTab()
    appendChild(button)
    button.init()
    return button
}

inline fun mdPrimaryTab(init: MdPrimaryTab.() -> Unit = {}): MdPrimaryTab {
    val button = MdPrimaryTab()
    button.init()
    return button
}

inline fun HTMLElement.mdSecondaryTab(init: MdSecondaryTab.() -> Unit = {}): MdSecondaryTab {
    val button = MdSecondaryTab()
    appendChild(button)
    button.init()
    return button
}

inline fun mdSecondaryTab(init: MdSecondaryTab.() -> Unit = {}): MdSecondaryTab {
    val button = MdSecondaryTab()
    button.init()
    return button
}