package org.amshove.kluent.numerical

import org.amshove.kluent.shouldBeGreaterOrEqualTo
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeGreaterOrEqualToTests {
/* TODO: JavaScript doesn't support backtick names
    @Test
    fun `shouldBeGreaterOrEqual should pass when checking a greater value`() {
        5.shouldBeGreaterOrEqualTo(2)
    }

    @Test
    fun `shouldBeGreaterOrEqual should pass when checking an equal value`() {
        5.shouldBeGreaterOrEqualTo(5)
    }

    @Test
    fun `shouldBeGreaterOrEqual should fail when checking a lesser value`() {
        assertFails { 2.shouldBeGreaterOrEqualTo(5) }
    }
*/

    @Test
    fun shouldBeGreaterOrEqualShouldPassWhenCheckingAGreaterValue() {
        5.shouldBeGreaterOrEqualTo(2)
    }

    @Test
    fun shouldBeGreaterOrEqualShouldPassWhenCheckingAnEqualValue() {
        5.shouldBeGreaterOrEqualTo(5)
    }
}
