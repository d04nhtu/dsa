package search.list

fun <T : Comparable<T>> linearSearch(array: Array<T>, key: T): Int {
    for ((index, value) in array.withIndex()) {
        if (value == key) {
            return index
        }
    }

    return -1
}