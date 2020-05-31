package com.d04nhtu.dsa.search.graph

import java.util.*
import kotlin.collections.ArrayDeque


class GraphNode<T : Comparable<T>>(var value: T) : Comparable<GraphNode<T>> {
    var children = mutableListOf<GraphNode<T>>()

    fun addChild(newNode: GraphNode<T>) {
        children.add(newNode)
    }

    fun removeChild(delNode: GraphNode<T>) = children.remove(delNode)

    override fun compareTo(other: GraphNode<T>): Int {
        return value.compareTo(other.value)
    }

    override fun toString(): String {
        return value.toString()
    }
}

class Graph<T : Comparable<T>>(var nodes: List<GraphNode<T>>) {
    fun addEdge(node1: GraphNode<T>, node2: GraphNode<T>) {
        if (nodes.containsAll(listOf(node1, node2))) {
            node1.addChild(node2)
            node2.addChild(node1)
        }
    }

    fun removeEdge(node1: GraphNode<T>, node2: GraphNode<T>) {
        if (nodes.containsAll(listOf(node1, node2))) {
            node1.removeChild(node2)
            node2.removeChild(node1)
        }
    }
}

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