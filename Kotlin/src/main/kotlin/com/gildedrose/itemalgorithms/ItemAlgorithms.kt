package com.gildedrose.itemalgorithms

import com.gildedrose.Item

class ItemAlgorithms {

    private val specializedItemAlgorithms: List<ItemAlgorithm> = listOf(
        AgedBrieItemAlgorithm(),
        SulfurasItemAlgorithm(),
        BackstageItemAlgorithm()
    )
    private val defaultItemAlgorithm = DefaultItemAlgorithm()

    fun findItemAlgorithm(item: Item) = specializedItemAlgorithms.find { it.accept(item) } ?: defaultItemAlgorithm

}