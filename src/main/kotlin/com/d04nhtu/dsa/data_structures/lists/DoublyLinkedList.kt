package com.d04nhtu.dsa.data_structures.lists

class DoubleNode<T : Comparable<T>>(var value: T, var next: DoubleNode<T>? = null, var previous: DoubleNode<T>? = null)

class DoublyLinkedList<T : Comparable<T>>(var head: DoubleNode<T>? = null, var tail: DoubleNode<T>? = null) {

    fun prepend(value: T) {
        if (head == null) {
            head = DoubleNode(value)
            tail = head
            return
        }

        head!!.previous = DoubleNode(value)
        head!!.previous!!.next = head
        head = head!!.previous
    }

    fun append(value: T) {
        if (head == null) {
            head = DoubleNode(value)
            tail = head
            return
        }

        tail!!.next = DoubleNode(value)
        tail!!.next!!.previous = tail
        tail = tail!!.next
    }

    fun search(value: T): DoubleNode<T>? {
        var node = head
        while (node!!.next != null) {
            if (node.value == value) {
                return node
            }
            node = node.next
        }
        return null
    }

    fun remove(value: T) {
        var node = head

        while (node != null) {
            if (node.value == value) {
                if (node.previous == null) {
                    head = node.next
                    if (head == null) {
                        tail = null
                    } else if (head?.next == null) {
                        tail = head
                    }
                } else {
                    node.next!!.previous = node.previous
                    node.previous?.next = node.next
                }
                break
            }

            node = node.next
        }
    }

    fun pop(): T? {
        val firstNodeValue = head?.value
        if (head?.next != null) {
            if (head!!.next!!.next == null) {
                head!!.next!!.previous == null
                tail = head!!.next
            }
        } else {
            tail == null
        }
        head = head?.next

        return firstNodeValue
    }

    fun dequeue(): T? {
        val lastNodeValue = tail?.value

        if (tail?.previous != null) {
            if (tail!!.previous!!.previous == null) {
                tail!!.previous!!.next == null
                head = tail!!.previous
            }
        } else {
            head = null
        }
        tail = tail?.previous

        return lastNodeValue
    }

    fun insert(value: T, position: Int) {
        if (position <= 0) {
            prepend(value)
            return
        }

        var index = 0
        var node = head

        while (node!!.next != null && index <= position) {
            if ((position - 1) == index) {
                val newNode = DoubleNode(value)
                newNode.next = node.next
                newNode.previous = node.previous
                if (node.next!!.next != null) {
                    node.next!!.next!!.previous = newNode
                }
                node.next = newNode

                return
            }

            index++
            node = node.next
        }

        append(value) // if position is larger than the size of the list
    }

    fun size(): Int {
        var node = head
        var size = 0

        while (node != null) {
            node = node.next
            size++
        }
        return size
    }

    fun toList(): List<T> {
        val list = mutableListOf<T>()
        var node = head

        while (node != null) {
            list.add(node.value)
            node = node.next
        }

        return list
    }
}