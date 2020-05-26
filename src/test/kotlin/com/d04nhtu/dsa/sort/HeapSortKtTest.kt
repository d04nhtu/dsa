package com.d04nhtu.dsa.sort

import com.d04nhtu.dsa.sort.heapSort
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HeapSortKtTest {

    @Test
    fun heapSortKtTest1() {
        val array = arrayOf(2, 5, 0, 6, 8, 3, 9, 7, 4)
        assertArrayEquals(heapSort(array), arrayOf(0, 2, 3, 4, 5, 6, 7, 8, 9))
    }


    @Test
    fun heapSortKtTest2() {
        val array = arrayOf(13, 7, 5, 9, -6)
        assertArrayEquals(heapSort(array), arrayOf(-6, 5, 7, 9, 13))
    }

    @Test
    fun heapSortKtTest3() {
        val array = arrayOf("A", "F", "C", "G", "D", "B")
        assertArrayEquals(heapSort(array), arrayOf("A", "B", "C", "D", "F", "G"))
    }
}