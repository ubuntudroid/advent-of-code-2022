package day04

import readInput

fun main() {
    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}

fun part1(input: List<String>): Int = input.mangle().count {
    it[0].contains(it[1].first) && it[0].contains(it[1].last) || it[1].contains(it[0].first) && it[1].contains(it[0].last)
}

fun part2(input: List<String>): Int = input.mangle().count {
    it[0].intersect(it[1]).isNotEmpty()
}

fun List<String>.mangle(): List<List<IntRange>> = this.map {
    it.split(",").map { it.split("-") }.map { it[0].toInt()..it[1].toInt() }
}