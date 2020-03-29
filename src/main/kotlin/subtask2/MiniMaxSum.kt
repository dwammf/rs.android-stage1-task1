package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val sortArray = input.sortedArray()
        val minSum = sortArray.dropLast(1).sum()
        val maxSum = sortArray.drop(1).sum()

        return arrayOf(minSum, maxSum).toIntArray()
    }
}
