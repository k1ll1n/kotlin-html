package com.araksis.ktml.extensions

inline fun <reified T> Any.checkTypeOrError(selector: String): T
    = if (this is T) this else error("Element '$selector' is not of type ${T::class.simpleName}")