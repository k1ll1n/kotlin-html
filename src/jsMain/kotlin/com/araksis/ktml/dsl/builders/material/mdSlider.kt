package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdSlider
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdSlider(init: MdSlider.() -> Unit = {}): MdSlider {
    val button = MdSlider()
    appendChild(button)
    button.init()
    return button
}

inline fun mdSlider(init: MdSlider.() -> Unit = {}): MdSlider {
    val button = MdSlider()
    button.init()
    return button
}