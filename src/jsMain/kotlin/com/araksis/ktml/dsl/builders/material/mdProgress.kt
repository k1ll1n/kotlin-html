package com.araksis.ktml.dsl.builders.material

import com.araksis.ktml.material.MdCircularProgress
import com.araksis.ktml.material.MdLinearProgress
import org.w3c.dom.HTMLElement

inline fun HTMLElement.mdCircularProgress(init: MdCircularProgress.() -> Unit = {}): MdCircularProgress {
    val button = MdCircularProgress()
    appendChild(button)
    button.init()
    return button
}

inline fun mdCircularProgress(init: MdCircularProgress.() -> Unit = {}): MdCircularProgress {
    val button = MdCircularProgress()
    button.init()
    return button
}

inline fun HTMLElement.mdLinearProgress(init: MdLinearProgress.() -> Unit = {}): MdLinearProgress {
    val button = MdLinearProgress()
    appendChild(button)
    button.init()
    return button
}

inline fun mdLinearProgress(init: MdLinearProgress.() -> Unit = {}): MdLinearProgress {
    val button = MdLinearProgress()
    button.init()
    return button
}