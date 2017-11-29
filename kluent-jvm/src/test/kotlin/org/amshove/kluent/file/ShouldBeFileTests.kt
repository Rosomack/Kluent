package org.amshove.kluent.file

import org.amshove.kluent.file.useDir
import org.amshove.kluent.file.useFile
import org.amshove.kluent.shouldBeFile
import org.amshove.kluent.shouldNotBeFile
import org.junit.Test
import java.io.File
import kotlin.test.assertFails

class ShouldBeFileTests {
    val file = File("isFile")
    val dir = File("isDir")

    @Test
    fun `shouldBeFile should pass when passing a File that is a file`() {
        file.useFile { it.shouldBeFile() }
    }

    @Test
    fun `shouldBeFile should fail when passing a File that is a directory`() {
        dir.useDir { assertFails { it.shouldBeFile() } }
    }

    @Test
    fun `shouldNotBeFile should pass when passing a File that is a directory`() {
        dir.useDir { it.shouldNotBeFile() }
    }

    @Test
    fun `shouldNotBeFile should fail when passing a File that is a file`() {
        file.useFile { assertFails { it.shouldNotBeFile() } }
    }
}
