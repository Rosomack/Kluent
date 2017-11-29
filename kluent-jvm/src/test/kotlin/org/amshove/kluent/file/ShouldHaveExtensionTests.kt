package org.amshove.kluent.file

import org.amshove.kluent.file.useFile
import org.amshove.kluent.shouldHaveExtension
import org.amshove.kluent.shouldNotHaveExtension
import org.junit.Test
import java.io.File
import kotlin.test.assertFails

class ShouldHaveExtensionTests {
    val txtFile = File("test.txt")
    val wavFile = File("test.wav")

    @Test
    fun `shouldHaveExtension should pass when passing txt on a File with txt extension`() {
        txtFile.useFile { it.shouldHaveExtension("txt") }
    }

    @Test
    fun `shouldHaveExtension should fail when passing txt on a File without txt extension`() {
        wavFile.useFile { assertFails { it.shouldHaveExtension("txt") } }
    }

    @Test
    fun `shouldNotHaveExtension should pass when passing txt on a File without txt extension`() {
        wavFile.useFile { it.shouldNotHaveExtension("txt") }
    }

    @Test
    fun `shouldNotHaveExtension should fail when passing txt on a File with txt extension`() {
        txtFile.useFile { assertFails { it.shouldNotHaveExtension("txt") } }
    }
}
