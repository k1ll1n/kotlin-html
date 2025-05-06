package com.araksis.ktml.material.elements

import com.araksis.ktml.extensions.html.attr
import com.araksis.ktml.material.MaterialOptionElement
import org.w3c.dom.HTMLElement

open external class MaterialOption : MaterialOptionElement {
    var selected: Boolean
    var typeaheadText: String
    var displayText: String
}

// TODO заменить на DSL
fun MaterialOption.setContent(element: HTMLElement) {
    element.attr("slot", "headline")
    appendChild(element)
}
