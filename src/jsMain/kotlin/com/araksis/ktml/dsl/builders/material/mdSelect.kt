package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdFilledSelect
import com.araksis.ktml.material.MdOutlinedSelect
import com.araksis.ktml.material.MdSelectOption
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdFilledSelect(init: MdFilledSelect.() -> Unit = {}): MdFilledSelect {
    val button = MdFilledSelect()
    appendChild(button)
    button.init()
    return button
}

inline fun mdFilledSelect(init: MdFilledSelect.() -> Unit = {}): MdFilledSelect {
    val button = MdFilledSelect()
    button.init()
    return button
}

inline fun HTMLElement.mdOutlinedSelect(init: MdOutlinedSelect.() -> Unit = {}): MdOutlinedSelect {
    val button = MdOutlinedSelect()
    appendChild(button)
    button.init()
    return button
}

inline fun mdOutlinedSelect(init: MdOutlinedSelect.() -> Unit = {}): MdOutlinedSelect {
    val button = MdOutlinedSelect()
    button.init()
    return button
}

inline fun HTMLElement.mdSelectOption(init: MdSelectOption.() -> Unit = {}): MdSelectOption {
    val button = MdSelectOption()
    appendChild(button)
    button.init()
    return button
}

inline fun mdSelectOption(init: MdSelectOption.() -> Unit = {}): MdSelectOption {
    val button = MdSelectOption()
    button.init()
    return button
}