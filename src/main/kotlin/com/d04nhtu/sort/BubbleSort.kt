package com.d04nhtu.sort

fun <T : Comparable<T>> bubbleSort(array: Array<T>) {
    val n = array.size - 1

    for (i in 0..n) {
        var swap = false

        for (j in 0 until (n - i)) {
            if (array[j + 1] < array[j]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
                swap = true
            }
        }

        if (!swap) break
    }
}