package com.gildedrose.itemalgorithms

import com.gildedrose.Item

interface ItemAlgorithm {
    fun accept(item: Item): Boolean
    fun updateQuality(item: Item)
}