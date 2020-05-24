package com.d04nhtu.data_structures.trees

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BinarySearchTreeTest {

    @Test
    fun binarySearchTreeTest() {
        val binarySearchTree = BinarySearchTree<Int>()
        binarySearchTree.insert(5)
        binarySearchTree.insert(6)
        binarySearchTree.insert(4)
        binarySearchTree.insert(2)
        binarySearchTree.insert(3)
        binarySearchTree.insert(5)

        binarySearchTree.printTree()

        assert(binarySearchTree.search(5) == true)
        assert(binarySearchTree.search(4) == true)

        binarySearchTree.remove(4)
        assert(binarySearchTree.search(4) == false)
    }
}