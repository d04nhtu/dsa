package com.d04nhtu.dsa.sort

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class QuickSortKtTest {

    @Test
    fun quickSortKtTest1() {
        val array = arrayOf(2, 5, 0, 6, 8, 3, 9, 7, 4)
        com.d04nhtu.dsa.sort.quickSort(array)
        assertArrayEquals(array, arrayOf(0, 2, 3, 4, 5, 6, 7, 8, 9))
    }


    @Test
    fun quickSortKtTest2() {
        val array = arrayOf(13, 7, 5, 9, -6)
        com.d04nhtu.dsa.sort.quickSort(array)
        assertArrayEquals(array, arrayOf(-6, 5, 7, 9, 13))
    }

    @Test
    fun quickSortKtTest3() {
        val array = arrayOf("A", "F", "C", "G", "D", "B")
        com.d04nhtu.dsa.sort.quickSort(array)
        assertArrayEquals(array, arrayOf("A", "B", "C", "D", "F", "G"))
    }
}