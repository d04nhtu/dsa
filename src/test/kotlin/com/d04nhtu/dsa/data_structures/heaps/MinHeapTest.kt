package com.d04nhtu.dsa.data_structures.heaps

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class MinHeapTest {

    @Test
    fun minheapTest() {
        val heap = MinHeap(10)
        val test = listOf(10, 20, 40, 50, 30, 70, 60, 75)

        for (number in test) {
            heap.insert(number)
        }

        heap.insert(15)
        assertArrayEquals(heap.cbt, arrayOf(10, 15, 40, 20, 30, 70, 60, 75, 50, null))

        heap.remove()
        assertArrayEquals(heap.cbt, arrayOf(15, 20, 40, 50, 30, 70, 60, 75, null, null))
    }
}