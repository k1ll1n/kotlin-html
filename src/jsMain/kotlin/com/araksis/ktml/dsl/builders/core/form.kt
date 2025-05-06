package com.araksis.ktml.dsl.builders.core

import com.araksis.ktml.dsl.HTMLElementInit
import com.araksis.ktml.dsl.createElement
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLFormElement

inline fun Document.form(init: HTMLElementInit<HTMLFormElement> = {}): HTMLFormElement =
    createElement("form", init)

inline fun HTMLElement.form(init: HTMLElementInit<HTMLFormElement> = {}): HTMLFormElement =
    createElement("form", init)

inline fun form(init: HTMLElementInit<HTMLFormElement> = {}): HTMLFormElement =
    createElement("form", init)