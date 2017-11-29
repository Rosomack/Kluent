package org.amshove.kluent

import java.io.File
import kotlin.test.assertFalse
import kotlin.test.assertTrue

fun File.shouldExist() = assertTrue(this.exists(), "The file does not exist")
fun File.shouldNotExist() = assertFalse(this.exists(), "The file exists")

fun File.shouldBeDir() = assertTrue(this.isDirectory, "The file is not a directory")
fun File.shouldNotBeDir() = assertFalse(this.isDirectory, "The file is a directory")

fun File.shouldBeFile() = assertTrue(this.isFile, "The file is not a file")
fun File.shouldNotBeFile() = assertFalse(this.isFile, "The file is a file")

infix fun File.shouldHaveExtension(other: String) = this.extension shouldBeEqualTo other
infix fun File.shouldNotHaveExtension(other: String) = this.extension shouldNotBeEqualTo other

infix fun File.shouldHaveName(other: String) = this.name shouldBeEqualTo other
infix fun File.shouldNotHaveName(other: String) = this.name shouldNotBeEqualTo other
