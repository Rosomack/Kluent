package org.amshove.kluent.collections

import org.amshove.kluent.shouldContainNone
import kotlin.test.assertFails

// TODO: Port tests
class ShouldContainNoneTests /*: Spek({
    given("the shouldContainNone method") {
        on("testing a list which doesn't contain at least one element") {
            it("should pass") {
                val cities = listOf("Israel", "Phoenix", "Egypt")
                val actual = listOf("Berlin", "Stuttgart")

                actual shouldContainNone cities
            }
        }
        on("testing a list which contains at least one element") {
            it("should fail") {
                val cities = listOf("Israel", "Phoenix", "Stuttgart", "Egypt")
                val actual = listOf("Berlin", "Stuttgart")

                assertFails { actual shouldContainNone cities }
            }
        }
    }
})*/
