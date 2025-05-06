package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLTableElement
import org.w3c.dom.HTMLTableSectionElement

inline fun HTMLTableElement.tBody(init: HTMLElementInit<HTMLElement> = {}): HTMLElement =
    createElement("tBody", init)



