import java.lang.IllegalArgumentException

object Hamming {
    fun compute(s1: String, s2: String): Int {
        if (s1.length != s2.length) {
            throw IllegalArgumentException("left and right strands must be of equal length.")
        }
        return s1.foldIndexed(0) { index, acc, c ->
            if (c != s2[index]) acc + 1 else acc
        }
    }
}
