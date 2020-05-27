package com.d04nhtu.dsa.data_structures.trees

class TreeNode<T : Comparable<T>>(
    var value: T,
    var left: TreeNode<T>? = null,
    var right: TreeNode<T>? = null
) {
    override fun toString(): String = value.toString()
}

class BinaryTree<T : Comparable<T>>(value: T) {
    var root = TreeNode(value)

    @ExperimentalStdlibApi
    fun breadthFirstTraversal(): ArrayList<TreeNode<T>> {
        val queue = ArrayDeque<TreeNode<T>>()
        val visitOrder = ArrayList<TreeNode<T>>()
        var node = root
        queue.addLast(node)

        while (queue.size > 0) {
            node = queue.removeFirst()
            visitOrder.add(node)

            if (node.left != null) {
                queue.addLast(node.left!!)
            }

            if (node.right != null) {
                queue.addLast(node.right!!)
            }
        }

        return visitOrder
    }

    //  Traverse the node -> traverse left side -> traverse right side
    fun preOrderTraversal(): ArrayList<TreeNode<T>> {
        return preOrderDfs(root)
    }

    private fun preOrderDfs(node: TreeNode<T>): ArrayList<TreeNode<T>> {
        val lvlVisited = ArrayList<TreeNode<T>>()

        lvlVisited.add(node)

        if (node.left != null) {
            lvlVisited.addAll(preOrderDfs(node.left!!))
        }

        if (node.right != null) {
            lvlVisited.addAll(preOrderDfs(node.right!!))
        }

        return lvlVisited
    }

    //    Traverse left subtree -> visit the node -> traverse right subtree
    fun inOrderTraversal(): ArrayList<TreeNode<T>> {
        return inOrderDfs(root)
    }

    private fun inOrderDfs(node: TreeNode<T>): ArrayList<TreeNode<T>> {
        val lvlVisited = ArrayList<TreeNode<T>>()

        if (node.left != null) {
            lvlVisited.addAll(inOrderDfs(node.left!!))
        }

        lvlVisited.add(node)

        if (node.right != null) {
            lvlVisited.addAll(inOrderDfs(node.right!!))
        }

        return lvlVisited
    }

    //    Traverse left subtree -> traverse right subtree -> visit the node.
    fun postOrderTraversal(): ArrayList<TreeNode<T>> {
        return postOrderDfs(root)
    }

    private fun postOrderDfs(node: TreeNode<T>): ArrayList<TreeNode<T>> {
        val lvlVisited = ArrayList<TreeNode<T>>()

        if (node.left != null) {
            lvlVisited.addAll(postOrderDfs(node.left!!))
        }

        if (node.right != null) {
            lvlVisited.addAll(postOrderDfs(node.right!!))
        }

        lvlVisited.add(node)

        return lvlVisited
    }

    @ExperimentalStdlibApi
    override fun toString(): String {
        var level = 0
        val queue = ArrayDeque<Pair<TreeNode<T>?, Int>>()
        val visitOrder = ArrayList<Pair<String, Int>>()
        var node = root
        queue.addLast(Pair(node, level))

        while (queue.size > 0) {
            val removedNode = queue.removeFirst()
            level = removedNode.second

            if (removedNode.first == null) {
                visitOrder.add(Pair("<empty>", level))
                continue
            } else {
                node = removedNode.first!!
            }

            visitOrder.add(Pair(node.value.toString(), level))

            if (node.left != null) {
                queue.addLast(Pair(node.left!!, level + 1))
            } else {
                queue.addLast(Pair(null, level + 1))
            }

            if (node.right != null) {
                queue.addLast(Pair(node.right!!, level + 1))
            } else {
                queue.addLast(Pair(null, level + 1))
            }
        }
        val builder = StringBuilder()
        builder.append("Tree: ")
        var previousLevel = -1
        for (i in 0 until visitOrder.size) {
            val (nodeValue, nodeLevel) = visitOrder[i]
            if (nodeLevel == previousLevel) {
                builder.append(" | $nodeValue")
            } else {
                builder.append("\n$nodeValue")
                previousLevel = nodeLevel
            }
        }
        return builder.toString()
    }
}

