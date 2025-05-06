package com.araksis.ktml.extensions.html

import com.araksis.ktml.extensions.checkTypeOrError
import com.araksis.ktml.material.MaterialElement
import org.w3c.dom.Element
import org.w3c.dom.asList
import org.w3c.dom.events.Event

inline fun <reified T> MaterialElement.find(selector: String): T {
    val node = this.querySelector(selector) ?: error("Element '$selector' not found")
    return node.checkTypeOrError<T>(selector)
}

inline fun <reified T> MaterialElement.findById(id: String): T {
    if (!id.startsWith("#")) error("Selector for findById must start with '#'. Provided: '$id'")
    return this.find(id)
}

inline fun <reified T> MaterialElement.findAll(selector: String): List<T> {
    return this.querySelectorAll(selector).asList().map { it.checkTypeOrError(selector) }
}

fun MaterialElement.attr(key: String, value: String) {
    this.setAttribute(key, value)
}

fun MaterialElement.attr(key: String): String {
    return this.getAttribute(key) ?: ""
}

fun MaterialElement.click(handler: (Event) -> Unit) = this.addEventListener("click", handler)
fun MaterialElement.change(handler: (Event) -> Unit) = this.addEventListener("change", handler)
fun MaterialElement.mouseover(handler: (Event) -> Unit) = this.addEventListener("mouseover", handler)
fun MaterialElement.mouseout(handler: (Event) -> Unit) = this.addEventListener("mouseout", handler)
fun MaterialElement.keydown(handler: (Event) -> Unit) = this.addEventListener("keydown", handler)
fun MaterialElement.keyup(handler: (Event) -> Unit) = this.addEventListener("keyup", handler)
fun MaterialElement.submit(handler: (Event) -> Unit) = this.addEventListener("submit", handler)
fun MaterialElement.focus(handler: (Event) -> Unit) = this.addEventListener("focus", handler)
fun MaterialElement.blur(handler: (Event) -> Unit) = this.addEventListener("blur", handler)
fun MaterialElement.input(handler: (Event) -> Unit) = this.addEventListener("input", handler)
fun MaterialElement.dblclick(handler: (Event) -> Unit) = this.addEventListener("dblclick", handler)
fun MaterialElement.contextmenu(handler: (Event) -> Unit) = this.addEventListener("contextmenu", handler)
fun MaterialElement.resize(handler: (Event) -> Unit) = this.addEventListener("resize", handler)
fun MaterialElement.scroll(handler: (Event) -> Unit) = this.addEventListener("scroll", handler)