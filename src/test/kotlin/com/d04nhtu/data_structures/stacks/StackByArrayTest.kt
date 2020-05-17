package com.d04nhtu.data_structures.stacks

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StackByArrayTest{
    @Test
    fun stackByArrayTest() {
        val stackByArrayTest = StackByArray(2)
        stackByArrayTest.push(10)
        stackByArrayTest.push(20)
        stackByArrayTest.push(30)
        stackByArrayTest.push(40)

        assert(stackByArrayTest.size()==4)

        assert(stackByArrayTest.peek()==40)
        assert(stackByArrayTest.pop()==40)
        assert(stackByArrayTest.peek()==30)

        stackByArrayTest.push(50)
        stackByArrayTest.push(60)
        assert(stackByArrayTest.size() == 5)
    }
}