package codewars.strings

/**
 * https://www.codewars.com/kata/550554fd08b86f84fe000a58
 */

private class WhichAreIn {
    fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
        val result = ArrayList<String>()
        for (candidate in array1)
            for (str in array2)
                if (candidate in str)
                    result.add(candidate)
        return result.toSet().sorted().toTypedArray()
    }
}
