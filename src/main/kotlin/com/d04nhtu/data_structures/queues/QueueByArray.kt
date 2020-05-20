package com.d04nhtu.data_structures.queues

class QueueByArray(var initialSize: Int = 10) {

    private var arr = IntArray(initialSize)
    private var nextIndex: Int = 0
    private var frontIndex: Int = -1
    private var queueSize: Int = 0

    fun enqueue(value: Int) {
        if (queueSize == arr.size) {
            handleQueueCapacityFull()
        }

        arr[nextIndex] = value
        queueSize++
        nextIndex = (nextIndex + 1) % arr.size

        if (frontIndex == -1) {
            frontIndex = 0
        }
    }

    fun dequeue(): Int? {
        if (isEmpty()) {
            frontIndex = -1
            nextIndex = 0
            return null
        }

        val value = arr[frontIndex]
        frontIndex = (frontIndex + 1) % arr.size
        queueSize--
        return value
    }

    fun size() = queueSize

    private fun isEmpty() = size() == 0

    fun front(): Int? {
        if (isEmpty()) {
            return null
        }
        return arr[frontIndex]
    }

    private fun handleQueueCapacityFull() {
        val oldArr = arr
        arr = IntArray(2 * oldArr.size)

        var index = 0

//        copy all elements from front of queue (front-index) until end
        for (i in frontIndex until oldArr.size) {
            arr[index] = oldArr[i]
            index++
        }

//        case: when front-index is ahead of next index
        for (i in 0 until frontIndex) {
            arr[index] = oldArr[i]
            index++
        }

//        reset pointers
        frontIndex = 0
        nextIndex = index
    }
}
