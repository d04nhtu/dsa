package com.d04nhtu.dsa.sort

import com.d04nhtu.dsa.sort.bubbleSort
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class  BubbleSortKtTest {

    @Test
    fun bubbleSortKtTest1() {
        val array = arrayOf(2, 5, 0, 6, 8, 3, 9, 7, 4)
        bubbleSort(array)
        assertArrayEquals(array, arrayOf(0, 2, 3, 4, 5, 6, 7, 8, 9))
    }


    @Test
    fun bubbleSortKtTest2() {
        val array = arrayOf(13, 7, 5, 9, -6)
        bubbleSort(array)
        assertArrayEquals(array, arrayOf(-6, 5, 7, 9, 13))
    }

    @Test
    fun bubbleSortKtTest3() {
        val array = arrayOf("A", "F", "C", "G", "D", "B")
        bubbleSort(array)
        assertArrayEquals(array, arrayOf("A", "B", "C", "D", "F", "G"))
    }
}