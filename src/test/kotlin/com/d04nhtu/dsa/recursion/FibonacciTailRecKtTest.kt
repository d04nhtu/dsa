package com.d04nhtu.dsa.recursion

import org.junit.jupiter.api.Test


internal class FibonacciTailRecKtTest {

    @Test
    fun fibonacciTailRecKtTest() {
        assert(fibonacciTailRec(0) == 0)
        assert(fibonacciTailRec(1) == 1)
        assert(fibonacciTailRec(4) == 3)
    }
}