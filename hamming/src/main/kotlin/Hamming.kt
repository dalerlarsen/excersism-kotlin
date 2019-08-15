import java.lang.IllegalArgumentException

class Hamming {
    companion object {
        fun compute(s1: String, s2: String) : Int {
            if (s1.length != s2.length) {
                throw IllegalArgumentException("left and right strands must be of equal length.")
            }
            var numDifferent = 0
            s1.forEachIndexed { index, c1 ->
                if (c1 != s2[index]) {
                    numDifferent++
                }
            }
            return numDifferent
        }
    }
}
