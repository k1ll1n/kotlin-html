package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.*

inline fun Document.td(init: HTMLElementInit<HTMLTableCellElement> = {}): HTMLTableCellElement =
    createElement("td", init)

inline fun HTMLElement.td(init: HTMLElementInit<HTMLTableCellElement> = {}): HTMLTableCellElement =
    createElement("td", init)

inline fun td(init: HTMLElementInit<HTMLTableCellElement> = {}): HTMLTableCellElement =
    createElement("td", init)