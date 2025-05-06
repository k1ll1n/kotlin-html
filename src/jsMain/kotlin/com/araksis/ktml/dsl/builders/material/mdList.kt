package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdList
import com.araksis.ktml.material.MdListItem
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdList(init: MdList.() -> Unit = {}): MdList {
    val button = MdList()
    appendChild(button)
    button.init()
    return button
}

inline fun mdList(init: MdList.() -> Unit = {}): MdList {
    val button = MdList()
    button.init()
    return button
}

inline fun HTMLElement.mdListItem(init: MdListItem.() -> Unit = {}): MdListItem {
    val button = MdListItem()
    appendChild(button)
    button.init()
    return button
}

inline fun mdListItem(init: MdListItem.() -> Unit = {}): MdListItem {
    val button = MdListItem()
    button.init()
    return button
}