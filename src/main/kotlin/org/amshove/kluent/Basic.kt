package org.amshove.kluent

import org.junit.Assert.*
import kotlin.reflect.KClass

infix fun Any?.shouldEqual(theOther: Any?) = assertEquals(theOther, this)

infix fun Any?.shouldNotEqual(theOther: Any?) = assertNotEquals(theOther, this)

infix fun Any?.shouldBe(theOther: Any?) = assertSame(theOther, this)

infix fun Any?.shouldNotBe(theOther: Any?) = assertNotSame(theOther, this)

infix fun Any?.shouldBeInstanceOf(className: Class<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))

infix fun Any?.shouldBeInstanceOf(className: KClass<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))

infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))

infix fun Any?.shouldNotBeInstanceOf(className: KClass<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))

fun Any?.shouldBeNull() = if (this != null) fail("expected value to be null, but was: $this") else Unit

fun Any?.shouldNotBeNull() = if (this == null) fail("Expected non null value, but value was null") else Unit

fun Boolean.shouldBeTrue() = assertTrue(this)

fun Boolean.shouldBeFalse() = assertFalse(this)

fun Boolean.shouldNotBeTrue() = this.shouldBeFalse()

fun Boolean.shouldNotBeFalse() = this.shouldBeTrue()

infix fun <T> T.should(assertion: T.() -> Boolean) = should("Expected the assertion to return true, but returned false", assertion)

fun <T> T.should(message: String, assertion: T.() -> Boolean) = try {
    if (assertion()) Unit else fail(message)
} catch (e: Exception) {
    fail("""$message
        |
        | An exception occured:
        |   ${e::class.qualifiedName}: ${e.message}
        |   ${"\tat "}${e.stackTrace.joinToString("\n\tat ")}
    """.trimMargin())
}
