fun main() {
    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}

fun part1(input: List<String>): Int = input
    .map { it.toIntOrNull() }
    .fold(0 to 0) { (maxCals, elfCals), lineCals ->
    if (lineCals == null) {
        (elfCals.takeIf { it > maxCals } ?: maxCals) to 0
    } else {
        maxCals to elfCals + lineCals
    }
}.first

fun part2(input: List<String>): Int {
    return input.size
}