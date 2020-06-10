package com.d04nhtu.dsa.data_structures.trees

import org.junit.jupiter.api.Test

internal class TrieTest {

    @Test
    fun trieTest() {
        val wordTrie = Trie()
        val wordList = listOf("apple", "go", "goodbye", "zebra")

        for (word in wordList) {
            wordTrie.add(word)
        }

        assert(wordTrie.exist("apple"))
        assert(wordTrie.exist("go"))
        assert(!wordTrie.exist("goodb"))
        assert(wordTrie.exist("goodbye"))
        assert(wordTrie.exist("zebra"))

        wordTrie.delete("zebra")
        assert(!wordTrie.exist("zebra"))
    }
}