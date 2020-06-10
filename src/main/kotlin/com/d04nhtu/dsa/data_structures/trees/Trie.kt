package com.d04nhtu.dsa.data_structures.trees

class TrieNode {
    var isWord = false
    var children = HashMap<Char, TrieNode>()
}

class Trie {
    var root = TrieNode()

    fun add(word: String) {
        var currentNode = root

        for (char in word) {
            if (!currentNode.children.contains(char)) {
                currentNode.children[char] = TrieNode()
            }
            currentNode = currentNode.children[char]!!
        }
        currentNode.isWord = true
    }

    fun exist(word: String): Boolean {
        var currentNode = root

        for (char in word) {
            if (!currentNode.children.contains(char)) {
                return false
            }
            currentNode = currentNode.children[char]!!
        }

        return currentNode.isWord
    }

    fun delete(word: String): Boolean {
        var currentNode = root

        for (char in word) {
            if (!currentNode.children.contains(char)) {
                return false
            }
            currentNode = currentNode.children[char]!!
        }

        if (currentNode.isWord) {
            currentNode.isWord = false
            return true
        }

        return false
    }
}