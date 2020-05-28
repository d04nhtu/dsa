package com.d04nhtu.dsa.recursion

import org.junit.jupiter.api.Test

internal class FactorialTailRecKtTest {

    @Test
    fun factorialTailRec() {
        assert(factorialTailRec(0) == 1)
        assert(factorialTailRec(1) == 1)
        assert(factorialTailRec(5) == 120)
    }
}