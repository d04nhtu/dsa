package com.d04nhtu.dsa.data_structures.lists

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class SinglyLinkedListTest {


    @Test
    fun prepend() {
        val singlyLinkedList = SinglyLinkedList<Int>()
        singlyLinkedList.append(1)
        singlyLinkedList.append(2)
        singlyLinkedList.append(3)
        assertArrayEquals(singlyLinkedList.toList().toTypedArray(), arrayOf(1, 2, 3))
    }

    @Test
    fun append() {
        val singlyLinkedList = SinglyLinkedList<Int>()
        singlyLinkedList.prepend(1)
        singlyLinkedList.prepend(2)
        singlyLinkedList.prepend(3)
        assertArrayEquals(singlyLinkedList.toList().toTypedArray(), arrayOf(3, 2, 1))
    }

    @Test
    fun search() {
        val singlyLinkedList = SinglyLinkedList<String>()
        singlyLinkedList.prepend("B")
        singlyLinkedList.prepend("A")
        singlyLinkedList.append("C")
        singlyLinkedList.append("D")

        assert(singlyLinkedList.search("C")?.value == "C")
        assert(singlyLinkedList.search("A")?.value == "A")
    }

    @Test
    fun remove() {
        val singlyLinkedList = SinglyLinkedList<String>()
        singlyLinkedList.prepend("B")
        singlyLinkedList.prepend("A")
        singlyLinkedList.append("C")
        singlyLinkedList.append("D")

        singlyLinkedList.remove("A")
        assertArrayEquals(singlyLinkedList.toList().toTypedArray(), arrayOf("B", "C", "D"))

        singlyLinkedList.remove("C")
        assertArrayEquals(singlyLinkedList.toList().toTypedArray(), arrayOf("B", "D"))
    }

    @Test
    fun pop() {
        val singlyLinkedList = SinglyLinkedList<Int>()
        singlyLinkedList.append(1)
        singlyLinkedList.append(2)
        singlyLinkedList.append(3)

        val value1 = singlyLinkedList.pop()
        assert(value1 == 1)
        assert(singlyLinkedList.head?.value == 2)

        val value2 = singlyLinkedList.pop()
        assert(value2 == 2)
        assert(singlyLinkedList.head?.value == 3)

        val value3 = singlyLinkedList.pop()
        assert(value3 == 3)
        assert(singlyLinkedList.head?.value == null)
    }

    @Test
    fun insert() {
        val singlyLinkedList = SinglyLinkedList<Int>()
        singlyLinkedList.append(1)
        singlyLinkedList.append(3)

        singlyLinkedList.insert(0, 0)
        print(singlyLinkedList.toList())
        assertArrayEquals(singlyLinkedList.toList().toTypedArray(), arrayOf(0, 1, 3))
        singlyLinkedList.insert(2, 2)
        assertArrayEquals(singlyLinkedList.toList().toTypedArray(), arrayOf(0, 1, 2, 3))
    }

    @Test
    fun size() {
        val singlyLinkedList = SinglyLinkedList<Int>()
        singlyLinkedList.append(1)
        singlyLinkedList.append(2)

        assert(singlyLinkedList.size() == 2)
    }
}