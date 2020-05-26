package com.d04nhtu.dsa.data_structures.stacks

import com.d04nhtu.dsa.data_structures.lists.Node
import com.d04nhtu.dsa.data_structures.stacks.StackByLinkedList
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StackByLinkedListTest {

    @Test
    fun stackByLinkedListTest() {
       val stackByLinkedList = StackByLinkedList<Int>()
        stackByLinkedList.push(10)
        stackByLinkedList.push(20)
        stackByLinkedList.push(30)
        stackByLinkedList.push(40)

        assert(stackByLinkedList.size()==4)

        assert(stackByLinkedList.peek()==40)
        assert(stackByLinkedList.pop()==40)
        assert(stackByLinkedList.peek()==30)

        stackByLinkedList.push(50)
        stackByLinkedList.push(60)
        assert(stackByLinkedList.size() == 5)
    }
}