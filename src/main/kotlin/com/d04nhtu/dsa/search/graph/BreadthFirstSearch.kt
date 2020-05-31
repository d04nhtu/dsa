package com.d04nhtu.dsa.search.graph

import kotlin.collections.ArrayDeque

@ExperimentalStdlibApi
fun <T : Comparable<T>> breadthFirstSearch(rootNode: GraphNode<T>, searchValue: T): GraphNode<T>? {
    val visited = mutableListOf<GraphNode<T>>()
    val queue = ArrayDeque<GraphNode<T>>()
    queue.add(rootNode)

    while (queue.size > 0) {
        val currentNode = queue.removeFirst()
        visited.add(currentNode)

        if (currentNode.value == searchValue) {
            return currentNode
        }

        for (child in currentNode.children) {
            if (!visited.contains(child)) {
                queue.add(child)
            }
        }
    }

    return null
}