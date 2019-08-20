object ScrabbleScore {
    fun scoreWord(input: String) : Int {
        return input.map {
            when {
                Regex("[AEIOULNRST]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 1
                Regex("[DG]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 2
                Regex("[BCMP]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 3
                Regex("[FHVWY]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 4
                Regex("[K]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 5
                Regex("[JX]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 8
                Regex("[QZ]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 10
                else -> 0
            }
        }.sum()
    }
}