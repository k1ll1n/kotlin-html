package com.araksis.ktml.material.elements

import com.araksis.ktml.dsl.builders.core.div
import com.araksis.ktml.extensions.html.attr
import com.araksis.ktml.material.MaterialElement
import com.araksis.ktml.material.MdDialog
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement

open external class MaterialDialog : MaterialElement {
    val quick: Boolean
    val returnValue: String
    val type: String
    val noFocusTrap: Boolean
    var open: Boolean

    fun show()
    fun close(): String
}

inline fun MdDialog.headline(block: HTMLElement.() -> Unit = {}): HTMLDivElement = div {
    attr("slot", "headline")
    block.invoke(this)
}

inline fun MdDialog.content(block: HTMLElement.() -> Unit = {}): HTMLDivElement = div {
    attr("slot", "content")
    block.invoke(this)
}

inline fun MdDialog.actions(block: HTMLElement.() -> Unit = {}): HTMLDivElement = div {
    attr("slot", "actions")
    block.invoke(this)
}