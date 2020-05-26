package com.d04nhtu.dsa.recursion

fun towerOfHanoiRec(numDisks: Int, source: Char, auxiliary: Char, destination: Char) {
    if (numDisks == 0) {
        return
    }

    if (numDisks == 1) {
        print("$source $destination \t")
        return
    }

    towerOfHanoiRec(numDisks - 1, source, destination, auxiliary)
    print("$source $destination \t")
    towerOfHanoiRec(numDisks - 1, auxiliary, source, destination)
}

fun towerOfHanoi(numDisks: Int) {
    towerOfHanoiRec(numDisks, 'S', 'A', 'D')
}

fun main() {
    print("towerOfHanoi(2):\n")
    //    expect: S A 	S D 	A D
    towerOfHanoi(2)

    print("towerOfHanoi(3):")
    //    expect: S D 	S A 	D A 	S D 	A S 	A D 	S D
    towerOfHanoi(3)
}