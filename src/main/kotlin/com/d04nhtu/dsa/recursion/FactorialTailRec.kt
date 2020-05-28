package com.d04nhtu.dsa.recursion

tailrec fun factorialTailRec(n: Int, accumulator: Int = 1): Int {
    if (n == 0) {
        return accumulator
    }

    return factorialTailRec(n - 1, accumulator * n)
}