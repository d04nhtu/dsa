package sort

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.util.*

internal class BubbleSortKtTest {

    @Test
    fun bubbleSortKtTest1() {
        val array = arrayOf(2, 5, 0, 6, 8, 3, 9, 7, 4)
        bubbleSort(array)
        assertArrayEquals(array, arrayOf(0, 2, 3, 4, 5, 6, 7, 8, 9))
    }

    @Test
    fun bubbleSortKtTest2() {
        val array = arrayOf("A", "F", "C", "G", "D", "B")
        bubbleSort(array)
        assertArrayEquals(array, arrayOf("A", "B", "C", "D", "F", "G"))
    }
}