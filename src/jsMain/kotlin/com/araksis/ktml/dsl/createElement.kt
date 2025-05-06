package com.araksis.ktml.dsl

import kotlinx.browser.document
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement

inline fun <reified T : HTMLElement> Document.createElement(tagName: String, init: HTMLElementInit<T>): T {
    val element = createElement(tagName).unsafeCast<T>()
    element.init()
    return element
}

inline fun <reified T : HTMLElement> HTMLElement.createElement(tagName: String, init: HTMLElementInit<T>): T {
    val element = document.createElement<T>(tagName, init)
    appendChild(element)
    return element
}

inline fun <reified T : HTMLElement> createElement(tagName: String, init: HTMLElementInit<T>): T {
    return document.createElement<T>(tagName, init)
}