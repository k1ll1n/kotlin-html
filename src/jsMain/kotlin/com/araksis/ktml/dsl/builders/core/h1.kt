package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLHeadingElement

inline fun Document.h1(init: HTMLElementInit<HTMLHeadingElement> = {}): HTMLHeadingElement =
    createElement("h1", init)

inline fun HTMLElement.h1(init: HTMLElementInit<HTMLHeadingElement> = {}): HTMLHeadingElement =
    createElement("h1", init)

inline fun h1(init: HTMLElementInit<HTMLHeadingElement> = {}): HTMLHeadingElement =
    createElement("h1", init)