import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(currentDateTime: LocalDateTime) {
    constructor(currentDate: LocalDate) : this(currentDate.atStartOfDay())

    val date: LocalDateTime = currentDateTime.plusSeconds(1_000_000_000)
}