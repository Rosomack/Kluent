package org.amshove.kluent.file

import org.amshove.kluent.file.useFile
import org.amshove.kluent.shouldHaveName
import org.amshove.kluent.shouldNotHaveName
import org.junit.Test
import java.io.File
import kotlin.test.assertFails

class ShouldHaveNameTests {
    val name = "thisfilenameisweird.csv"
    val file = File(name)

    @Test
    fun `shouldHaveName should pass when passing the correct name of the File`() {
        file.useFile { it.shouldHaveName(name) }
    }

    @Test
    fun `shouldHaveName should fail when passing the incorrect name of the File`() {
        file.useFile { assertFails { it.shouldHaveName("anothername") } }
    }

    @Test
    fun `shouldNotHaveName should pass when passing a name that the File doesn't have`() {
        file.useFile { it.shouldNotHaveName("anothername") }
    }

    @Test
    fun `shouldNotHaveName should fail when passing the name of the File`() {
        file.useFile { assertFails { it.shouldNotHaveName(name) } }
    }
}
