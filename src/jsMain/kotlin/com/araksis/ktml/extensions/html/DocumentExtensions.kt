package com.araksis.ktml.extensions.html

import com.araksis.ktml.extensions.checkTypeOrError
import org.w3c.dom.Document
import org.w3c.dom.asList

inline fun <reified T> Document.find(selector: String): T {
    val node = this.querySelector(selector) ?: error("Element '$selector' not found")
    return node.checkTypeOrError<T>(selector)
}

inline fun <reified T> Document.findById(id: String): T {
    if (!id.startsWith("#")) error("Selector for findById must start with '#'. Provided: '$id'")
    return this.find(id)
}

inline fun <reified T> Document.findAll(selector: String): List<T> {
    return this.querySelectorAll(selector).asList().map { it.checkTypeOrError(selector) }
}