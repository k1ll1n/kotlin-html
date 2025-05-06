package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.*

inline fun Document.a(init: HTMLElementInit<HTMLAnchorElement> = {}): HTMLAnchorElement =
    createElement("a", init)

inline fun HTMLElement.a(init: HTMLElementInit<HTMLAnchorElement> = {}): HTMLAnchorElement =
    createElement("a", init)

inline fun a(init: HTMLElementInit<HTMLAnchorElement> = {}): HTMLAnchorElement =
    createElement("a", init)