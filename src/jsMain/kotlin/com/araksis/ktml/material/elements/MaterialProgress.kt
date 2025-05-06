package com.araksis.ktml.material.elements

import com.araksis.ktml.material.MaterialElement

open external class MaterialProgress : MaterialElement {
    var value: Float
    var max: Float
    var indeterminate: Boolean
    var fourColor: Boolean
}

open external class MaterialLinearProgress : MaterialProgress {
    var buffer: Float
}

open external class MaterialCircularProgress : MaterialProgress