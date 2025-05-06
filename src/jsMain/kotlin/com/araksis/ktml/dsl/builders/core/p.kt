package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLParagraphElement

inline fun Document.p(init: HTMLElementInit<HTMLParagraphElement> = {}): HTMLParagraphElement =
    createElement("p", init)

inline fun HTMLElement.p(init: HTMLElementInit<HTMLParagraphElement> = {}): HTMLParagraphElement =
    createElement("p", init)

inline fun p(init: HTMLElementInit<HTMLParagraphElement> = {}): HTMLParagraphElement =
    createElement("p", init)