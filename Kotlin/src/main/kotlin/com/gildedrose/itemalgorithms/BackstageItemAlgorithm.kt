package com.gildedrose.itemalgorithms

import com.gildedrose.Item
import com.gildedrose.incrementQuality

class BackstageItemAlgorithm : ItemAlgorithm {

    override fun accept(item: Item) = item.name == "Backstage passes to a TAFKAL80ETC concert"

    override fun updateQuality(item: Item) {
        with(item) {
            sellIn--
            when {
                sellIn >= 10 && quality < 50 -> incrementQuality(1, 50)
                sellIn in 5..9 && quality < 50 -> incrementQuality(2, 50)
                sellIn in 0..4 && quality < 50 -> incrementQuality(3, 50)
                sellIn < 0 && quality > 0 -> quality = 0
            }
        }
    }
}