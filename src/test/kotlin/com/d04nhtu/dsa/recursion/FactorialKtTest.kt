package com.d04nhtu.dsa.recursion

import org.junit.jupiter.api.Test

internal class FactorialKtTest {

    @Test
    fun factorial() {
        assert(factorial(0) == 1)
        assert(factorial(1) == 1)
        assert(factorial(5) == 120)
    }
}