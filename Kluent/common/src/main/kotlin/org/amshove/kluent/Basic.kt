@file:Suppress("unused")

package org.amshove.kluent

import kotlin.reflect.KClass
import kotlin.test.*

infix fun Any?.shouldEqual(theOther: Any?) = assertEquals(theOther, this)

infix fun Any?.shouldNotEqual(theOther: Any?) = assertNotEquals(theOther, this)

// TODO: Kotlin native doesn't know about assertSame yet
//infix fun Any?.shouldBe(theOther: Any?) = assertSame(theOther, this)

// TODO: Kotlin native doesn't know about assertNotSame yet
//infix fun Any?.shouldNotBe(theOther: Any?) = assertNotSame(theOther, this)

infix fun Any?.shouldBeInstanceOf(className: KClass<*>) = assertTrue(className.isInstance(this), "Expected $this to be an instance of $className")

infix fun Any?.shouldNotBeInstanceOf(className: KClass<*>) = assertFalse(className.isInstance(this), "Expected $this to not be an instance of $className")

fun Any?.shouldBeNull() = assertNull(this)

fun Any?.shouldNotBeNull() = assertNotNull(this)

fun Boolean.shouldBeTrue() = assertTrue(this)

fun Boolean.shouldBeFalse() = assertFalse(this)

fun Boolean.shouldNotBeTrue() = this.shouldBeFalse()

fun Boolean.shouldNotBeFalse() = this.shouldBeTrue()
