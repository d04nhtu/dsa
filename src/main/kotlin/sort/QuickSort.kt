package sort

fun <T : Comparable<T>> quickSort(array: Array<T>) {
    quickSortHelper(array, 0, array.size - 1)
}

fun <T : Comparable<T>> quickSortHelper(array: Array<T>, low: Int, high: Int) {
    if (high <= low) {
        return
    }

    val pivotIndex = partition(array, low, high)
    quickSortHelper(array, low, pivotIndex - 1)
    quickSortHelper(array, pivotIndex + 1, high)

}

fun <T : Comparable<T>> partition(array: Array<T>, low: Int, high: Int): Int {
    var i = low
    var pivotIndex = high
    val pivotValue = array[pivotIndex]

    while (pivotIndex != i) {
        val element = array[i]

        if (element <= pivotValue) {
            i++
            continue
        }

        array[i] = array[pivotIndex - 1]
        array[pivotIndex - 1] = pivotValue
        array[pivotIndex] = element
        pivotIndex -= 1
    }
    return pivotIndex
}


