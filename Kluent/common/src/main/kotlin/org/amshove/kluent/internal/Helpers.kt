package org.amshove.kluent.internal

internal fun <T> join(theArray: Array<T>?): String = if (theArray == null) "null" else theArray.joinToString(", ")
internal fun <T> join(theIterable: Iterable<T>): String = theIterable.joinToString(", ")
internal fun <R, T> join(theMap: Map<R, T>): String = theMap.entries.joinToString(", ")
