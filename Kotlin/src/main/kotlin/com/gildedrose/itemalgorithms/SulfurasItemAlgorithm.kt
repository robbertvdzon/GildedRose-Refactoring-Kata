package com.gildedrose.itemalgorithms

import com.gildedrose.Item

class SulfurasItemAlgorithm : ItemAlgorithm {

    override fun accept(item: Item) = item.name == "Sulfuras, Hand of Ragnaros"

    override fun updateQuality(item: Item) {
    }
}