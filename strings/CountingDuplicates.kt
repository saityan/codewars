package codewars.strings

/**
 * https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
 */

private class CountingDuplicates {
    fun duplicateCount(text: String): Int = text.toLowerCase().groupingBy { it }.eachCount().filterValues { it > 1 }.count()
}
