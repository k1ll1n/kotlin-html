package com.araksis.ktml.extensions.html

import org.w3c.dom.Node
import org.w3c.dom.events.Event

fun Node.click(handler: (Event) -> Unit) = this.addEventListener("click", handler)
fun Node.change(handler: (Event) -> Unit) = this.addEventListener("change", handler)
fun Node.mouseover(handler: (Event) -> Unit) = this.addEventListener("mouseover", handler)
fun Node.mouseout(handler: (Event) -> Unit) = this.addEventListener("mouseout", handler)
fun Node.keydown(handler: (Event) -> Unit) = this.addEventListener("keydown", handler)
fun Node.keyup(handler: (Event) -> Unit) = this.addEventListener("keyup", handler)
fun Node.submit(handler: (Event) -> Unit) = this.addEventListener("submit", handler)
fun Node.focus(handler: (Event) -> Unit) = this.addEventListener("focus", handler)
fun Node.blur(handler: (Event) -> Unit) = this.addEventListener("blur", handler)
fun Node.input(handler: (Event) -> Unit) = this.addEventListener("input", handler)
fun Node.dblclick(handler: (Event) -> Unit) = this.addEventListener("dblclick", handler)
fun Node.contextmenu(handler: (Event) -> Unit) = this.addEventListener("contextmenu", handler)
fun Node.resize(handler: (Event) -> Unit) = this.addEventListener("resize", handler)
fun Node.scroll(handler: (Event) -> Unit) = this.addEventListener("scroll", handler)