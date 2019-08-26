import java.lang.IllegalArgumentException

class Triangle(private val s1: Double, private val s2: Double, private val s3: Double) {
    constructor(i1: Int, i2: Int, i3: Int)  : this(i1.toDouble(), i2.toDouble(), i3.toDouble())

    val isEquilateral: Boolean = isTriangle() && s1 == s2 && s2 == s3 && s1 == s3

    val isIsosceles: Boolean = isTriangle() && (s1 == s2 || s2 == s3 || s1 == s3)

    val isScalene: Boolean = isTriangle() && !isEquilateral && !isIsosceles

    val isDegenerate: Boolean = isTriangle() &&  (s1 + s2 == s3 || s1 + s3 == s2 || s2 + s3 == s1)

    private fun isTriangle() : Boolean =
        when {
            s1 == 0.0 || s2 == 0.0|| s3 == 0.0 -> throw IllegalArgumentException("All sides must have length > 0")
            s1 + s2 < s3 || s1 + s3 < s2 || s2 + s3 < s1 -> throw IllegalArgumentException("Sum of 2 sides must be greater than or equal to third side")
            else -> true
        }
}
