package com.araksis.ktml.material.elements

import com.araksis.ktml.extensions.html.attr
import com.araksis.ktml.material.MaterialInput

open external class MaterialCheckbox : MaterialInput

fun MaterialCheckbox.setAsTouched() {
    attr("touch-target", "wrapper")
}