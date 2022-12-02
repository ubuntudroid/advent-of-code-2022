package day02

import day02.Result.*
import day02.Result.Companion.toResult
import day02.Shape.Companion.toShape
import ensureBlankLastItem
import readInput

fun main() {
    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}

fun part1(input: List<String>): Int = input
    .map { it.split(" ") }
    .map { it[0].toShape() to it[1].toShape() }
    .sumOf { (opponentShape, myShape) -> myShape.fight(opponentShape).points + myShape.points }

fun part2(input: List<String>): Int = input
    .map { it.split(" ") }
    .map { it[0].toShape() to it[1].toResult() }
    .sumOf { (opponentShape, result) -> result.points + opponentShape.getShapeFor(result).points }

sealed class Shape(val points: Int) {
    object Rock : Shape(1)
    object Paper : Shape(2)
    object Scissors : Shape(3)

    fun fight(opponent: Shape): Result = if (this > opponent) Win else if (this < opponent) Lose else Draw

    operator fun compareTo(other: Shape): Int = when (this) {
        Rock -> when (other) {
            Rock -> 0
            Paper -> -1
            Scissors -> 1
        }
        Paper -> when (other) {
            Rock -> 1
            Paper -> 0
            Scissors -> -1
        }
        Scissors -> when (other) {
            Rock -> -1
            Paper -> 1
            Scissors -> 0
        }
    }

    fun getShapeFor(result: Result): Shape = when (result) {
        Win -> values().first { it > this }
        Lose -> values().first { it < this }
        Draw -> this
    }

    companion object {
        fun values(): Array<Shape> = arrayOf(Rock, Paper, Scissors)

        fun String.toShape(): Shape = when (this) {
            "A", "X" -> Rock
            "B", "Y" -> Paper
            "C", "Z" -> Scissors
            else -> throw IllegalArgumentException("Unknown shape: $this")
        }
    }
}

sealed class Result(val points: Int) {
    object Win : Result(6)
    object Draw : Result(3)
    object Lose : Result(0)

    companion object {
        fun values(): Array<Result> = arrayOf(Win, Draw, Lose)

        fun String.toResult(): Result = when (this) {
            "X" -> Lose
            "Y" -> Draw
            "Z" -> Win
            else -> throw IllegalArgumentException("No object Result.$this")
        }
    }
}