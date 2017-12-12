package org.amshove.kluent.internal

import kotlin.reflect.KClass


// TODO: Use when native supports it
//internal expect fun <T : Any> KClass<T>.getPlatformspecificName(): String
internal fun <T : Any> KClass<T>.getPlatformspecificName(): String = this.simpleName!!
