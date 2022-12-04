package day04

import org.junit.jupiter.api.Test

import readInput

internal class Day04KtTest {

    @Test
    fun part1() {
        val testInput = readInput("Day04_test")
        check(part1(testInput) == 2)
    }

    @Test
    fun part2() {
        val testInput = readInput("Day04_test")
        check(part2(testInput) == 45000)
    }
}