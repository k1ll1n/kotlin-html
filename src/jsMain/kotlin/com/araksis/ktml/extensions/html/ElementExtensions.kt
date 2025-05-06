package com.araksis.ktml.extensions.html

import com.araksis.ktml.extensions.checkTypeOrError
import com.araksis.ktml.material.MaterialElement
import org.w3c.dom.Element
import org.w3c.dom.asList
import org.w3c.dom.events.Event

inline fun <reified T> Element.find(selector: String): T {
    val node = this.querySelector(selector) ?: error("Element '$selector' not found")
    return node.checkTypeOrError<T>(selector)
}

inline fun <reified T> Element.findById(id: String): T {
    if (!id.startsWith("#")) error("Selector for findById must start with '#'. Provided: '$id'")
    return this.find(id)
}

inline fun <reified T> Element.findAll(selector: String): List<T> {
    return this.querySelectorAll(selector).asList().map { it.checkTypeOrError(selector) }
}

fun Element.attr(key: String, value: String?) {
    if (!value.isNullOrBlank()) {
        setAttribute(key, value)
    } else {
        removeAttribute(key)
    }
}

fun Element.attr(key: String): String {
    return getAttribute(key) ?: ""
}

fun Element.click(handler: (Event) -> Unit) = this.addEventListener("click", handler)
fun Element.change(handler: (Event) -> Unit) = this.addEventListener("change", handler)
fun Element.mouseover(handler: (Event) -> Unit) = this.addEventListener("mouseover", handler)
fun Element.mouseout(handler: (Event) -> Unit) = this.addEventListener("mouseout", handler)
fun Element.keydown(handler: (Event) -> Unit) = this.addEventListener("keydown", handler)
fun Element.keyup(handler: (Event) -> Unit) = this.addEventListener("keyup", handler)
fun Element.submit(handler: (Event) -> Unit) = this.addEventListener("submit", handler)
fun Element.focus(handler: (Event) -> Unit) = this.addEventListener("focus", handler)
fun Element.blur(handler: (Event) -> Unit) = this.addEventListener("blur", handler)
fun Element.input(handler: (Event) -> Unit) = this.addEventListener("input", handler)
fun Element.dblclick(handler: (Event) -> Unit) = this.addEventListener("dblclick", handler)
fun Element.contextmenu(handler: (Event) -> Unit) = this.addEventListener("contextmenu", handler)
fun Element.resize(handler: (Event) -> Unit) = this.addEventListener("resize", handler)
fun Element.scroll(handler: (Event) -> Unit) = this.addEventListener("scroll", handler)