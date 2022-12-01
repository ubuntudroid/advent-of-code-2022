import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day01KtTest {

    @Test
    fun part1() {
        val testInput = readInput("Day01_test")
        check(part1(testInput) == 24000)
    }

    /*
    Might be there is no test input/output for part 2 provided by the description - let's wait for Day 1 to see the
    final structure.
    */
    @Test
    fun part2() {
        val testInput = readInput("Day01_test")
        check(part2(testInput) == 1)
    }
}