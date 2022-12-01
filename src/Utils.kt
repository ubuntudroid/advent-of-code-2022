import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("src", "$name.txt").readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)

/**
 * Adds a blank last entry to the list if it is not already there.
 *
 * Mostly used to enhance output of [readInput] function.
 */
fun Collection<String>.ensureBlankLastItem() = if (last() == "") this else this + ""