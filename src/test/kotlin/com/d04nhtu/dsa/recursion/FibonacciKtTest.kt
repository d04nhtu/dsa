package com.d04nhtu.dsa.recursion

import org.junit.jupiter.api.Test

internal class FibonacciKtTest {

    @Test
    fun fibonacciKtTest() {
        assert(fibonacci(0) == 0)
        assert(fibonacci(1) == 1)
        assert(fibonacci(4) == 3)
    }
}