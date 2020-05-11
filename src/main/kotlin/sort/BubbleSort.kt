package sort

fun <T : Comparable<T>> bubbleSort(array: Array<T>) {
    val len = array.size - 1

    for (i in 0 until len) {
        for (j in 0 until len) {
            if (array[j + 1] < array[j]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}