package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldNotBeNullOrEmpty
import kotlin.test.assertFails

// TODO: Port tests
class ShouldNotBeNullOrEmptyTests /*: Spek({

    given("the shouldNotBeNullOrEmpty method") {
        on("passing a non empty CharSequence") {
            it("should pass") {
                "abc".shouldNotBeNullOrEmpty()
            }
        }
        on("passing an empty CharSequence") {
            it("should fail") {
                assertFails({ "".shouldNotBeNullOrEmpty() })
            }
        }
        on("passing a null CharSequence") {
            it("should fail") {
                val str: String? = null
                assertFails({ str.shouldNotBeNullOrEmpty() })
            }
        }
    }
})*/
