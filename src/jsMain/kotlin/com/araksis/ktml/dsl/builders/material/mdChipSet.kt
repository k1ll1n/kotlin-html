package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.*
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdChipSet(init: MdChipSet.() -> Unit = {}): MdChipSet {
    val button = MdChipSet()
    appendChild(button)
    button.init()
    return button
}

inline fun mdChipSet(init: MdChipSet.() -> Unit = {}): MdChipSet {
    val button = MdChipSet()
    button.init()
    return button
}

inline fun HTMLElement.mdAssistChip(init: MdAssistChip.() -> Unit = {}): MdAssistChip {
    val button = MdAssistChip()
    appendChild(button)
    button.init()
    return button
}

inline fun mdAssistChip(init: MdAssistChip.() -> Unit = {}): MdAssistChip {
    val button = MdAssistChip()
    button.init()
    return button
}

inline fun HTMLElement.mdFilterChip(init: MdFilterChip.() -> Unit = {}): MdFilterChip {
    val button = MdFilterChip()
    appendChild(button)
    button.init()
    return button
}

inline fun mdFilterChip(init: MdFilterChip.() -> Unit = {}): MdFilterChip {
    val button = MdFilterChip()
    button.init()
    return button
}

inline fun HTMLElement.mdInputChip(init: MdInputChip.() -> Unit = {}): MdInputChip {
    val button = MdInputChip()
    appendChild(button)
    button.init()
    return button
}

inline fun mdInputChip(init: MdInputChip.() -> Unit = {}): MdInputChip {
    val button = MdInputChip()
    button.init()
    return button
}

inline fun HTMLElement.mdSuggestionChip(init: MdSuggestionChip.() -> Unit = {}): MdSuggestionChip {
    val button = MdSuggestionChip()
    appendChild(button)
    button.init()
    return button
}

inline fun mdSuggestionChip(init: MdSuggestionChip.() -> Unit = {}): MdSuggestionChip {
    val button = MdSuggestionChip()
    button.init()
    return button
}