package sort

fun <T : Comparable<T>> mergeSort(list: List<T>): List<T> {
    if (list.size <= 1) {
        return list
    }

    val mid = list.size / 2
    var left = list.slice(0 until mid)
    var right = list.slice(mid until list.size)

    left = mergeSort(left)
    right = mergeSort(right)

    return merge(left, right)
}

fun <T : Comparable<T>> merge(left: List<T>, right: List<T>): List<T> {
    val merged = mutableListOf<T>()
    var leftIndex = 0
    var rightIndex = 0

    while (leftIndex < left.size && rightIndex < right.size) {

        if (left[leftIndex] > right[rightIndex]) {
            merged.add(right[rightIndex])
            rightIndex += 1
        } else {
            merged.add(left[leftIndex])
            leftIndex += 1
        }
    }

    merged.addAll(left.slice(leftIndex until left.size))
    merged.addAll(right.slice(rightIndex until right.size))

    return merged
}




