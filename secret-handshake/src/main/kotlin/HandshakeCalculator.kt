object HandshakeCalculator {
    fun calculateHandshake(decimal: Int) : List<Signal> {
        val secrets = Signal.values().filter { decimal and it.code == it.code }
        return (if (decimal and 16 == 16) secrets.reversed() else secrets)
    }
}