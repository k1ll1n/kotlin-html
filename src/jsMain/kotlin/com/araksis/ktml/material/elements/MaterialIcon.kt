package com.araksis.ktml.material.elements

import com.araksis.ktml.extensions.html.attr
import com.araksis.ktml.material.MaterialElement

open external class MaterialIcon : MaterialElement

fun MaterialIcon.setAsIconSlot() {
    attr("slot", "icon")
}