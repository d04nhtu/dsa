package com.d04nhtu.dsa.sort

import com.d04nhtu.dsa.sort.mergeSort
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class MergeSortKtTest {

    @Test
    fun mergeSortKtTest1() {
        val list = listOf(2, 5, 0, 6, 8, 3, 9, 7, 4)
        val result = mergeSort(list)
        assertArrayEquals(result.toTypedArray(), arrayOf(0, 2, 3, 4, 5, 6, 7, 8, 9))
    }

    @Test
    fun mergeSortKtTest2() {
        val list = listOf(13, 7, 5, 9, -6)
        val result = mergeSort(list)
        assertArrayEquals(result.toTypedArray(), arrayOf(-6, 5, 7, 9, 13))
    }

    @Test
    fun mergeSortKtTest3() {
        val list = listOf("A", "F", "C", "G", "D", "B")
        val result = mergeSort(list)
        assertArrayEquals(result.toTypedArray(), arrayOf("A", "B", "C", "D", "F", "G"))
    }
}