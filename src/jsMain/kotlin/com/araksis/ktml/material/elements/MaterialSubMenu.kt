package com.araksis.ktml.material.elements

import com.araksis.ktml.material.MdMenu
import com.araksis.ktml.material.MdMenuItem

open external class MaterialSubMenu : MaterialMenuElement {
    var anchorCorner: String
    var menuCorner: String
    var hoverOpenDelay: Int
    var hoverCloseDelay: Int
    var isSubMenu: Boolean
    var item: MdMenuItem
    var menu: MdMenu
}