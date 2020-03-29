package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = sadArray.toMutableList()
        var i = 1

        while (true) {
            if (i >= happyArray.size - 1 || happyArray.size <= 2) break
            if (i < 1) i = 1

            if (happyArray[i - 1] + happyArray[i + 1] < happyArray[i]) {
                happyArray.removeAt(i)
                i -= 2
            }
            i++
        }

        return happyArray.toIntArray()
    }
}
