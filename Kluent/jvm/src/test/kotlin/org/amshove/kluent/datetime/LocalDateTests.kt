package org.amshove.kluent.datetime

import org.amshove.kluent.*
import org.junit.Test
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month
import kotlin.test.assertFails

class LocalDateTests {

    @Test
    fun `shouldBeAfter should pass when passing an earlier date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateBefore = dateToTest.minusDays(1)

        dateToTest shouldBeAfter dateBefore
    }

    @Test
    fun `shouldBeAfter should fail when passing a later date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateAfter = dateToTest.plusDays(1)

        assertFails { dateToTest shouldBeAfter dateAfter }
    }

    @Test
    fun `shouldBeBefore should pass whenn passing a later date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateAfter = dateToTest.plusDays(1)

        dateToTest shouldBeBefore dateAfter
    }

    @Test
    fun `shouldBeBefore should fail when passing an earlier date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateBefore = dateToTest.minusDays(1)

        assertFails { dateToTest shouldBeBefore dateBefore }
    }

    @Test
    fun `shouldBeOnOrAfter should pass when passing an earlier date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateBefore = dateToTest.minusDays(1)

        dateToTest shouldBeOnOrAfter dateBefore
    }

    @Test
    fun `shouldBeOnOrAfter should pass when passing the same date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeOnOrAfter dateToTest
    }

    @Test
    fun `shouldBeOnOrAfter should fail when passing a later date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateAfter = dateToTest.plusDays(1)

        assertFails { dateToTest shouldBeOnOrAfter dateAfter }
    }

    @Test
    fun `shouldBeOnOrBefore should pass when passing a later date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateAfter = dateToTest.plusDays(1)

        dateToTest shouldBeOnOrBefore dateAfter
    }

    @Test
    fun `shouldBeOnOrBefore should pass when passing the same date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeOnOrBefore dateToTest
    }

    @Test
    fun `shouldBeOnOrBefore should fail when passing an earlier date`() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateBefore = dateToTest.minusDays(1)

        assertFails { dateToTest shouldBeOnOrBefore dateBefore }
    }

    @Test
    fun `shouldBeOn should pass when passing the correct day`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeOn DayOfWeek.WEDNESDAY
    }

    @Test
    fun `shouldBeOn should fail when passing an incorrect day`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldBeOn DayOfWeek.MONDAY }
    }

    @Test
    fun `shouldNotBeOn should pass when passing a day it is not on`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldNotBeOn DayOfWeek.THURSDAY
    }

    @Test
    fun `shouldNotBeOn should fail when passing the day it is on`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldNotBeOn DayOfWeek.WEDNESDAY }
    }

    @Test
    fun `shouldBeIn should pass when passing the correct month`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeIn Month.MARCH
    }

    @Test
    fun `shouldBeIn should fail when passing an incorrect month`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldBeIn Month.APRIL }
    }

    @Test
    fun `shouldNotBeIn should pass when passing a month it is not in`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldNotBeIn Month.APRIL
    }

    @Test
    fun `shouldNotBeIn should fail when passing the month it is in`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldNotBeIn Month.MARCH }
    }

    @Test
    fun `shouldBeInYear should pass when passing the correct year`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeInYear 2017
    }

    @Test
    fun `shouldBeInYear should fail when passing an incorrect year`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldBeInYear 2018 }
    }

    @Test
    fun `shouldNotBeInYear should pass when passing an incorrect year`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldNotBeInYear 2014
    }

    @Test
    fun `shouldNotBeInYear should fail when passing the correct year`() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldNotBeInYear 2017 }
    }

    @Test
    fun `shouldBe x days after should pass when passing a date which is exactly x days after`() {
        val orderDate = LocalDate.of(2017, 6, 5)
        val shippingDate = LocalDate.of(2017, 6, 10)
        shippingDate shouldBe 5.days() after orderDate
    }

    @Test
    fun `shouldBe x days after should fail when passing a date which is more than x days after`() {
        val orderDate = LocalDate.of(2017, 6, 5)
        val shippingDate = LocalDate.of(2017, 6, 15)
        assertFails { shippingDate shouldBe 5.days() after orderDate }
    }

    @Test
    fun `shouldBe x days after should fail when passing a date which is less than x days after`() {
        val orderDate = LocalDate.of(2017, 6, 5)
        val shippingDate = LocalDate.of(2017, 6, 7)
        assertFails { shippingDate shouldBe 5.days() after orderDate }
    }

    @Test
    fun `shouldBeAtLeast x days after should pass when passing a date which is exactly x days after`() {
        val orderDate = LocalDate.of(2017, 6, 5)
        val shippingDate = LocalDate.of(2017, 6, 10)
        shippingDate shouldBeAtLeast 5.days() after orderDate
    }

    @Test
    fun `shouldBeAtLeast x days after should pass when passing a date which is more than x days after`() {
        val orderDate = LocalDate.of(2017, 6, 5)
        val shippingDate = LocalDate.of(2017, 6, 15)
        shippingDate shouldBeAtLeast 5.days() after orderDate
    }

    @Test
    fun `shouldBeAtLeast x days after should fail when passing a date which is less than x days after`() {
        val orderDate = LocalDate.of(2017, 6, 5)
        val shippingDate = LocalDate.of(2017, 6, 7)
        assertFails { shippingDate shouldBeAtLeast 5.days() after orderDate }
    }

    @Test
    fun `shouldBeAtMost x days after should pass when passing a date which is exactly x days after`() {
        val orderDate = LocalDate.of(2017, 6, 5)
        val shippingDate = LocalDate.of(2017, 6, 10)
        shippingDate shouldBeAtMost 5.days() after orderDate
    }

    @Test
    fun `shouldBeAtMost x days after should pass when passing a date which is less than x days after`() {
        val orderDate = LocalDate.of(2017, 6, 5)
        val shippingDate = LocalDate.of(2017, 6, 7)
        shippingDate shouldBeAtMost 5.days() after orderDate
    }

    @Test
    fun `shouldBeAtMost x days after should fail when passing a date which is more than x days after`() {
        val orderDate = LocalDate.of(2017, 6, 5)
        val shippingDate = LocalDate.of(2017, 6, 15)
        assertFails { shippingDate shouldBeAtMost 5.days() after orderDate }
    }
}

/* TODO: Port tests
given("the shouldBe x.days before method") {
    val orderDate = LocalDate.of(2017, 6, 15)
    on("passing a date which is exactly x days before") {
        val shippingDate = LocalDate.of(2017, 6, 10)
        it("should pass") {
            shippingDate shouldBe 5.days() before orderDate
        }
    }
    on("passing a date which is more than x days before") {
        val shippingDate = LocalDate.of(2017, 6, 9)
        it("should fail") {
            assertFails { shippingDate shouldBe 5.days() before orderDate }
        }
    }
    on("passing a date which is less than x days before") {
        val shippingDate = LocalDate.of(2017, 6, 12)
        it("should fail") {
            assertFails { shippingDate shouldBe 5.days() before orderDate }
        }
    }
}
given("the shouldBeAtLeast x.days before method") {
    val orderDate = LocalDate.of(2017, 6, 15)
    on("passing a date which is exactly x before after") {
        val shippingDate = LocalDate.of(2017, 6, 10)
        it("should pass") {
            shippingDate shouldBeAtLeast 5.days() before orderDate
        }
    }
    on("passing a date which is more than x days before") {
        val shippingDate = LocalDate.of(2017, 6, 9)
        it("should pass") {
            shippingDate shouldBeAtLeast 5.days() before orderDate
        }
    }
    on("passing a date which is less than x days before") {
        val shippingDate = LocalDate.of(2017, 6, 12)
        it("should fail") {
            assertFails { shippingDate shouldBeAtLeast 5.days() before orderDate }
        }
    }
}
given("the shouldBeAtMost x.days before method") {
    val orderDate = LocalDate.of(2017, 6, 15)
    on("passing a date which is exactly x days before") {
        val shippingDate = LocalDate.of(2017, 6, 10)
        it("should pass") {
            shippingDate shouldBeAtMost 5.days() before orderDate
        }
    }
    on("passing a date which is more than x days before") {
        val shippingDate = LocalDate.of(2017, 6, 5)
        it("should fail") {
            assertFails { shippingDate shouldBeAtMost 5.days() before orderDate }
        }
    }
    on("passing a date which is less than x days before") {
        val shippingDate = LocalDate.of(2017, 6, 7)
        it("should fail") {
            assertFails { shippingDate shouldBeAtMost 5.days() before orderDate }
        }
    }
}
})
*/
