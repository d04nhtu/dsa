package com.d04nhtu.dsa.sort

fun <T : Comparable<T>> heapSort(_array: Array<T>): Array<T> {
    var array = _array

//    Create the Max Heap
    for (i in _array.indices) {
        array = heapify(array, i)
    }

    var swapPosition = array.size - 1

    for (i in 0 until (array.size - 1)) {
        val biggerValue = array[0]
        array[0] = array[swapPosition]
        array[swapPosition] = biggerValue

//        Max-heapify
        for (j in 0 until swapPosition) {
            array = heapify(array, j)
        }
        swapPosition -= 1
    }

    return array
}

fun <T : Comparable<T>> heapify(_array: Array<T>, index: Int): Array<T> {
    var array = _array

//    End of heap
    if (index == 0) {
        return array
    }

    val indexParent = (index - 1)//2
    val valueParent = array[indexParent]
    val valueChildren = array[index]

    if (valueChildren > valueParent) {
        array[indexParent] = valueChildren
        array[index] = valueParent
        array = heapify(array, indexParent)
    }

    return array
}
