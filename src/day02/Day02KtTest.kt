package day02

import org.junit.jupiter.api.Test
import readInput

internal class Day02KtTest {

    @Test
    fun part1() {
        val testInput = readInput("Day02_test")
        check(part1(testInput) == 15)
    }

    @Test
    fun part2() {
        val testInput = readInput("Day02_test")
        check(part2(testInput) == 12)
    }
}