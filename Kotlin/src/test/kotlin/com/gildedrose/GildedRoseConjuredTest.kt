package com.gildedrose

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.provider.Arguments

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GildedRoseConjuredTest : GildedRoseBaseTest() {

    // Below are all testcases for this test, with the following arguments:
    // - name
    // - initialSellIn
    // - initialQuality
    // - numberDays
    // - resultingSellIn
    // - resultingQuality
    override val combinationsToTest: Array<Arguments> = arrayOf(
        // tests where sellIn and quality are initially the same
        Arguments.of("Conjured", 5, 5, 1, 4, 3),
        Arguments.of("Conjured", 5, 5, 2, 3, 1),
        Arguments.of("Conjured", 5, 5, 3, 2, 0),
        Arguments.of("Conjured", 5, 5, 4, 1, 0),
        Arguments.of("Conjured", 5, 5, 5, 0, 0),// after here, the quality stays at 0
        Arguments.of("Conjured", 5, 5, 6, -1, 0),
        Arguments.of("Conjured", 5, 5, 7, -2, 0),

        // tests where sellIn is initially less then the quality
        Arguments.of("Conjured", 5, 20, 1, 4, 18),
        Arguments.of("Conjured", 5, 20, 2, 3, 16),
        Arguments.of("Conjured", 5, 20, 3, 2, 14),
        Arguments.of("Conjured", 5, 20, 4, 1, 12),
        Arguments.of("Conjured", 5, 20, 5, 0, 10),// after here, the quality goes twice at fast
        Arguments.of("Conjured", 5, 20, 6, -1, 6),
        Arguments.of("Conjured", 5, 20, 7, -2, 2),
        Arguments.of("Conjured", 5, 20, 8, -3, 0),// after here, the quality stays at 0
        Arguments.of("Conjured", 5, 20, 9, -4, 0),
        Arguments.of("Conjured", 5, 20, 10, -5, 0),
        Arguments.of("Conjured", 5, 20, 11, -6, 0),
        Arguments.of("Conjured", 5, 20, 12, -7, 0),

        // tests where sellIn is initially larger then the quality
        Arguments.of("Conjured", 15, 5, 1, 14, 3),
        Arguments.of("Conjured", 15, 5, 2, 13, 1),
        Arguments.of("Conjured", 15, 5, 3, 12, 0),// after here, the quality stays at 0
        Arguments.of("Conjured", 15, 5, 4, 11, 0),
        Arguments.of("Conjured", 15, 5, 5, 10, 0),
        Arguments.of("Conjured", 15, 5, 6, 9, 0),
        Arguments.of("Conjured", 15, 5, 7, 8, 0),

        // tests other edge cases
        Arguments.of("Conjured", -1, 15, 1, -2, 11),
        Arguments.of("Conjured", -1, -1, 1, -2, -1),
        Arguments.of("Conjured", -1, -2, 1, -2, -2),
        Arguments.of("Conjured", -1, -2, 3, -4, -2),
        Arguments.of("Conjured", 100, -1, 1, 99, -1),
        Arguments.of("Conjured", 100, 100, 1, 99, 98),
    )

}