package com.araksis.ktml.material.elements

import com.araksis.ktml.material.MaterialSelectElement

open external class MaterialSelect : MaterialSelectElement {
    var quick: Boolean
    var errorText: String
    var label: String
    var noAsterisk: Boolean
    var supportingText: String
    var error: Boolean
    var menuPositioning: String
    var clampMenuWidth: Boolean
    var typeaheadDelay: Int
    var hasLeadingIcon: Boolean
    var displayText: String
    var menuAlign: String
}