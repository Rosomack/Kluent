package org.amshove.kluent.map

import org.amshove.kluent.shouldNotHaveValue
import kotlin.test.assertFails

// TODO: Port tests
class ShouldNotHaveValueTests /*: Spek({
    given("the should not have value method") {
        on("checking a Map with the value") {
            val map = mapOf("First" to 1, "Second" to 2)
            it("should fail") {
                assertFails { map shouldNotHaveValue 1 }
            }
        }
        on("checking a Map without the value") {
            val map = mapOf("first" to 1, "second" to 2)
            it("should pass") {
                map shouldNotHaveValue 3
            }
            it("should format the values") {
                val theFailure = getFailure { map shouldNotHaveValue 2 }
                Assert.assertEquals("1, 2", theFailure.actual)
            }
        }
        on("checking any Map for an object as value") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob, bob to jon)
            it("should fail") {
                assertFails { map shouldNotHaveValue bob }
            }
        }
        on("checking any Map for an object which isn't contained") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob)
            it("should pass") {
                map shouldNotHaveValue jon
            }
            it("should format the output") {
                val failure = getFailure { map shouldNotHaveValue bob }
                Assert.assertEquals("Person(name=Bob, surname=Blue)", failure.actual)
            }
        }
    }


})*/