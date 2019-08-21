import kotlin.math.pow

class Squares(private val n: Int) {
    fun squareOfSum() : Int = (1..n).sum().toFloat().pow(2).toInt()

    fun sumOfSquares() : Int = (1..n).sumBy { it * it }

    fun difference() = squareOfSum() - sumOfSquares()
}