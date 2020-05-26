package com.d04nhtu.dsa.list

import com.d04nhtu.dsa.search.list.binarySearchRecursive
import org.junit.jupiter.api.Test

internal class LinearSearchKtTest {

    @Test
    fun linearSearch1() {
        val array = arrayOf(1, 2, 3, 5, 8)
        val key = 3
        assert(binarySearchRecursive(array, key) == 2)
    }

    @Test
    fun linearSearch2() {
        val array = arrayOf(-10, 0, 1, 3, 4, 5, 7, 8, 10)
        val key = 2
        assert(binarySearchRecursive(array, key) == -1)
    }

    @Test
    fun linearSearch3() {
        val array = arrayOf("A", "B", "D", "H", "T")
        val key = "H"
        assert(binarySearchRecursive(array, key) == 3)
    }
}