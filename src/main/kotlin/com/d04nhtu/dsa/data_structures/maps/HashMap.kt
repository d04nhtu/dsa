package com.d04nhtu.dsa.data_structures.maps

class LinkedListNode(var key: String, var value: Int, var next: LinkedListNode? = null)

class HashMap(var initialSize: Int = 15) {
    private var bucketArray = Array<LinkedListNode?>(initialSize) { null }
    private var p = 31
    private var numEntries = 0
    private var loadFactor = 0.7

    fun put(key: String, value: Int) {
        val bucketIndex = getHashCode(key)

        val newNode = LinkedListNode(key, value)
        var head = bucketArray[bucketIndex]

//        check if key is already present in the map, and update it's value
        while (head != null) {
            if (head.key == key) {
                head.value = value
                return
            }
            head = head.next
        }

//        key not found in the chain --> create a new entry and place it at the head of the chain
        head = bucketArray[bucketIndex]
        newNode.next = head
        bucketArray[bucketIndex] = newNode
        numEntries++

//        check for load factor
        val currentLoadFactor = numEntries / bucketArray.size
        if (currentLoadFactor > loadFactor) {
            numEntries = 0
            rehash()
        }
    }

    fun get(key: String): Int? {
        val bucketIndex = getHashCode(key)
        var head = bucketArray[bucketIndex]
        while (head != null) {
            if (head.key == key) {
                return head.value
            }
            head = head.next
        }
        return null
    }

    fun size() = numEntries

    fun delete(key: String) {
        val bucketIndex = getHashCode(key)
        var head = bucketArray[bucketIndex]

        var previous: LinkedListNode? = null
        while (head != null) {
            if (head.key == key) {
                if (previous == null) {
                    bucketArray[bucketIndex] = head.next
                } else {
                    previous.next = head.next
                }
                numEntries--
                return
            } else {
                previous = head
                head = head.next
            }
        }
    }

    private fun getHashCode(key: String): Int {
        val numBuckets = bucketArray.size
        var currentCoefficient = 1
        var hashCode = 0
        for (character in key) {
            hashCode += character.toInt() * currentCoefficient
//            compress hash_code
            hashCode = hashCode() % numBuckets
            currentCoefficient *= p
//            compress coefficient
            currentCoefficient %= numBuckets
        }
//        one last compression before returning
        return hashCode % numBuckets
    }

    private fun rehash() {
        val oldNumBuckets = bucketArray.size
        val oldBucketArray = bucketArray
        var numBuckets = 2 * oldNumBuckets
        bucketArray = Array<LinkedListNode?>(initialSize) { null }

        for (_head in oldBucketArray) {
            var head = _head
            while (head != null) {
//                we can use our put() method to rehash
                put(head.key, head.value)
                head = head.next
            }
        }
    }
}