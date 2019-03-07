
import ConsoleColors.BRIGHT_GREEN
import ConsoleColors.BRIGHT_RED
import ConsoleColors.BRIGHT_WHITE
import ConsoleColors.COLOR_RESET

class SuiteReport {
    private var successfulTestCount = 0
    private var failedTestCount = 0
    private var totalTestCount = 0

    fun recordSuccessful() {
        successfulTestCount++
        totalTestCount++
    }

    fun recordFailed() {
        failedTestCount++
        totalTestCount++
    }

    private fun resultType() = if (totalTestCount == successfulTestCount) "${BRIGHT_GREEN}SUCCESS$COLOR_RESET" else "${BRIGHT_RED}FAILURE$COLOR_RESET"

    fun printReport() {
        println("\nResults: ${resultType()} ($BRIGHT_WHITE$totalTestCount$COLOR_RESET tests, $BRIGHT_GREEN$successfulTestCount$COLOR_RESET successes, $BRIGHT_RED$failedTestCount$COLOR_RESET failures)")
    }
}
