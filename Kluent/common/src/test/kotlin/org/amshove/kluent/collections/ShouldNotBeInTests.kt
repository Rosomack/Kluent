package org.amshove.kluent.collections

import org.amshove.kluent.shouldNotBeIn
import kotlin.test.assertFails

// TODO: Port tests
class ShouldNotBeInTests /*: Spek({
    given("the shouldNotBeIn method") {
        on("checking object not in Array") {
            val person = Person("Jon", "Doe")
            val array = arrayOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
            it("should pass") {
                person shouldNotBeIn array
            }
        }
        on("checking object in Array") {
            val person = Person("Jon", "Doe")
            val array = arrayOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
            it("should fail") {
                assertFails { person shouldNotBeIn array }
            }
        }
        on("checking object not in Iterable") {
            val person = Person("Jon", "Doe")
            val iterable = listOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
            it("should pass") {
                person shouldNotBeIn iterable
            }
        }
        on("checking object in Iterable") {
            val person = Person("Jon", "Doe")
            val array = listOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
            it("should fail") {
                assertFails { person shouldNotBeIn array }
            }
        }
    }
})*/
