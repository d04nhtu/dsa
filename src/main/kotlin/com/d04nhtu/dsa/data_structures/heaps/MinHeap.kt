package com.d04nhtu.dsa.data_structures.heaps

import kotlin.math.min

class MinHeap(var initialSize: Int = 10) {

    var cbt = arrayOfNulls<Int>(initialSize)
    var nextIndex = 0

    fun insert(data: Int) {
        cbt[nextIndex] = data
        upHeapify()
        nextIndex++

        if (nextIndex >= cbt.size) {
            val temp = cbt
            cbt = arrayOfNulls(2 * initialSize)

            for (index in 0 until nextIndex) {
                cbt[index] = temp[index]
            }
        }
    }

    fun remove(): Int? {
        if (size() == 0) {
            return null
        }
        nextIndex--

        val toRemove = cbt[0]
        val lastElement = cbt[nextIndex]

        cbt[0] = lastElement

        cbt[nextIndex] = null
        downHeapify()

        return toRemove
    }

    fun getMinimum(): Int? {
        if (size() == 0) return null
        return cbt[0]
    }

    fun isEmpty() = size() == 0

    fun size() = nextIndex

    fun upHeapify() {
        var childIndex = nextIndex

        while (childIndex >= 1) {
            val parentIndex = (childIndex - 1) / 2
            val parentElement = cbt[parentIndex]
            val childElement = cbt[childIndex]

            if (parentElement!! > childElement!!) {
                cbt[parentIndex] = childElement
                cbt[childIndex] = parentElement

                childIndex = parentIndex
            } else {
                break
            }
        }
    }

    fun downHeapify() {
        var parentIndex = 0

        while (parentIndex < nextIndex) {
            val leftChildIndex = 2 * parentIndex + 1
            val rightChildIndex = 2 * parentIndex + 2

            val parent = cbt[parentIndex]
            var leftChild: Int? = null
            var rightChild: Int? = null

            var minElement = parent

//            check if left child exists
            if (leftChildIndex < nextIndex) {
                leftChild = cbt[leftChildIndex]
            }

//            check if right child exists
            if (rightChildIndex < nextIndex) {
                rightChild = cbt[rightChildIndex]
            }

//            compare with left child
            if (leftChild != null) {
                minElement = min(parent!!, leftChild)
            }

//            compare with right child
            if (rightChild != null) {
                minElement = min(rightChild, minElement!!)
            }

//            check if parent is rightly placed
            if (minElement == parent) {
                return
            }

            if (minElement == leftChild) {
                cbt[leftChildIndex] = parent
                cbt[parentIndex] = minElement
                parentIndex = leftChildIndex
            } else if (minElement == rightChild) {
                cbt[rightChildIndex] = parent
                cbt[parentIndex] = minElement
                parentIndex = rightChildIndex
            }
        }
    }
}