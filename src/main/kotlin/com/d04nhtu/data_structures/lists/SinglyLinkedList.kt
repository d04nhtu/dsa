package com.d04nhtu.data_structures.lists

class Node<T : Comparable<T>>(var value: T, var next: Node<T>? = null)

class SinglyLinkedList<T : Comparable<T>>(var head: Node<T>? = null) {

    fun prepend(value: T) {
        if (head == null) {
            head = Node(value)
        } else {
            val previousHead = head
            head = Node(value)
            head!!.next = previousHead
        }
    }

    fun append(value: T) {
        var node = head

        if (node == null) {
            head = Node(value)
        } else {
            while (node!!.next != null) {
                node = node.next
            }
            node.next = Node(value)
        }
    }

    fun search(value: T): Node<T>? {
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
        var previousNode: Node<T>? = null
        var node = head

        while (node != null) {
            if (node.value == value) {
                if (previousNode == null) {
                    head = node.next
                } else {
                    previousNode.next = node.next
                }
            }

            previousNode = node
            node = node.next
        }
    }

    fun pop(): T? {
        val firstNodeValue = head?.value
        head = head?.next
        return firstNodeValue
    }


    fun insert(value: T, position: Int) {
        if (position == 0) {
            prepend(value)
            return
        }

        var index = 0
        var node = head

        while (node!!.next != null && index <= position) {
            if ((position - 1) == index) {
                val newNode = Node(value)
                newNode.next = node.next
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
