package com.d04nhtu.dsa.search.graph

import java.util.Stack

fun <T : Comparable<T>> depthFirstSearch(rootNode: GraphNode<T>, searchValue: T): GraphNode<T>? {
    val visited = mutableListOf<GraphNode<T>>()
    val stack = Stack<GraphNode<T>>()
    stack.add(rootNode)

    while (stack.size > 0) {
        val currentNode = stack.pop()
        visited.add(currentNode)

        if (currentNode.value == searchValue) {
            return currentNode
        }

        for (child in currentNode.children) {
            if (!visited.contains(child)) {
                stack.add(child)
            }
        }
    }

    return null
}