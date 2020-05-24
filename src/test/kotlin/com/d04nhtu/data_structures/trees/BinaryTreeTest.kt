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

        assert(tree.breadthFirstTraversal().toString() == "[D, B, E, A, C, F]")
        assert(tree.preOrderTraversal().toString() == "[D, B, A, C, E, F]")
        assert(tree.inOrderTraversal().toString() == "[A, B, C, D, E, F]")
        assert(tree.postOrderTraversal().toString() == "[A, C, B, F, E, D]")
    }
}
