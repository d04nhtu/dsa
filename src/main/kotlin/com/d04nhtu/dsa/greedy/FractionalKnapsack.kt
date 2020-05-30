package com.d04nhtu.dsa.greedy

class Item(val weight: Int, val value: Int) : Comparable<Item> {
    private val valuePerWeight = value.toFloat() / weight

    override fun compareTo(other: Item) = valuePerWeight.compareTo(other.valuePerWeight)
}

fun maxValueOfFractionalKnapsack(_capacity: Int, _items: List<Item>): Float {
    val items = _items.sortedDescending()
    var capacity = _capacity

    var maxValue = 0f

    for (item in items) {
        val currentWeight = item.weight
        val currentValue = item.value

        if ((capacity - currentWeight) >= 0) {
            capacity -= currentWeight
            maxValue += currentValue
        } else {
            val fraction = capacity.toFloat() / currentWeight
            maxValue += currentValue * fraction
            break
        }
    }

    return maxValue
}