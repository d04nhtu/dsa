package com.d04nhtu.data_structures.trees

class BinarySearchTree<T : Comparable<T>>(var root: TreeNode<T>? = null) {

    fun insert(newValue: T) {
        val newNode = TreeNode(newValue)
        var node = root

        if (node == null) {
            root = newNode
            return
        }

        while (true) {
            if (node!!.value == newNode.value) {
                break
            } else if (node.value!! > newNode.value as T) {
                if (node.left != null) {
                    node = node.left
                } else {
                    node.left = newNode
                    break
                }
            } else {
                if (node.right != null) {
                    node = node.right
                } else {
                    node.right = newNode
                    break
                }
            }
        }
    }

    fun search(value: T): Boolean? {
        val node = root

        return if (node == null) {
            return null
        } else {
            searchRec(node, value)
        }
    }

    private fun searchRec(currentNode: TreeNode<T>, value: T): Boolean? {
        val newNode = TreeNode(value)

        return if (currentNode.value == newNode.value) {
            true
        } else if (currentNode.value!! > newNode.value as T) {
            if (currentNode.left != null) {
                searchRec(currentNode.left!!, value)
            } else {
                false
            }
        } else {
            if (currentNode.right != null) {
                searchRec(currentNode.right!!, value)
            } else {
                false
            }
        }
    }


    fun remove(value: T) {
        removeRec(root, value)
    }

    private fun removeRec(currentNode: TreeNode<T>?, value: T): TreeNode<T>? {

        if (currentNode == null) {
            return currentNode
        }

        when {
            value < (currentNode.value as T) -> {
                currentNode.left = removeRec(currentNode.left, value)
            }

            value > (currentNode.value as T) -> {
                currentNode.right = removeRec(currentNode.right, value)
            }

            else -> {
                if (currentNode.left == null) {
                    return currentNode.right
                } else if (currentNode.right == null) {
                    return currentNode.left
                }

                currentNode.value = minValue(currentNode.right!!)
                currentNode.right = removeRec(currentNode.right, currentNode.value as T)
            }
        }

        return currentNode
    }

    fun minValueNode(_currentNode: TreeNode<T>): Comparable<T>? {
        var currentNode = _currentNode
        var minValue = currentNode.value

        while (currentNode.left != null) {
            minValue = currentNode.left!!.value
            currentNode = currentNode.left!!
        }

        return minValue
    }

    private fun minValue(_currentTreeNode: TreeNode<T>): Comparable<T>? {
        var currentNode = _currentTreeNode
        var minValue = currentNode.value
        while (currentNode.left != null) {
            minValue = currentNode.left!!.value
            currentNode = currentNode.left!!
        }
        return minValue
    }

    fun printTree() {
        printTreeRec(root, 0)
    }

    private fun printTreeRec(root: TreeNode<T>?, _space: Int) {
        var space = _space

        if (root == null) return

        space += COUNT

        printTreeRec(root.right, space)

        for (i in COUNT until space) print(" ")
        print("${root.value.toString()}\n")

        printTreeRec(root.left, space)
    }
}

private const val COUNT = 5