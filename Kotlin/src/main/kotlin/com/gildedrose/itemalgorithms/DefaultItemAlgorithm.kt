package com.gildedrose.itemalgorithms

import com.gildedrose.Item
import com.gildedrose.decreaseQuality

class DefaultItemAlgorithm : ItemAlgorithm {
    override fun accept(item: Item) = true

    override fun updateQuality(item: Item) {
        with(item) {
            sellIn--
            when {
                quality <= 0 -> {}
                sellIn >= 0 -> decreaseQuality(1, min = 0)
                else -> decreaseQuality(2, min = 0)
            }

        }
    }
}