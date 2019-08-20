object ScrabbleScore {
    fun scoreWord(input: String) : Int {
        return input.map {
            when {
                Regex("[AEIOULNRST]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 1
                Regex("[DG]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 1
                Regex("[BCMP]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 1
                Regex("[FHVWY]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 1
                Regex("[K]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 1
                Regex("[JX]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 1
                Regex("[QZ]", RegexOption.IGNORE_CASE).matches(it.toString()) -> 1
                else -> 0
            }
        }.sum()
    }
}