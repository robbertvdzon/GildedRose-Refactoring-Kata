package com.gildedrose.category

import com.gildedrose.Item

interface ItemCategory {
    fun accept(item: Item): Boolean
    fun updateQuality(item: Item)
}