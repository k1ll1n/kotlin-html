package com.araksis.ktml.material.elements

import com.araksis.ktml.material.MdMenuItem

open external class MaterialMenu : MaterialMenuElement {
    var anchor: String
    var positioning: String
    var quick: Boolean
    var hasOverflow: Boolean
    var open: Boolean
    var xOffset: Int
    var yOffset: Int
    var typeaheadDelay: Int
    var anchorCorner: String
    var menuCorner: String
    var noHorizontalFlip: Boolean
    var noVerticalFlip: Boolean
    var stayOpenOnOutsideClick: Boolean
    var stayOpenOnFocusout: Boolean
    var skipRestoreFocus: Boolean
    var defaultFocus: String
    var noNavigationWrap: Boolean
    var isSubmenu: Boolean

    fun close()
    fun show()
    fun activateNextItem(): MdMenuItem
    fun activatePreviousItem(): MdMenuItem
    fun reposition()
}