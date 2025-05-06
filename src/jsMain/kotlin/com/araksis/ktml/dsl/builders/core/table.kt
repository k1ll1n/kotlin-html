package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLTableElement

inline fun Document.table(init: HTMLElementInit<HTMLTableElement> = {}): HTMLTableElement =
    createElement("table", init)

inline fun HTMLElement.table(init: HTMLElementInit<HTMLTableElement> = {}): HTMLTableElement =
    createElement("table", init)

inline fun table(init: HTMLElementInit<HTMLTableElement> = {}): HTMLTableElement =
    createElement("table", init)