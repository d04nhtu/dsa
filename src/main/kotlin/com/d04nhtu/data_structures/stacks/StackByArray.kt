package com.d04nhtu.data_structures.stacks

class StackByArray(var initialSize: Int = 10) {

    private var nextIndex: Int = 0
    private var numElements: Int = 0
    private var arr = Array(initialSize) { 0 }

    fun push(value: Int) {
        if (nextIndex == arr.size) {
            handleStackCapacityFull()
        }

        arr[nextIndex] = value
        nextIndex += 1
        numElements += 1
    }

    fun pop(): Int? {
        return if (isEmpty()) {
            nextIndex = 0
            null
        } else {
            nextIndex -= 1
            numElements -= 1
            arr[nextIndex]
        }
    }

    fun peek(): Int? {
        return if (isEmpty()) {
            null
        } else {
            arr[nextIndex - 1]
        }
    }

    fun size() = numElements

    private fun isEmpty(): Boolean = numElements == 0

    private fun handleStackCapacityFull() {
        val oldArr = arr
        arr = Array(oldArr.size * 2) { 0 }

        for ((index, value) in oldArr.withIndex()) {
            arr[index] = value
        }
    }
}