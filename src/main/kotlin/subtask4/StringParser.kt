package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var substrings = emptyArray<String>().toMutableList()
        val openedBracketsList = listOf<Char>('[', '(', '<')
        val closedBracketsList = listOf<Char>(']', ')', '>')

        for (i in inputString.indices)
            if (openedBracketsList.contains(inputString[i])){
                val currOpenedBracket = inputString[i]
                val currClosedBracket = closedBracketsList[openedBracketsList.indexOf(inputString[i])]
                var j = i + 1
                var currSubstring = ""
                var closedBracketFound = false
                while (j < inputString.length){
                    if (inputString[j] == currClosedBracket){
                        substrings.add(currSubstring)
                        currSubstring += inputString[j].toString()
                        closedBracketFound = true
                    } else
                    if (inputString[j] == currOpenedBracket){
                        if (closedBracketFound) break
                        else currSubstring += inputString[j].toString()
                    }
                    else currSubstring += inputString[j].toString()
                    j++
                }
            }

        return substrings.toTypedArray()
    }
}
