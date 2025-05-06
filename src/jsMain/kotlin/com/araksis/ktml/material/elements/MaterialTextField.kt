package com.araksis.ktml.material.elements

import com.araksis.ktml.material.MaterialInput

open external class MaterialTextField : MaterialInput {
    var error: Boolean
    var errorText: String
    var label: String
    var noAsterisk: Boolean
    var prefixText: String
    var suffixText: String
    var hasLeadingIcon: Boolean
    var hasTrailingIcon: Boolean
    var supportingText: String
    var textDirection: String
    var rows: Int
    var cols: Int
    var noSpinner: Boolean
}

// TODO add methods