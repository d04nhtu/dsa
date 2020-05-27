package com.d04nhtu.dsa.recursion

import org.junit.jupiter.api.Test

import com.d04nhtu.dsa.recursion.isPalindrome

internal class PalindromeKtTest {

    @Test
    fun isPalindrome() {
        assert(isPalindrome(""))
        assert(isPalindrome("a"))
        assert(isPalindrome("abba"))
        assert(!isPalindrome("dsa"))
    }
}