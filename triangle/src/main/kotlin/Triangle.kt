class Triangle(private val s1: Double, private val s2: Double, private val s3: Double) {
    constructor(i1: Int, i2: Int, i3: Int)  : this(i1.toDouble(), i2.toDouble(), i3.toDouble())

    private val uniqueSides : Int = listOf(s1, s2, s3).distinct().size

    val isDegenerate: Boolean =
        (s1 != 0.0 && s2 != 0.0 && s3 != 0.0) &&
        (s1 + s2 == s3 || s1 + s3 == s2 || s2 + s3 == s1)

    val isEquilateral: Boolean = isTriangle() && uniqueSides == 1

    val isIsosceles: Boolean = isTriangle() && uniqueSides <= 2

    val isScalene: Boolean = isTriangle() && uniqueSides == 3

    private fun isTriangle() : Boolean {
        if (!isDegenerate) {
            require((s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1))
        }
        return true
    }
}
