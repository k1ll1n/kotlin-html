package com.araksis.ktml.material.elements

import com.araksis.ktml.extensions.html.attr
import org.w3c.dom.Element

open external class MaterialMenuItem : MaterialMenuElement {
    var disabled: Boolean
    var type: String
    var href: String
    var target: String
    var keepOpen: Boolean
    var selected: Boolean
    var typeaheadText: String
}

// TODO заменить на DSL
fun MaterialMenuItem.setContent(content: Element) {
    content.attr("slot", "headline")
    appendChild(content)
}