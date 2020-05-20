package com.d04nhtu.data_structures.queues

import com.d04nhtu.data_structures.stacks.StackByLinkedList
import java.util.*

class QueueByStack<T : Comparable<T>> {
    private var stack = StackByLinkedList<T>()

    fun enqueue(value: T) {
        stack.push(value)
    }

    fun dequeue(): T? {
        val tempStack = StackByLinkedList<T>()
        val tempStackSecond = StackByLinkedList<T>()

        for (i in 0 until (size() - 1)) {
            stack.pop()?.let { tempStack.push(it) }
        }

        for (i in 0 until tempStack.size()) {
            tempStack.pop()?.let { tempStackSecond.push(it) }
        }

        val dequeuedValue = stack.pop()
        stack = tempStackSecond

        return dequeuedValue
    }

    fun peekHead(): T? {
        val tempStack = StackByLinkedList<T>()
        val tempStackSecond = StackByLinkedList<T>()

        for (i in 0 until size()) {
            stack.pop()?.let { tempStack.push(it) }
        }

        val headValue = tempStack.peek()

        for (i in 0 until tempStack.size()) {
            tempStack.pop()?.let { tempStackSecond.push(it) }
        }

        stack = tempStackSecond

        return headValue
    }

    fun peekTail(): T? {
        return stack.peek()
    }

    fun size() = stack.size()
}