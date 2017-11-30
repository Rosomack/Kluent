package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldNotBeNullOrBlank
import kotlin.test.assertFails

// TODO: Port tests
class ShouldNotBeNullOrBlankTests /*: Spek({
    given("the shouldNotBeNullOrBlank method") {
        on("passing a non empty CharSequence") {
            it("should pass") {
                "a".shouldNotBeNullOrBlank()
            }
        }
        on("passing an blank CharSequence") {
            it("should fail") {
                assertFails({ "   ".shouldNotBeNullOrBlank() })
            }
        }
        on("passing a null CharSequence") {
            it("should fail") {
                val str: String? = null
                assertFails({ str.shouldNotBeNullOrBlank() })
            }
        }
    }
})*/
