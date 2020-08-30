package com.d04nhtu.dsa.data_structures.maps

import org.junit.jupiter.api.Test

internal class HashMapTest {

    @Test
    fun delete() {
        val hashMap = HashMap(7)

        hashMap.put("one", 1)
        hashMap.put("two", 2)
        hashMap.put("three", 3)
        hashMap.put("neo", 11)

        assert(hashMap.get("one") == 1)
        assert(hashMap.get("neo") == 11)
        assert(hashMap.get("three") == 3)
        assert(hashMap.size() == 4)

        hashMap.delete("one")

        assert(hashMap.get("one") == null)
        assert(hashMap.size() == 3)
    }
}