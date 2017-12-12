@file:Suppress("unused")

package org.amshove.kluent
import org.amshove.kluent.internal.getPlatformspecificName
import kotlin.reflect.KClass
import kotlin.test.fail

infix fun <T : Throwable> (() -> Any?).shouldThrow(expectedException: KClass<T>): ExceptionResult<T> {
    try {
        this.invoke()
        fail("${expectedException::class.getPlatformspecificName()} was expected to be thrown, but wasn't")
    } catch (e: Throwable) {
        @Suppress("UNCHECKED_CAST")
        if (e.isA(expectedException)) return ExceptionResult(e as T)
        else throw fail("Expected ${expectedException.getPlatformspecificName()} to be thrown, but got ${e::class.getPlatformspecificName()}")
    }
}

infix fun <T : Throwable> (() -> Any?).shouldNotThrow(expectedException: KClass<T>) {
    try {
        this.invoke()
    } catch (e: Throwable) {
        if (expectedException.isAnyException()) {
            fail("Expected no Exception to be thrown, but got ${e::class.getPlatformspecificName()}")
        }
        if (e.isA(expectedException))
            fail("Expected ${expectedException.getPlatformspecificName()} to not be thrown")
    }
}

infix fun <T : Throwable> (() -> Any?).shouldThrow(expectedException: T) {
    try {
        this.invoke()
        fail("${expectedException::class.getPlatformspecificName()} was expected to be thrown, but wasn't")
    } catch (e: Throwable) {
        if (!e.equals(expectedException)) {
            fail("Expected $expectedException to be thrown, but got $e")
        }
    }
}

@Deprecated("Use shouldThrow instead", ReplaceWith("x shouldThrow expectedException"))
infix fun <T : Throwable> (() -> Any).shouldThrowTheException(expectedException: KClass<T>): ExceptionResult<T> = this shouldThrow expectedException

infix fun <T : Throwable> (() -> Any).shouldNotThrowTheException(expectedException: KClass<T>): NotThrowExceptionResult {
    try {
        this.invoke()
        return NotThrowExceptionResult(noException)
    } catch (e: Throwable) {
        if (expectedException.isAnyException()) {
            fail("Expected no Exception to be thrown, but got ${e::class.getPlatformspecificName()}")
        }
        return NotThrowExceptionResult(e)
    }
}

infix fun <T : Throwable> ExceptionResult<T>.withMessage(theMessage: String): ExceptionResult<T> {
    this.exceptionMessage shouldEqual theMessage
    return this
}

infix fun NotThrowExceptionResult.withMessage(theMessage: String): NotThrowExceptionResult {
    this.exceptionMessage shouldNotEqual theMessage
    return this
}

infix fun <T : Throwable> ExceptionResult<T>.withCause(expectedCause: KClass<out Throwable>): ExceptionResult<T> {
    this.exceptionCause shouldBeInstanceOf expectedCause
    return this
}

infix fun NotThrowExceptionResult.withCause(expectedCause: KClass<out Throwable>): NotThrowExceptionResult {
    this.exceptionCause shouldNotBeInstanceOf expectedCause
    return this
}

val AnyException = AnyExceptionType::class

class AnyExceptionType : Throwable()

internal val noException = NoExceptionType.noExceptionType()
internal fun Throwable.isA(expected: KClass<out Throwable>) = expected.isAnyException() || expected.isInstance(this)
internal fun <T : Throwable> KClass<T>.isAnyException() = this::class == AnyException::class

class NoExceptionType private constructor(): Throwable("None") {
   internal companion object {
       fun noExceptionType() = NoExceptionType()
   }
}

