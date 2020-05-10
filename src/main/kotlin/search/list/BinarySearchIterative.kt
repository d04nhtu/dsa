package search.list

fun <T : Comparable<T>> binarySearchIterative(array: Array<T>, key: T): Int {
    var low = 0
    var high = array.size - 1

    while (low <= high) {
        val mid = (low + high) / 2
        val comparedResult = array[mid].compareTo(key)

        when {
            comparedResult == 0 -> return mid
            comparedResult > 0 -> high = mid - 1
            else -> low = mid + 1
        }
    }

    return -1
}