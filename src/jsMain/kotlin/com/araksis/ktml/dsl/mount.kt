package com.araksis.ktml.dsl

import com.araksis.ktml.extensions.html.find
import kotlinx.browser.document
import org.w3c.dom.HTMLElement

fun HTMLElement.mount(block: HTMLElement.() -> HTMLElement): HTMLElement {
    return block()
}

fun String.mount(block: HTMLElement.() -> HTMLElement): HTMLElement {
    return document.find<HTMLElement>(this).block()
}