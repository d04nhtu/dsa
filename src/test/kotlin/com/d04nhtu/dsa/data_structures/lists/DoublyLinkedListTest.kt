package com.d04nhtu.dsa.data_structures.lists

import com.d04nhtu.dsa.data_structures.lists.DoublyLinkedList
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DoublyLinkedListTest {

    @Test
    fun prepend() {
        val doublyLinkedList = DoublyLinkedList<Int>()
        doublyLinkedList.append(1)
        doublyLinkedList.append(2)
        doublyLinkedList.append(3)
        assertArrayEquals(doublyLinkedList.toList().toTypedArray(), arrayOf(1, 2, 3))

    }

    @Test
    fun append() {
        val doublyLinkedList = DoublyLinkedList<Int>()
        doublyLinkedList.prepend(1)
        doublyLinkedList.prepend(2)
        doublyLinkedList.prepend(3)
        assertArrayEquals(doublyLinkedList.toList().toTypedArray(), arrayOf(3, 2, 1))

    }

    @Test
    fun search() {
        val doublyLinkedList = DoublyLinkedList<String>()
        doublyLinkedList.prepend("B")
        doublyLinkedList.prepend("A")
        doublyLinkedList.append("C")
        doublyLinkedList.append("D")

        assert(doublyLinkedList.search("C")?.value == "C")
        assert(doublyLinkedList.search("A")?.value == "A")
    }

    @Test
    fun remove() {
        val doublyLinkedList = DoublyLinkedList<String>()
        doublyLinkedList.prepend("B")
        doublyLinkedList.prepend("A")
        doublyLinkedList.append("C")
        doublyLinkedList.append("D")

        doublyLinkedList.remove("A")
        assertArrayEquals(doublyLinkedList.toList().toTypedArray(), arrayOf("B", "C", "D"))

        doublyLinkedList.remove("C")
        assertArrayEquals(doublyLinkedList.toList().toTypedArray(), arrayOf("B", "D"))

    }

    @Test
    fun pop() {
        val doublyLinkedList = DoublyLinkedList<Int>()
        doublyLinkedList.append(1)
        doublyLinkedList.append(2)
        doublyLinkedList.append(3)

        val value1 = doublyLinkedList.pop()
        assert(value1 == 1)
        assert(doublyLinkedList.head?.value == 2)

        val value2 = doublyLinkedList.pop()
        assert(value2 == 2)
        assert(doublyLinkedList.head?.value == 3)

        val value3 = doublyLinkedList.pop()
        assert(value3 == 3)
        assert(doublyLinkedList.head?.value == null)
    }

    @Test
    fun dequeue() {
        val doublyLinkedList = DoublyLinkedList<Int>()
        doublyLinkedList.append(1)
        doublyLinkedList.append(2)
        doublyLinkedList.append(3)

        val value1 = doublyLinkedList.dequeue()
        assert(value1 == 3)
        assert(doublyLinkedList.head?.value == 1)

        val value2 = doublyLinkedList.dequeue()
        assert(value2 == 2)
        assert(doublyLinkedList.head?.value == 1)

        val value3 = doublyLinkedList.dequeue()
        assert(value3 == 1)
        assert(doublyLinkedList.head?.value == null)
    }

    @Test
    fun insert() {
        val doublyLinkedList = DoublyLinkedList<Int>()
        doublyLinkedList.append(1)
        doublyLinkedList.append(3)

        doublyLinkedList.insert(0, 0)
        print(doublyLinkedList.toList())
        assertArrayEquals(doublyLinkedList.toList().toTypedArray(), arrayOf(0, 1, 3))
        doublyLinkedList.insert(2, 2)
        print(doublyLinkedList.toList())
        assertArrayEquals(doublyLinkedList.toList().toTypedArray(), arrayOf(0, 1, 2, 3))

    }

    @Test
    fun size() {
        val doublyLinkedList = DoublyLinkedList<Int>()
        doublyLinkedList.append(1)
        doublyLinkedList.append(2)

        assert(doublyLinkedList.size() == 2)
    }
}