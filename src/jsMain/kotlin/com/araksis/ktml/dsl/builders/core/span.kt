package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLSpanElement

inline fun Document.span(init: HTMLElementInit<HTMLSpanElement> = {}): HTMLSpanElement =
    createElement("span", init)

inline fun HTMLElement.span(init: HTMLElementInit<HTMLSpanElement> = {}): HTMLSpanElement =
    createElement("span", init)

inline fun span(init: HTMLElementInit<HTMLSpanElement> = {}): HTMLSpanElement =
    createElement("span", init)