package org.amshove.kluent.internal

import kotlin.test.fail

internal fun <T> assertArrayEquals(a1: Array<T>?, a2: Array<T>?) {
    if(!arraysEqual(a1, a2)) {
        fail("Expected Arrays to be equal, but were different:\n${join(a1)}\n${join(a2)}")
    }
}

internal fun <T> arraysEqual(a1: Array<T>?, a2: Array<T>?): Boolean {
    if (a1 == null || a2 == null) return false
    return a1 contentEquals a2
}
