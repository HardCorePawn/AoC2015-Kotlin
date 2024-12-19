fun main() {
    fun part1(input: String): Int {
        var floor = 0
        input.forEach {
            when (it) {
                '(' -> floor++
                ')' -> floor--
            }
        }
        return floor
    }

    fun part2(input: String): Int {
        var floor = 0
        input.forEachIndexed { index, c ->
            when (c) {
                '(' -> floor++
                ')' -> floor--
            }
            if (floor == -1) return index + 1
        }
        return -1
    }

    // Test if implementation meets criteria from the description, like:
    check(part1("(())") == 0)
    check(part1("()()") == 0)
    check(part1("(((") == 3)
    check(part1("(()(()(") == 3)
    check(part1("))(((((") == 3)
    check(part1("())") == -1)
    check(part1("))(") == -1)
    check(part1(")))") == -3)
    check(part1(")())())") == -3)

    check(part2(")") == 1)
    check(part2("()())") == 5)

    // Or read a large test input from the `src/Day01_test.txt` file:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input[0]).println()
    part2(input[0]).println()
}
