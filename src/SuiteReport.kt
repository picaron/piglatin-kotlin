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

    private fun resultType() = if (totalTestCount == successfulTestCount) green("SUCCESS") else red("FAILURE")

    fun printReport() {
        println("\nResults: ${resultType()} (${white(totalTestCount)} tests, ${green(successfulTestCount)} successes, ${red(failedTestCount)} failures)")
    }
}
