import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

class Gigasecond(currentDateTime: LocalDateTime) {
    constructor(currentDate: LocalDate) : this(currentDate.atStartOfDay())

//    val date: LocalDateTime = currentDateTime.plus(1000000000, ChronoUnit.SECONDS)
    val date: LocalDateTime = currentDateTime.plusSeconds(1_000_000_000)
}