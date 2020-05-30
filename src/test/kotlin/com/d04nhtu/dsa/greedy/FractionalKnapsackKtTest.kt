package com.d04nhtu.dsa.greedy

import org.junit.jupiter.api.Test
import kotlin.math.roundToInt

internal class FractionalKnapsackKtTest {

    @Test
    fun fractionalKnapsackKtTest1() {
        val items: List<Item> = listOf(
            Item(10, 60),
            Item(40, 40),
            Item(20, 100),
            Item(30, 120)
        )

        assert(maxValueOfFractionalKnapsack(50, items).roundToInt() == 240)
    }

    @Test
    fun fractionalKnapsackKtTest2() {
        val items: List<Item> = listOf(
            Item(2, 10),
            Item(3, 5),
            Item(5, 15),
            Item(7, 7),
            Item(1, 6),
            Item(4, 18),
            Item(1, 3)
        )

        assert(maxValueOfFractionalKnapsack(15, items).roundToInt() == 55)
    }
}