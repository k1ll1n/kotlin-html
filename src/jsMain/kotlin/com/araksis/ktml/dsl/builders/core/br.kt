package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.HTMLBRElement
import org.w3c.dom.HTMLElement

inline fun HTMLElement.br(init: HTMLElementInit<HTMLBRElement> = {}): HTMLBRElement =
    createElement("br", init)