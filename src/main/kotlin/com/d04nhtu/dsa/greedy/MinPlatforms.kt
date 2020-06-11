package com.d04nhtu.dsa.greedy

/**
 * @param  arrival  list of arrival time
 * @param  departure list of departure time so that no train has to wait for other(s) to leave
 * @return minimum number of platforms required
 */
fun minPlatforms(_arrival: List<Int>, _departure: List<Int>): Int {
    val arrival = _arrival.sorted()
    val departure = _departure.sorted()

    var platformCount = 1
    var output = 1
    var i = 1
    var j = 0

    while (i < arrival.size && j < arrival.size) {
        if (arrival[i] < departure[j]) {
            platformCount++
            i++

            if (platformCount > output) {
                output = platformCount
            }
        } else {
            platformCount--
            j++
        }
    }
    return output
}

