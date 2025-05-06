package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.Document
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement

inline fun Document.div(init: HTMLElementInit<HTMLDivElement> = {}): HTMLDivElement =
    createElement("div", init)

inline fun HTMLElement.div(init: HTMLElementInit<HTMLDivElement> = {}): HTMLDivElement =
    createElement("div", init)

inline fun div(init: HTMLElementInit<HTMLDivElement> = {}): HTMLDivElement =
    createElement("div", init)