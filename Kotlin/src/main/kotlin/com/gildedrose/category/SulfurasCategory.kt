package com.gildedrose.category

import com.gildedrose.Item

class SulfurasCategory : ItemCategory {

    override fun accept(item: Item) = item.name == "Sulfuras, Hand of Ragnaros"

    override fun updateQuality(item: Item) {
    }
}