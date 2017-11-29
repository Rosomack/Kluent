package org.amshove.kluent.map

import org.amshove.kluent.shouldNotHaveKey
import kotlin.test.assertFails

// TODO: Port tests
class ShouldNotHaveKeyTests /*: Spek({
    given("the should not have key method") {
        on("checking a Map with the key") {
            val map = mapOf("First" to "valueIchi", "Second" to "valueNi")
            it("should fail") {
                assertFails { map shouldNotHaveKey "First" }
            }
        }
        on("checking a Map without the key") {
            val map = mapOf(1 to "first", 2 to "second")
            it("should pass") {
                map shouldNotHaveKey 3
            }
            it("should format the keys") {
                val theFailure = getFailure { map shouldNotHaveKey 2 }
                assertEquals("1, 2", theFailure.actual)
            }
        }
        on("checking any Map for an object as key") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob, bob to jon)
            it("should fail") {
                assertFails { map shouldNotHaveKey alice }
            }
        }
        on("checking any Map for an object which isn't contained") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob)
            it("should pass") {
                map shouldNotHaveKey jon
            }
            it("should format the output") {
                val failure = getFailure { map shouldNotHaveKey alice }
                assertEquals("Person(name=Alice, surname=Green)", failure.actual)
            }
        }
    }
})*/