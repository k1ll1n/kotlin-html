package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.HTMLTableElement
import org.w3c.dom.HTMLTableSectionElement

inline fun HTMLTableElement.tHead(init: HTMLElementInit<HTMLTableSectionElement> = {}): HTMLTableSectionElement =
    createElement("tHead", init)