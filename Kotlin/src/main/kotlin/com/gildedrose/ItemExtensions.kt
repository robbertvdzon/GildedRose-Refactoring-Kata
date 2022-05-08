package com.gildedrose

import com.gildedrose.category.ItemCategories

private val itemCategories = ItemCategories()

fun Item.decreaseQuality(decrement: Int, max: Int = Int.MAX_VALUE, min: Int = Int.MIN_VALUE) {
    incrementQuality(decrement*-1, max, min)
}

fun Item.incrementQuality(increment: Int, max: Int = Int.MAX_VALUE, min: Int = Int.MIN_VALUE) {
    val value = quality + increment
    quality = when {
        value > max -> max
        value < min -> min
        else -> value
    }
}

fun Item.updateQuality() {
    val itemCategory = itemCategories.findItemAlgorithm(this)
    itemCategory.updateQuality(this)
}
