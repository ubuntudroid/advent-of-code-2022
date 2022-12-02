package day01

import org.junit.jupiter.api.Test

import readInput

internal class Day01KtTest {

    @Test
    fun part1() {
        val testInput = readInput("Day01_test")
        check(part1(testInput) == 24000)
    }

    @Test
    fun part2() {
        val testInput = readInput("Day01_test")
        check(part2(testInput) == 45000)
    }
}