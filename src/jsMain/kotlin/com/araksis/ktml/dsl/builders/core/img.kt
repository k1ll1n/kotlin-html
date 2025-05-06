package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import com.araksis.ktml.extensions.html.attr
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLImageElement

inline fun Document.img(init: HTMLElementInit<HTMLImageElement> = {}): HTMLImageElement =
    createElement("img", init)

inline fun HTMLElement.img(init: HTMLElementInit<HTMLImageElement> = {}): HTMLImageElement =
    createElement("img", init)

inline fun img(init: HTMLElementInit<HTMLImageElement> = {}): HTMLImageElement =
    createElement("img", init)

fun HTMLImageElement.setAsIconSlot() {
    attr("slot", "icon")
}