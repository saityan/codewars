package codewars.arrays

/**
 * https://www.codewars.com/kata/5ce399e0047a45001c853c2b/
 */

private class SumsOfParts {
    fun sumParts(ls: IntArray): IntArray = ls.runningFold(ls.sum()) { acc, value -> acc - value }.toIntArray()
}
