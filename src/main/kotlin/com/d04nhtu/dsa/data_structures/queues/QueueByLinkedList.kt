package com.d04nhtu.dsa.data_structures.queues

import com.d04nhtu.dsa.data_structures.lists.Node

class QueueByLinkedList<T : Comparable<T>> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var numElements: Int = 0

    fun enqueue(value: T) {
        val newNode = Node(value)

        if (head == null) {
            head = newNode
            tail = head
        } else {
            tail!!.next = newNode
            tail = tail!!.next
        }

        numElements++
    }

    fun dequeue(): T? {
        if (isEmpty()) {
            return null
        }
        val value = head!!.value
        head = head!!.next
        numElements--

        return value
    }

    fun peekHead(): T? {
        return head?.value
    }

    fun peekTail(): T? {
        return tail?.value
    }

    fun size() = numElements

    private fun isEmpty() = numElements == 0
}