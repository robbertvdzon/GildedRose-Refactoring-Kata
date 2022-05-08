package com.gildedrose.itemalgorithms

import com.gildedrose.Item
import com.gildedrose.incrementQuality

class AgedBrieItemAlgorithm : ItemAlgorithm {

    override fun accept(item: Item) = item.name == "Aged Brie"

    override fun updateQuality(item: Item) {
        with(item) {
            sellIn--
            when {
                sellIn >= 0 && quality < 50 -> incrementQuality(1, 50)
                sellIn < 0 && quality < 50 -> incrementQuality(2, 50)
            }
        }
    }
}