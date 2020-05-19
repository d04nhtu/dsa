package com.d04nhtu.data_structures.queues

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class QueueByLinkedListTest {

    @Test
    fun queueByLinkedListTest() {
        val queue = QueueByLinkedList<Int>()
        queue.enqueue(10)
        queue.enqueue(20)
        queue.enqueue(30)
        queue.enqueue(40)

        assert(queue.size() == 4)
        assert(queue.dequeue() == 10)
        assert(queue.peekHead()==20)
        assert(queue.dequeue() == 20)

        queue.enqueue(50)
        assert(queue.peakTail()==50)
        assert(queue.size() == 3)
    }
}