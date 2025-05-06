package com.araksis.ktml.material.elements

import com.araksis.ktml.material.MaterialElement

open external class MaterialTabs : MaterialElement {
    var autoActivate: Boolean
    var activeTabIndex: Int
    var tabs: List<MaterialTab>
    var activeTab: MaterialTab
}