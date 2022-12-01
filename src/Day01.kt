fun main() {
    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}

fun part1(input: List<String>): Int = input
    .ensureBlankLastItem()
    .map { it.toIntOrNull() }
    .fold(0 to 0) { (maxCals, elfCals), lineCals ->
        if (lineCals == null) {
            (elfCals.takeIf { it > maxCals } ?: maxCals) to 0
        } else {
            maxCals to elfCals + lineCals
        }
    }.first

fun part2(input: List<String>): Int = input
    .ensureBlankLastItem()
    .map { it.toIntOrNull() }
    .fold(Triple(0, 0, 0) to 0) { (maxCals, elfCals), lineCals ->
        if (lineCals == null) {
            (if (elfCals >= maxCals.first) {
                Triple(elfCals, maxCals.first, maxCals.second)
            } else if (elfCals >= maxCals.second) {
                Triple(maxCals.first, elfCals, maxCals.second)
            } else if (elfCals >= maxCals.third) {
                Triple(maxCals.first, maxCals.second, elfCals)
            } else {
                maxCals
            }) to 0
        } else {
            maxCals to elfCals + lineCals
        }
    }.first.let {
        it.first + it.second + it.third
    }