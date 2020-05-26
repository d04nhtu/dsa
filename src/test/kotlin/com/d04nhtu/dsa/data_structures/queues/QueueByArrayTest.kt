package com.d04nhtu.dsa.data_structures.queues

import com.d04nhtu.dsa.data_structures.queues.QueueByArray
import org.junit.jupiter.api.Test

internal class QueueByArrayTest {

    @Test
    fun queueByArrayTest() {
        val queue = QueueByArray()
        queue.enqueue(10)
        queue.enqueue(20)
        queue.enqueue(30)
        queue.enqueue(40)

        assert(queue.size() == 4)
        assert(queue.dequeue() == 10)
        assert(queue.front() == 20)
        assert(queue.dequeue() == 20)

        queue.enqueue(50)
        assert(queue.size() == 3)
    }
}