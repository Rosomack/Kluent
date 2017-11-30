package org.amshove.kluent.file

import org.amshove.kluent.file.useFile
import org.amshove.kluent.shouldExist
import org.amshove.kluent.shouldNotExist
import org.junit.Test
import java.io.File
import kotlin.test.assertFails

class ShouldExistTests {

    val file = File("test")

    @Test
    fun `shouldExist should pass when passing a File that exists`() {
        file.useFile { it.shouldExist() }
    }

    @Test
    fun `shouldExist should fail when passing a File that doesn't exist`() {
        assertFails { file.shouldExist() }
    }

    @Test
    fun `shouldNotExist should pass when passing a File that doesn't exist`() {
        file.shouldNotExist()
    }

    @Test
    fun `shouldNotExist should fail when passing a File that exists`() {
        file.useFile { assertFails { it.shouldNotExist() } }
    }

}
