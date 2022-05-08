package com.gildedrose.category

import com.gildedrose.Item
import com.gildedrose.decreaseQuality

class ConjuredCategory : ItemCategory {
    override fun accept(item: Item) = item.name == "Conjured"

    override fun updateQuality(item: Item) {
        with(item) {
            sellIn--
            when {
                quality <= 0 -> {}
                sellIn >= 0 -> decreaseQuality(2, min = 0)
                else -> decreaseQuality(4, min = 0)
            }

        }
    }
}