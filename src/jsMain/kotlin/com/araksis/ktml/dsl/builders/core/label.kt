package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import kotlinx.browser.document
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLLabelElement

inline fun Document.label(init: HTMLElementInit<HTMLLabelElement> = {}): HTMLLabelElement
        = createElement("label", init)

inline fun HTMLElement.label(init: HTMLElementInit<HTMLLabelElement> = {}): HTMLLabelElement
    = createElement("label", init)

inline fun label(init: HTMLElementInit<HTMLLabelElement> = {}): HTMLLabelElement
        = createElement("label", init)

fun HTMLLabelElement.setText(text: String) {
    appendChild(document.createTextNode(text))
}