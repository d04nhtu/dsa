package search.list

fun <T : Comparable<T>> binarySearchRecursive(array: Array<T>, key: T): Int {
    return binarySearchRecursiveHelper(array, key, 0, array.size - 1)
}

fun <T : Comparable<T>> binarySearchRecursiveHelper(array: Array<T>, key: T, low: Int, high: Int): Int {
    return if (low == high) {
        if (array[low] == key) low else -1

    } else {
        val mid = (low + high) / 2
        val comparedResult = array[mid].compareTo(key)

        when {
            comparedResult == 0 -> mid
            comparedResult > 0 -> binarySearchRecursiveHelper(array, key, low, mid - 1)
            else -> binarySearchRecursiveHelper(array, key, mid + 1, high)
        }
    }
}