package codewars

class MaximumSubarraysSum {
    fun maxSequence(arr: List<Int>): Int {

        if (arr.isEmpty())
            return 0

        if (arr.size == 1 && arr[0] <= 0) {
            return 0
        } else if (arr.size == 1)
            return arr[0]

        val map = Array(arr.size) {
            IntArray(arr.size)
        }

        var maxSum = 0
        for (i in arr.indices) {
            map[i][i] = arr[i]
            if (i == arr.lastIndex) {
                if (maxSum < map[i][i])
                    maxSum = map[i][i]
                break
            }
            for (j in i until arr.lastIndex) {
                map[i][j + 1] = map[i][j] + arr[j + 1]
                if (maxSum < map[i][j + 1])
                    maxSum = map[i][j + 1]
            }
        }

        return maxSum
    }
}
