package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLFormElement
import org.w3c.dom.HTMLTableRowElement

inline fun Document.tr(init: HTMLElementInit<HTMLTableRowElement> = {}): HTMLTableRowElement =
    createElement("tr", init)

inline fun HTMLElement.tr(init: HTMLElementInit<HTMLTableRowElement> = {}): HTMLTableRowElement =
    createElement("tr", init)

inline fun tr(init: HTMLElementInit<HTMLTableRowElement> = {}): HTMLTableRowElement =
    createElement("tr", init)