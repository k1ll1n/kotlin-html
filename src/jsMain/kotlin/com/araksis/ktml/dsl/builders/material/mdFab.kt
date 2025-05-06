package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdBrandedFab
import com.araksis.ktml.material.MdFab
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdFab(init: MdFab.() -> Unit = {}): MdFab {
    val button = MdFab()
    appendChild(button)
    button.init()
    return button
}

inline fun mdFab(init: MdFab.() -> Unit = {}): MdFab {
    val button = MdFab()
    button.init()
    return button
}

inline fun HTMLElement.mdBrandedFab(init: MdBrandedFab.() -> Unit = {}): MdBrandedFab {
    val button = MdBrandedFab()
    appendChild(button)
    button.init()
    return button
}

inline fun mdBrandedFab(init: MdBrandedFab.() -> Unit = {}): MdBrandedFab {
    val button = MdBrandedFab()
    button.init()
    return button
}