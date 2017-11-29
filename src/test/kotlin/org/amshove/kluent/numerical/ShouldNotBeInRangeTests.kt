package org.amshove.kluent.numerical

import org.amshove.kluent.shouldBeInRange
import org.amshove.kluent.shouldNotBeInRange
import kotlin.test.assertFails

// TODO: Port tests
class ShouldNotBeInRangeTests /*: Spek({
    given("the should not be in range method") {
        on("checking a value which is not in range") {
            it("should passe with lower and upper bound") {
                5.shouldNotBeInRange(6, 9)
            }
            it("should pass with an IntRange") {
                5.shouldNotBeInRange(6..9)
            }
        }
        on("checking a value within the range") {
            it("should fail with lower and upper bound") {
                assertFails { 7.shouldNotBeInRange(0, 10) }
            }
            it("should fail with lower an IntRange") {
                assertFails { 7.shouldNotBeInRange(0..10) }
            }
        }
        on("checking a value which is the lower bound") {
            it("should fail with lower and upper bound") {
                assertFails { 5.shouldNotBeInRange(5, 6) }
            }
            it("should fail with lower an IntRange") {
                assertFails { 5.shouldNotBeInRange(5..6) }
            }
        }
        on("checking a value which is the upper bound") {
            it("should fail with lower and upper bound") {
                assertFails { 5.shouldNotBeInRange(2, 5) }
            }
            it("should fail with an IntRange") {
                assertFails { 5.shouldNotBeInRange(2..5) }
            }
        }
        on("checking a long value within a range") {
            it("should pass") {
                5L.shouldBeInRange(1L..10L)
            }
        }
        on("checking a long value which is not within a range") {
            it("should fail") {
                assertFails { Long.MAX_VALUE.shouldBeInRange(Long.MIN_VALUE..0) }
            }
        }
    }
})*/
