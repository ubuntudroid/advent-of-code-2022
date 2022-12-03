package day03

import org.junit.jupiter.api.Test

import readInput

internal class Day03KtTest {

    @Test
    fun part1() {
        val testInput = readInput("Day03_test")
        check(part1(testInput) == 157)
    }

    @Test
    fun part2() {
        val testInput = readInput("Day03_test")
        check(part2(testInput) == 45000)
    }
}