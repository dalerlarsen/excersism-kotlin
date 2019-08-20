class Year(private val year: Int) {
    val isLeap: Boolean
        get() = ((year.rem(4) == 0 && year.rem(100) != 0)
            || (year.rem(4) == 0 && year.rem(400) == 0))
}
