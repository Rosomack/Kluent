package org.amshove.kluent.file

import org.amshove.kluent.shouldBeDir
import org.amshove.kluent.shouldNotBeDir
import org.junit.Test
import java.io.File
import kotlin.test.assertFails

class ShouldBeDirTests {
    val dir = File("testDir")
    val file = File("test")

    @Test
    fun `shouldBeDir should pass when passing a File that is a directory`() {
        dir.useDir { it.shouldBeDir() }
    }

    @Test
    fun `shouldBeDir should fail when passing a File that is not a directory`() {
        file.useFile { assertFails { it.shouldBeDir() } }
    }

    @Test
    fun `shouldNotBeDir should pass when passing a File that is not a directory`() {
        file.useFile { it.shouldNotBeDir() }
    }

    @Test
    fun `shouldNotBeDir should fail when passing a File that is a directory`() {
        dir.useDir { assertFails { it.shouldNotBeDir() } }
    }

}
