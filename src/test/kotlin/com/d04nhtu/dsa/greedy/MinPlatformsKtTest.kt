package com.d04nhtu.dsa.greedy

import org.junit.jupiter.api.Test

internal class MinPlatformsKtTest {

    @Test
    fun minPlatformsKtTest1() {
        val arrival = listOf(900, 940, 950, 1100, 1500, 1800)
        val departure = listOf(910, 1200, 1120, 1130, 1900, 2000)
        assert(minPlatforms(arrival, departure) == 3)
    }

    @Test
    fun minPlatformsKtTest2() {
        val arrival = listOf(200, 210, 300, 320, 350, 500)
        val departure = listOf(230, 340, 320, 430, 400, 520)
        assert(minPlatforms(arrival, departure) == 2)
    }
}