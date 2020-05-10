package search

import org.junit.jupiter.api.Test

internal class BinarySearchIterativeKtTest {

    @Test
    fun binarySearchIterativeKtTest1() {
        val array = arrayOf(1, 2, 3, 5, 8)
        val key = 3
        assert(binarySearchIterative(array, key) == 2)
    }

    @Test
    fun binarySearchIterativeKtTest2() {
        val array = arrayOf(-10, 0, 1, 3, 4, 5, 7, 8, 10)
        val key = 2
        assert(binarySearchIterative(array, key) == -1)
    }

    @Test
    fun binarySearchIterativeKtTest3() {
        val array = arrayOf("A", "B", "D", "H", "T")
        val key = "H"
        assert(binarySearchIterative(array, key) == 3)
    }
}