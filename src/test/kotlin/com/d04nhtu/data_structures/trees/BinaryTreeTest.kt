package com.d04nhtu.data_structures.trees

import org.junit.jupiter.api.Test

internal class BinaryTreeTest {

    @ExperimentalStdlibApi
    @Test
    fun breadthFirstSearchTest() {
        val tree = BinaryTree("D")
        tree.root.left = TreeNode("B")
        tree.root.right = TreeNode("E")
        tree.root.right!!.right = TreeNode("F")
        tree.root.left!!.left = TreeNode("A")
        tree.root.left!!.right = TreeNode("C")

        print("$tree\n\n")

        val breadthFirstTraversal=tree.breadthFirstTraversal()

//        expect: [D, B, E, A, C, F]
        print("breadthFirstTraversal: ${breadthFirstTraversal}\n\n")

//        expect: [D, B, A, C, E, F]
        print("preOrderTraversal: ${tree.preOrderTraversal()}\n\n")

//        expect: [A, B, C, D, E, F]
        print("inOrderTraversal: ${tree.inOrderTraversal()}\n\n")

//        expect: [A, C, B, F, E, D]
        print("postOrderTraversal: ${tree.postOrderTraversal()}")

    }
}
