package com.gildedrose.category

import com.gildedrose.Item

class ItemCategories {

    private val specializedItemCategories: List<ItemCategory> = listOf(
        AgedBrieCategory(),
        SulfurasCategory(),
        BackstageCategory(),
        ConjuredCategory()
    )
    private val defaultItemAlgorithm = DefaultCategory()

    fun findItemAlgorithm(item: Item) = specializedItemCategories.find { it.accept(item) } ?: defaultItemAlgorithm

}