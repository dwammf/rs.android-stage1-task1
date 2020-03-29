package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var cntChange = 0
        for (i in 0 until n / 2)
            if (digitString[i] != digitString[n - i - 1])
                cntChange++
        if (cntChange > k) return (-1).toString()
        var cntLeft = k
        var digitArray: CharArray = digitString.toCharArray()
        for (i in 0 until n / 2)
        if (digitString[i] != digitString[n - i - 1]) {
            if (cntLeft > cntChange){
                digitArray[i] = '9'
                digitArray[n-i-1] = '9'
                cntLeft -= 2
                cntChange--
            } else {
                if (digitString[i] >= digitString[n - i - 1]){
                    digitArray[n - i - 1] = digitString[i]
                    digitArray[i] = digitString[i]
                } else {
                    digitArray[n - i - 1] = digitString[n - i - 1]
                    digitArray[i] = digitString[n - i - 1]
                }
                cntLeft--
                cntChange--
            }
        } else {
            digitArray[i] = digitString[i]
            digitArray[n - i - 1] = digitString[i]
        }
        return String(digitArray)
    }
}
