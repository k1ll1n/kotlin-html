package com.araksis.ktml.extensions.material

import com.araksis.ktml.material.MdDialog
import org.w3c.dom.events.Event

fun MdDialog.addOpenListener(block: (Event) -> Unit) {
    this.addEventListener("open", block)
}
fun MdDialog.addOpenedListener(block: (Event) -> Unit) {
    this.addEventListener("opened", block)
}
fun MdDialog.addCloseListener(block: (Event) -> Unit) {
    this.addEventListener("close", block)
}
fun MdDialog.addClosedListener(block: (Event) -> Unit) {
    this.addEventListener("closed", block)
}
fun MdDialog.addCancelListener(block: (Event) -> Unit) {
    this.addEventListener("cancel", block)
}